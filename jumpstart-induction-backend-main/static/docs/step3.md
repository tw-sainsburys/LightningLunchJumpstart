# Step 3
## One Product please
Now that we have loaded our application with products, it's time that we did something with them!
Let's utilise the code we've already written to now get a product from our application.

### The Controller
As we have covered already, to interact with our application via an endpoint we need to utilise a controller.
For this example, let's assume there will be an endpoint to get the product 1234567 like this:
`http:localhost:8000/product/1234567`

To begin with let's create a ProductController and an endpoint that takes in a productId and returns it to the user.

(Note: You can make a new controller or repurpose the TestController we made earlier)
<details>
    <summary>ProductController.java</summary>

```java
@RestController
@RequestMapping("product")
public class ProductController {

   @GetMapping("{productId}")
   public ResponseEntity<?> getProduct(@PathVariable("productId") String productId) {
      return ResponseEntity.ok(productId);
   }
}
```
</details>

### Making it useful
Obviously this doesn't count as getting a product. In order for us to do that we need to add
some functionality to the ProductService we made in the last step.

Going back to that class, let's add a method to get a product by a given productId.
```java
public Product getProduct(String productId) {

}
```

Inside this method we need to, unsurprisingly, return the product object from our list of products that matches the ID we've provided.
There are many ways that this can be done, in this project we'll cover standard iteration and using java streams. Feel free
to follow whatever path you feel most comfortable with. Come back to this once you have a working `getProduct` method.

[Finding a product using iteration](step3-iteration.md)

[Finding a product using streams](step3-streams.md)

### Welcome back!
Now that we have a method to find a product, the last thing left is to put everything together.
To do this we need to have access the ProductService from the ProductController, so we will pass in the ProductService as a constructor argument to the ProductController. This looks like:
```java
private final ProductService productService;

public ProductsController(ProductService productService){
    this.productService = productService;
}
```
If you want to know why this will work then please feel free to [read more](https://www.baeldung.com/constructor-injection-in-spring) but for this project just consider it a bit of Spring Magic™

Finally, we can now update our `getProduct` method with the method we've just made in the ProductService. All together it should look like:
```java
@RestController
@RequestMapping("products")
public class ProductsController {

   private final ProductService productService;

   public ProductsController(ProductService productService){
      this.productService = productService;
   }

   @GetMapping("{productId}")
   public ResponseEntity<?> getProductDetails(@PathVariable("productId") String productId) {
      return ResponseEntity.ok(productService.getProduct(productId));
   }
}
```

### What do you mean there's a problem?
What? A problem with our code? Impossible, it’s the best code that’s ever been written! Your IDE might have given the game away
but as we throw an exception in our ProductService, we need to handle it in the ProductController otherwise we will get crashes.

To handle the exception, we will once again utilise a try catch block to return something else when we encounter our ProductNotFoundException.

What do we return if we encounter this error? If we consult the [error status codes](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes#4xx_client_errors), we see an appropriate
code to return here would be a 404 error, as a resource could not be found. We can also add some more content to the response,
for example a message. At the end, our final method looks like:
<details>
<summary>ProductController.getProduct</summary>

```java
@GetMapping("{productId}")
public ResponseEntity<?> getProduct(@PathVariable("productId") String productId) {
    try {
        return ResponseEntity.ok(productService.getProduct(productId));
    } catch (ProductNotFoundException e) {
        return ResponseEntity.status(404).body(productId + " not found");
    }
}
```
</details>

### Give it a whirl!
Now that everything works, let's give it a full test. 
Here are some product IDs for you to test with, one of them does not exist, hopefully everything we've done should handle this well.
- 7267597
- 7994071
- 7797628
- 3547824
- 4055334