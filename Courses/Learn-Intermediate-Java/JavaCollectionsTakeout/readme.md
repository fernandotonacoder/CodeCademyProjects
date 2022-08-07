#Course: [LEARN INTERMEDIATE JAVA](https://www.codecademy.com/learn/learn-intermediate-java)
From CodeCademy.com
####Subject: GENERICS & COLLECTIONS

##[Project: Let's Get Takeout!](https://www.codecademy.com/courses/learn-intermediate-java/projects/intermediate-java-collections-takeout)
Hope you’re hungry! Using the collections framework, generics, and the rest of your knowledge of Java we’ll create a take-out system. We’ll define classes, interfaces, and methods (generic and non-generic) needed to represent our system and perform our take-out logic with the help of Java collections.

###LIST OF TASKS:

####Core Data Types
**1.** Let’s start by creating a `class` that will represent a customer in the take-out system.

In **Customer.java**, create a `Customer` class with the following `private` fields:

- A `String` called `name`.
- An `int` called `money`.

Be sure to create `public` getters and setters for all fields and a constructor with `name` and `money` parameters that initializes their field counterparts.


**2.** Next let’s create an `interface` that will represent an item in our take-out system that has a numeric price.

In **PricedItem.java**, create a `PricedItem` interface with a `T` type parameter that is upper bounded by `Number`. Define the abstract methods:

- `getPrice()` with a `T` return type and no parameters.
- `setPrice()` that returns no value and has a `T` type parameter called `price`.

**3.** Let’s create another `class` that will represent a priced food item in our take-out system.

In **Food.java**, create a `Food` class that implements an `Integer` type PricedItem with the following `private` fields:

- A `String` called `name`.
- A `String` called `description`.
- An `int` called `price`.

Be sure to create a constructor with `name`, `description`, and `price` parameters that initialize their field counterparts.

**4.** Let’s complete `Food` by overriding and implementing a couple of methods.

In **Food.java**, `Override` and implement the abstract methods `setPrice()` and `getPrice()` of `PricedItem`. Let’s also `Override` `toString()` to provide a description of a `Food` object that will be displayed on our menu.

An example `Food` description would look like:

`Enjoy Tacos: Yummy steak tacos    Cost: $15`


### Shopping Bag
**5.** In order to “take” our take-out food home we need a shopping bag.

**In ShoppingBag.java**, create a generic `ShoppingBag` class with a `T` type parameter upper bounded by an `Integer` type `PricedItem`.

`ShoppingBag` should have a `private` field called `shoppingBag`, which is a `Map` from a `T` to an `Integer`. `ShoppingBag` should also have a no argument constructor that initializes `shoppingBag` to an empty `Map`.


**6.** We’re now able create `ShoppingBag` objects but we need to add items to our bag and keep track of how many of each item we have.

In `ShoppingBag`, create a method called `addItem()` that returns no value and has a `T` type parameter called `item`. We should add `item` to `shoppingBag` and increment the mapping of `item` or initialize its mapping to `1` if it’s not already a key in `shoppingBag`.

**7.** When it’s time to pay for our take-out we need to be able to get the total price of all the items in the shopping bag.

In `ShoppingBag`, create a method called `getTotalPrice()` that has no arguments and returns an `int` value. This method should iterate through all the entries in `shoppingBag` and accumulates the total price of each item with respect to the quantity of that item.

### Menu
**8.** In order for us to buy some food we need to first see a menu, let’s create one!

In **FoodMenu.java**, create a `FoodMenu` class with a `private` field called `menu` which is a `List` of `Food`. Create a no argument constructor that initializes `menu` with some `Food` objects (try creating 3).


**9.** We’ll need to be able to display our menu to customers, let’s do that by implementing a custom `toString()` method.

In **FoodMenu.java**, `Override` `toString()` to return a `String` that contains all `Food` objects in `menu` where each `Food` object has an identifying integer index so customers can easily order food.

An example `toString()` method would return a `String` that looks like this:

`1. Enjoy Tacos: Yummy steak tacos    Cost: $15 `
`2. Enjoy Dumplings: Delicious steamed dumplings    Cost: 10`
`3. Ramen: Hot pork ramen    Cost: 12`

**10.** When customers use our menu they’ll need to pick a food item using it’s item number.

