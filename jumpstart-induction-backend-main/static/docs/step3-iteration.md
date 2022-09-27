### Iteration
This is starting to sound like one of those technical interview questions, but given an unordered list of products, how do we 
find the first product that has a given ID?

Have a go at implementing this into our `getProduct` method or follow along with the steps below.

There are many different ways in Java that you can iterate over a list, for this example we'll use the good old fashioned
`for` loop but feel free to use your favourite iteration method.

A for loop that iterates over each element in a list looks like so:
```java
for (int i = 0; i < products.size(); i++){
    
}
```
This loop will store it's counter as the variable `i`, it starts at 0 and will loop whilst `i` is less than the number of products,
incrementing by 1 each time it loops.

Inside the loop, we simply need to check that the ID current product matches the one we're looking for.
We can get a product at the index `i` using the `get(index)` method. If there is a match, we're going to immediately return 
said product as there is no need to continue with the iteration. All together this looks like:
```java
public Product getProduct(String productId) {
    for (int i=0; i < products.size(); i++) {
        if (products.get(i).getProductId().equals(productId)) {
            return products.get(i);
        }
    }
}
```
Note: We use `equals()` here instead of `==` as in Java a String is an object and thus `==` will only be a 
reference comparison rather than a content comparison.

### Dude where's my product?
This iteration works perfectly fine for when we know there is a match, but what if there isn't? Your IDE might have given the
game away a little, but we should look to do something if it can't find it.

There are many approaches you can take to do this, but here we'll decide to throw an exception. If you remember from [step 1](step1.md)
we learned that `we can use exceptions to gracefully handle failure scenarios rather than crashing and burning`.

You can name it what you deem appropriate, but we'll call ours the `ProductNotFoundException` 
as this will be thrown when we can't find a product (thank you captain obvious).
Add this class to the exception folder you created and make sure it extends the parent Exception class.

```java
public class ProductNotFoundException extends Exception {}
```

Now we have our exception, where and how should we use it? Again have a go at this yourself and read ahead when you feel ready.

If we look back to our for loop, because we return early, if we don't find the product then we've executing code outside of the loop.
This means we can throw our exception immediately after our iteration code. Like so:
```java
public Product getProduct(String productId) throws ProductNotFoundException {
    for (int i=0; i < products.size(); i++) {
        if (products.get(i).getProductId().equals(productId)) {
            return products.get(i);
        }
    }
    throw new ProductNotFoundException();
}
```

Note that once our function throws an exception, we have to define that as part of the method signature.

### Great success?
Now we have a completed ProductService, [let's go back](step3.md) now and hook everything together!

Or, if you wanted to, you could see how this could be done using [streams](step3-streams.md). 