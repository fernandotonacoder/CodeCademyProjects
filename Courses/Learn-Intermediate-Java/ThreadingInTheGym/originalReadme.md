#Course: [LEARN INTERMEDIATE JAVA](https://www.codecademy.com/learn/learn-intermediate-java)
From [CodeCademy.com](https://www.codecademy.com/profiles/fernandotona)

**Subject: THREADING.**

##Project: [Threading in the Gym](https://www.codecademy.com/courses/learn-intermediate-java/projects/threading-in-the-gym)

It’s time to go to the gym and get THREADED!!! 🏋🏼‍♀️🏋🏿💪🏽

In this project, you will be creating a program to represent a gym. We have provided you with some supporting files to build the backbone of the Gym, but you will be doing most of the heavy lifting. Don’t worry, the gym puns will definitely continue. 😉

In this gym, we want our members to all be able to work out at the same time instead of waiting in line outside the gym until the person in front of them is all finished. To solve this problem we will implement a thread for each member so they can all work out concurrently.

Let’s get started!
###**LIST OF TASKS**
####**SUPPORTING FILES**

**1. Review Member.java**

This class represents a member of our gym. When we create a member we will assign them a unique id, essentially just a sequentially increasing integer.

Besides creating a member, this class also creates gym routines for the member through the `.generateRoutine()` method. This method uses an `IntStream` to create the number of exercises equal to the range we provide. As it is set up right now, we have each member doing six exercises each time they go to the gym, you can change this if you’d like, but if you increase it too much the program’s output quickly becomes cumbersome.

The `.performRoutine()` method takes the routine that was returned from `.generateRoutine()` and executes it.

**2. Review Exercise.java**

This class represents an individual exercise. Each exercise consists of three main components:

- An exercise machine
- Some quantity of weights
- A time (duration) to complete the exercise

The constructor of this class creates a random exercise using the enums, `MachineType` and `Weight`, that come from the two other classes.

The last method of the class is an override of `.toString()` which prints back out to the user what exercise and with how much weight the current gym member exercising is performing.

**3. Review MachineType.java**

This `enum` stores the different types of exercise equipment available to our gyms. We’ve added some extra functionality to our enum here such as adding instance variables and a constructor so we can access more user-readable values when we go to print our machine titles.

We also added a static method, `.getRandomEquipment()` that returns a random piece of equipment to be used when we are creating exercise routines. Unfortunately, every day might not be leg day…

**4. Review Weight.java**

This enum contains the weights that are in our gym. We’ve gone with 5, 10, and 25 lbs weights and added a `.getRandomWeight()` method that returns a random weight for our exercise routines.

Looking through the enum you may have also noticed the static variable `numOfWeightsInGym` and also a static block that fills that HashMap with a set number of weights. While this isn’t a part of this project’s main structure, it’s included at the end as a challenge to start thinking about how we can implement other aspects of our Threading lesson, such as synchronized use of shared resources (weights, exercise machines, energy drinks?).

####**STARTING A GYM**

**5.** Navigate back to **Gym.java**, here you will see an empty class waiting for you to build your gym’s foundation, feel free to declutter your IDE by closing the other files if you want, we won’t be making any changes inside of them.

Inside your class, create two instance variables:

- `totalGymMembers`, which should be a `private final int`
- `availableMachines`, which should be a `private Map<MachineType, Integer>`

**6.** Since the `Map` class is part of java.util, you need to add an import statement so your program knows where to look to find the `Map` functionality.

**7.** Create a constructor for `Gym`. It should have two parameters, one for each of the instance variables.

####**OPENING A GYM**

**8.** Create a new public method, `.openForTheDay()`, that has no parameters and doesn’t return anything. Leave the method empty for now.

**9.** Inside `.openForTheDay()` declare a new `List` of `Thread`s called `gymMembersRoutines`, do not initialize `gymMembersRoutines` to anything yet, we’ll do that next.

This variable is going to hold the members of our gym and the routines that they are going to do for the day. Each member and their routine combination will be run as a separate thread.

You will also need to add an import statement for `List`, do you remember what package it is in?

**10.** To create the threads for the `gymMembersRoutines` we are going to create an `IntStream`. This stream will be the range from 1 to the number of members in our gym, these will be ids for the members. For each integer in the range, we are going to map it to a corresponding object. This mapping method takes a lambda as a parameter. At the end of the mapping function, we will collect the objects back up and put them into the `gymMembersRoutines` list.

For now:

- Set `gymMembersRoutines` equal to an `IntStream`
- Method chain the `.rangeClosed()` method off the `IntStream`, beginning at `1` and running up to and inclusively, of `this.totalGymMembers`.
- Method chain the intermediate function, `.mapToObj()` method off the range function, leave the method parameters empty for now.
- Add an import statement for `IntStream`: `import java.util.stream.IntStream;`

**11.** Now as mentioned in the task, the `.mapToObj()` method is an intermediate function, which means it cannot be the last method in a chain of methods, it is simply meant to pass off objects to another method for further processing.

Remove the trailing semicolon from the `.mapToObj()` and chain another method, this one a _terminal function_, `.collect().` Inside this method, make a call to the static `.toList()` method of the `Collectors` class and add the semicolon back to the end of the line.

You’ll need to import the `Collectors` class from `java.util.stream` as well.

**12.** As mentioned in Task 10, `.mapToObj()` is an _intermediate function_ and takes a lambda and returns a new stream to the next chained function. Inside the parameters of this function, add an empty lambda that passes one parameter, `id` into the lambda. The lambda is supposed to return objects to the next function, but we’ll set the return function up over the next few tasks, leave the body empty for now.

This will challenge your organization and whitespace management, try to make your code as readable as possible, see the hint for our technique.

**13.** Inside the lambda create a new `Member` variable called `member`, passing in the `id` variable from the lambda parameters into the `Member` constructor.

**14.** Now that we have a way to create all our members, we will create a thread for each of the routines that the members will be performing. These threads are what we will collect back up into the `gymMembersRoutines` list.

- After the creation of the new `member` add a return statement

**15.** Instead of an empty return statement, return a `new Thread()`. Inside the constructor create a new lambda, it will have no parameters and leave the lambda body empty for now.

**16.** Inside the lambda add a `try-catch` block. Catch the generic `Exception e`.

**17.** Inside the `try` block, call the `.performRoutine()` of `member`. Inside the `catch` block, print out the exception that was caught.

This completes our `gymMemberRoutines` list as we have now created the `Thread`s we will fill the list with.

**18.** Now that our list of threads, `gymMembersRoutines`, is complete we’re ready to do something with it! On the next line, after the completion of the `collect` method, iterator over each item in the list using the `.forEach()` method. This method takes a [consumer function](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html), a type of function that takes in an object and returns nothing. We’ll implement this using [method referencing](https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html), which is a technique that is used when a lambda function does nothing more than call a method that already exists for the class. We are going to call the `Thread` method, `.start()`, check the hint for the syntax.

####**SUPERVISING THE GYM MEMBERS**

**19.** Now we need to create the thread that is going to supervise all of our gym members. Create a new private method, `.createSupervisor()`. It will return a `Thread` and has one parameter, a List of Threads called `threads`. Leave the method body empty for now.

**20.** Inside the new method, create a new `Thread` called `supervisor`, set this equal to a new Thread. Inside the constructor, add a lambda that has no parameters, and leave the lambda body empty. Return the `supervisor` Thread back out of the method.

**21.** Inside the lambda, create a `while` loop that runs while true (forever until we break the loop). This can be done by passing the boolean literal true to the while loop condition.

**22.** Inside the `while` loop, create a new list of `String`s called `runningThreads`. This will equal another collection gathered from a stream. We’re going to give you the basic procedures, let’s see if you can string them together properly. If you run into issues, check the hint to see how we implemented the solution.

- Create a stream from the `threads` argument using `.stream()`.
- Filter the stream of threads based on if the [thread is alive or not](https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/Thread.html#isAlive()).
- Since the result of the stream is currently still `Thread`s and we need `String`s, map the result, getting the `Thread`‘s name using the `.getName()` method.
- Collect the resulting map into a list using `Collectors.toList()`

**23.** After you’ve got `runningThreads` complete, add a call to `System.out.println();`. We will use this message to act as a message from our gym staff reporting how many people are still working out and then list the list of threads.

Inside the print statement:

- Print the current thread’s name ([hint](https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/Thread.html#currentThread()))
- Display the current number of members working out (how many items are still in `runningThreads`) along with a short phrase explaining the number (i.e. “8 people still working out”)
- Print the list of members (`runningThreads`) still working out

**24.** If you remember, our `while` loop is set to run **_forever_**, this is a really bad thing, let’s fix that. Create an `if` statement inside the `while` loop that `break`s the loop if the list of `runningThreads` is empty.

**25.** After the `if` statement but still inside the `while` loop, create a `try-catch` block. Inside the `try` block, call the static `Thread` method `.sleep()` for 1000 milliseconds. Catch the `InterruptedException` as `e` and print it to the user if there is an error.

**26.** After the `while` loop, print the current thread’s name again and also a message saying that all threads have completed.

**27.** Now, outside of the lambda, but before our `return supervisor;` line, set the name of the supervisor thread to `Gym Staff`.

####**ADDING STAFF TO THE GYM**

**28.** Now that we have our gym staff, go back to the `.openForTheDay()` method. Before the final `forEach` iterator that starts all of the `gymMembersRoutines`, declare a new `Thread` called `supervisor`, initialize it to the result of calling our `.createSupervisor()` method, passing in the `gymMemberRoutines`.

**29.** Make a call to start the `supervisor` Thread you just created.

####**MAIN METHOD**

**30.** Create the main method. Inside the main method create a new Gym, give your gym a name and add as many members as you want, we suggest five. For the `availableMachines` Map parameter, use the following syntax to create a new `HashMap` in place:

`Gym globoGym = new Gym(5, new HashMap<>() {
{
put(MachineType.LEGPRESSMACHINE, 5);
put(MachineType.BARBELL, 5);
put(MachineType.SQUATMACHINE, 5);
put(MachineType.LEGEXTENSIONMACHINE, 5);
put(MachineType.LEGCURLMACHINE, 5);
put(MachineType.LATPULLDOWNMACHINE, 5);
put(MachineType.CABLECROSSOVERMACHINE, 5);
}
});`

Add an import statement for `HashMap`:

`import java.util.HashMap;`

**31.** Now call the `.openForTheDay()` method on your gym. Compile all the files, **_javac \*.java_**, in the terminal and then run the Gym class, _**java Gym**_ to see all your gym members begin working out for the day.

####**ADDITIONAL CHALLENGES**

**32.** Consider adding synchronizing capabilities to your Gym. Right now there are no limitations on equipment and multiple members can use the same machine at the same time. We also have a finite number of weights in the gym, right now we don’t take that into account when a member begins their exercises, how can we make them wait for weights to be returned by the current users?