In `FoodMenu`, create a method `getFood()` with an `int` parameter called `index` and a `Food` return type. This method should attempt to get the `Food` object at `index` in `menu` and return it or return `null` if `index` is out of bounds.

Note that a `List` has 0 based indexing but our `menu` item numbers will start from **1**.

**11.** When using our menu we’ll often want to quickly know what the lowest cost food item is to get a bang for our buck.

In `FoodMenu`, create a method `getLowestCostFood()` with no parameters and a return type of `Food`. This method should return the `Food` object in `menu` with the smallest `price`.


HINT:

We can iterate over a `List` using an enhanced `for-loop` this way:

`for(String myString: myStrings) { System.out.println(myString) }`

### Simulation Plumbing

**12.** We’ll need to be able to take in user input in our take-out system in order for customers to order food. We’ll be working with `int` type user input to drive various prompts in our take-out system. Let’s create a generic user input method to keep our code DRY and reusable.

In **IntUserInputRetriever.java**, create a generic `interface` called `IntUserInputRetriever` with a `T` type parameter. `IntUserInputRetriever` should define an abstract method `produceOutputOnIntUserInput()` which has a single `int` type parameter called `selection`, returns a `T` type object, and may throw an `IllegalArgumentException` if `selection` is not valid.

**13.** Let’s create your take-out system that will be able to get user input to allow customers to add food to their bags and checkout when they are ready (or have run out money).

In **TakeOutSimulator.java**, create a `TakeOutSimulator` class with the following `private` fields:

- `Customer` type called `customer`.
- `FoodMenu` type called `menu`.
- `Scanner` type called `input`.
Be sure to add a constructor with `Customer` and `Scanner` parameters that initialize customer and input respectively. Be sure to also initialize `menu`.

**14.** We’ll need to be able to prompt users for their input in various places to drive the take-out system. Let’s create a generic method that will prompt users for an `int` input and perform some operation on that input.

In `TakeOutSimulator`, create a generic `private` method called `getOutputOnIntInput()` that has a `String` parameter called `userInputPrompt`, an `IntUserInputRetriever` parameter called `intUserInputRetriever`, and returns a `T` type reference.

`getOutputOnIntInput()` should loop and on each iteration perform the following tasks:

- Display `userInputPrompt`.
- Get the user input and if an `int` was provided, retrieve it and attempt to call `produceOutputOnIntUserInput()` of `intUserInputRetriever` with the retrieved `int` user input as an argument and return the result.
- If an `IllegalArgumentException` was caught calling `produceOutputOnIntUserInput()`, display a message telling the user their `int` input was not valid.
- If the user did not provide an `int` type, display a message telling the user that input needs to be an integer and move `input` to the next token.

Example prompts look like this:

`5 is not a valid input. Try Again!`

``Input needs to be an `int` type.``

**15.** Let’s create a way for users to exit the take-out system gracefully.

In `TakeOutSimulator`, create a method called `shouldSimulate()` with no parameters and returning a `boolean` value. This method should:

- Create a `String` called `userPrompt` that contains a message to prompt users for an input of `1` (proceed with simulation) or `0` (stop simulation).
- Create an implementation of `IntUserInputRetreiver` that return `true` if `selection` is `1` and the `customer` has enough money to buy the lowest cost food item and `false` if `selection` is `0` or the customer does not have enough money. This method should `throw` an `IllegalArgumentException` if `selection` is not `0` or `1`.
- Call `getOutputOnIntUserInput()` and passing `userPrompt` and the created implementation of `IntUserInputRetriever`.
Example prompts look like this:

`Enter 1 to CONTINUE simulation or 0 to EXIT program: 1`

`You don't have enough money to continue shopping :( - ending simulation...`

**16.** Let’s create a way for the take-out system to retrieve a user menu selection.

In `TakeOutSimulator`, create a method called `getMenuSelection()` with no parameters and returning a `Food` object. This method should create:

- Create a `String` called `userPrompt` that contains a message to prompt users for an `int` input of one of the food items displayed by `menu`.
- Create an implementation of `IntUserInputRetreiver` that gets the food item using `selection` from `menu` and returns it if its not `null`. This implementation should throw an `IllegalArgumentException` if the returned value from `menu` is `null`.
- Call `getOutputOnIntUserInput()` and passing `userPrompt` and the created implementation of `IntUserInputRetriever`.
An example prompt looks like this:

