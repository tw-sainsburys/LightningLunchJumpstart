# The End

## Congratulations!
What a journey you have taken, from nothing we now have a working endpoint that can:
- Return a single product
- Return all products containing a search term

Alright it's not exactly going to set the world on fire but it's all about the journey and not the destination.

This is all you need to proceed with the front end portion of the project, so you are free to begin that if you so wish.

## B-B-B-BONUS ROUND! \*air horn noise\*
If you fancied a real challenge, here are a few things you work on as bonus challenges using the knowledge you've gained so far 
(and maybe a little bit of Google for good measure).

Note: The front end project is based off your application at the end of step 4. Any additions you make to your code
might impact your ability to follow those steps

### Search... but fancier
In the real world, search result pages don't often just throw everything on the screen at once. The good ones add a little
bit of pizzazz when showing their results. 
Think of Google (other search engines are available, but you're not really using Bing be honest), some things you might notice
on their results page include how many total results there are, but also the ability to have pages of results instead of throwing
them all onto a single page (pagination).

In the real world, this information tends to come in the form of a `meta` object, which contains all sorts of data
about the data (hence the term metadata).

For this extension task, try creating a meta object and see how you can produce a fancier search using such information.
If you wanted a real challenge, try and figure out pagination.

### Please place your item in the bagging area
We have a lovely way to search for products, but nothing to do with them. We could fix that by having some sort of basket 
that users can add items into.
Here's one of those "tickets" that you might see for such a feature to give you some inspiration.

### [LLB-05] Add basket functionality to the application
As a user, I want to be able to see my basket, so that I view the products I am going to buy.

As a user, I want to be able to add a product to my basket, so that I can buy the specific products that I want

**Definition of Done**
- When requesting my basket, the application returns a basket object that contains all products in it and the total cost
- When given a product to the add endpoint, the application increases the quantity of that product in the basket by one

A free hint for you. We might need to consider using a different REST call aside from GET.

### Embrace change
There's a new kid on the block that's stepping into Java's territory, Kotlin.

It has all the cool bells and whistles whilst removing a lot of the boilerplate needed for Java development. It is a language
that is also built upon the JVM, which means it is entirely interoperable with Java.

We're not going to cover anything about Kotlin as a language here, so all of this would need to be done via your
own research, but for this final extension task try and rewrite this entire backend application using Kotlin.


For any of these extension tasks please do reach out to us if you want any help. We are more than happy to help you!
