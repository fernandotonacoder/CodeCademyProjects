#Course: [LEARN INTERMEDIATE JAVA](https://www.codecademy.com/learn/learn-intermediate-java)
From [CodeCademy.com](https://www.codecademy.com/profiles/fernandotona)

**Subject: NESTED CLASSES.**

##Project: [Ice Cream Inventory](https://www.codecademy.com/courses/learn-intermediate-java/projects/java-nested-classes-project)

Congratulations, you have just landed a new contract to build out an application for a new local ice cream shop in town! They need a program that will help them sort out and keep track of their inventory of ice cream, shakes, slushies, and smoothies. This Java program will have to keep count of how many of each product the shop sells.

###**LIST OF TASKS**
####**Create a nested class named NonVegan.**

**1.** Create a nested class and name it `NonVegan`. Add the following variables:

`int iceCreamCount;`

`int shakeCount;`

`int totalCount;`

**2.** Write a method within the nested class, named `increaseCount()`

Write an `if` statement to increase the count of `iceCreamCount` and `shakeCount`.

Use shadowing to increase the count of the variable `totalCount` both within the `NonVegan` class, and the variable `totalCount` in the enclosing class `ShopItems`.

####**Create a nested class named Vegan.**

**3.** For this task you will be repeating Task 1 for a class named `Vegan`. Include the following variables in the class:

`int smoothieCount;`

`int slushieCount;`

`int totalCount;`

**4.** Write a method within the nested class, named `increaseCount();`

Write an if-statement to increase the count of `smoothieCount` and `slushieCount`.

Use shadowing to increase the count of the variable `totalCount` both within the `Vegan` class, and the variable `totalCount` in the enclosing class `ShopItems`.

####**Incorporate your classes into the Main method of the IceCreamShop class.**

**5.** Create an object of the outer class `ShopItems`. Next, create an object of the class `NonVegan`, and an object of the class `Vegan`.

**6.** Complete the `if`-statement within the `while` loop in the `main` method. Call the function `increaseCount()` within each `if` or `else if` block based on the type of order and whether is is vegan or non-vegan.

**7.** Ouside of the `while` loop, near the end of the method, print the following three statements:

`Thank you for your order! Today we have sold # orders of sweetness!`

where # is the total number of items sold.

`# items have been ice cream and shakes.`

where # is the total number of non-vegan items sold.

`# items have been smoothies and slushies.`

where # is the total number of vegan items sold.

####**Run your program**
**8.** Compile your program.
**9.** Run your program.