`Today's Menu Options!`

`1. Enjoy Tacos: Yummy steak tacos    Cost: $15`

`2. Enjoy Dumplings: Delicious steamed dumplings    Cost: 10`

`3. Ramen: Hot pork ramen    Cost: 12`

`   Choose a menu item!: 1`


**17.** Let’s create a way to notify the take-out system that a user is ready to checkout.

In `TakeOutSimulator`, create a method called `isStillOrderingFood()` with no parameters and returning a `boolean` value. This method should create:

- Create a `String` called `userPrompt` that contains a message to prompt users for an input of `1` (continue shopping) or `0` (checkout).
- Create an implementation of `IntUserInputRetreiver` that return `true` if `selection` is `1` and `false` if `selection` is `0`. This method should `throw` an `IllegalArgumentException` if `selection` is not `0` or `1`.
- Call `getOutputOnIntUserInput()` and passing `userPrompt` and the created implementation of `IntUserInputRetriever`.

Example prompts look like this:

`Enter 1 to CONTINUE shopping or 0 to CHECKOUT: 1`


### Ordering Food

**18.** Once the customer is finished ordering, we’ll need a way to process their payment.

In `TakeOutSimulator`, create a method called `checkoutCustomer()` with a single `Food` type `ShoppingBag` parameter called `shoppingBag` that returns no value. This method should:

- Inform the customer that payment is processing.
- Calculate the customers remaining money after paying for the total cost of `Food` in `shoppingBag`.
- Update customer’s money with their remaining money.
- Inform the customer of the updated money they have left.
- Display a friendly message telling our customer to enjoy their meal.

Example messages look like this:

`Processing payment...`
`Your remaining money: $25`
`Thank you and enjoy your food!`

**19.** Let’s create an entry point for the take-out system.

In `TakeOutSimulator`, create a method called `takeOutPrompt()` with no parameters and no return value. This method should create an instance of `ShoppingBag` of type `Food` called `shoppingBag`, a variable to keep track of the `customers` money left called `customerMoneyLeft`, and should loop until the customer is no longer ordering food and perform the following tasks:

- Display a message telling the customer how much money they have left.
- Prompt the user for a menu selection and store the selected `Food` object.
- Check if the user has enough money left to purchase the selected `Food` object. If they do subtract its value from `customerMoneyLeft` and add it to `shoppingBag`.
- If the user does not have enough money, display message telling the user they don’t have enough money and they should pick another item or checkout.
- Ask the user if they are still ordering food.

Once the `customer` is done ordering food checkout the `customer`.

Example prompt looks like this:

`You have $10 left to spend`
`Today's Menu Options!`
`1. Enjoy Tacos: Yummy steak tacos    Cost: $15`
`2. Enjoy Dumplings: Delicious steamed dumplings    Cost: 10`
`3. Ramen: Hot pork ramen    Cost: 12`
 `Choose a menu item!: 1`

`Oops! Looks like you don't have enough for that. Choose another item or checkout.`

**20.** Let’s create a way for the take-out system to start it’s dialogue so customers can order food.

In `TakeOutSimulator`, create a `public` method called `startTakeOutSimulator()` that has no parameters and return no value. This method should display a fun intro message to the customer and loop until the customer wants to exit the simulation.

During each iteration of the simulation we should display a customer greeting and starting the take-out prompt.

Example intro and greeting message:

`Hello, welcome to my restaurant!`
`Welcome Mike!`

### Let's get some food!

**21.** Let’s start up the simulator so we can get some food!

In `main()` from **Main.java**, create an instance of scanner called `input`. Use `input` to get a `String` from the user and store it in `customerName`. Let’s also try and get an integer amount of starting money and store it in an `int` called `money` (if a valid integer isn’t provided display a message).

Let’s instantiate a `Customer` with `customerName` and `money` as arguments and store it in variable called `customer`. Let’s also create an instance of `TakeOutSimulator` called `takeOutSimulator` passing `customer` and `input` as arguments.

We can now start our simulation by calling `startTakeOutSimlator()`.

Enjoy the food!