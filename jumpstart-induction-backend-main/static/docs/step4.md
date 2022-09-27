# Step 4
## Please sir, may I have some more products?
Whilst the ability to get a specific product is useful, it isn't entirely helpful for our end users. What would be useful
would be the ability to search for many products.

For this step we're not going to do a step-by-step guide, instead we'll just give you the requirements and let you get to it.
Normally these requirements would be written out in a ticket for you to work from but instead...

Wait, what's that down there? Oh, would you look at that! 
It's a ticket covering the requirements of the search feature **_and_** it's got your name on it!

### [LLB-04] Add ability to search for products
As a user, I want to search for products with a search term, so that I can find specific products that I want

**Definition of Done**
 - When given a search term, the endpoint returns a list of all products that contain the term in its product name
 - The endpoint follows the pattern `/search?term={searchTerm}`

## Hints & Tips
Below are a number of hints aimed to guide you towards a working solution, but unlike the other steps will stop short
of providing an actual code solution. Use as many or as few as you want and do reach out if you get stuck.

**The first hint is on us:**

There is no new information you need to complete this step. You can complete this using the knowledge gained from steps 2 to 3.

<details>
<summary>Hint: Getting products</summary>

Much like accessing the ProductService from the ProductController, you can also access one service from another in the exact same way!
</details>

<details>
<summary>Hint: What's the ? for?</summary>

The `?` in the endpoint represents a [query/request parameter](https://en.wikipedia.org/wiki/Query_string). 
These are optional key-value pairs that you can add to the base url to pass more information through. 
They can be accessed in spring the same way path variables can.
</details>

<details>
<summary>Hint: Matching term & product names</summary>

In Java, look at the `contains` method of a string.
</details>
