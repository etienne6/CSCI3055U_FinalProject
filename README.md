# _Kotlin_

- _Etienne Caronan_
- _etienne.caronan@uoit.net_

## About the language
**History**
In July 2011, JetBrains unveiled Kotlin; a language they have been developing for a year. And on August 2011, JetBrains published a blog post, "_Why JetBrains needs Kotlin_", detailing their reasons behind creating Kotlin.

_Here are the main points_:

**_To increase their (JetBrains) productivity_**
> Back then, JetBrains team were writing all of their IntelliJ-based IDEs almost entirely in Java. It took a lot of time to compile with javac. They wanted to increase productivity by switching to a more expressive language.

**_To drive sales of IntelliJ IDEA_**
>They wanted the enterprise development frameworks and tools for Kotlin to be the part of IntelliJ IDEA Ultimate (commercial version) thereby increasing its sales.

**_Drive company's business by keeping trust_**
> JetBrains is trusted by a lot of professional developers. They wanted to drive company's business as well as attract more people to their approach of developing tools by increasing community awareness of JetBrains and maintaining the trust.

**Some interesting features**

Here are some of the important features of Kotlin:

**_Open source_**

>Kotlin is distributed under Apache License, Version 2.0. The Kompiler (Kotlin compiler), IntelliJ IDEA plugin, enhancements to basic Java libraries and build tools all are open source.

**_Interoperable with Java and Android_**

>It is 100% interoperable with Java and Android. This means all your current Java/Android code works seamlessly with Kotlin. For more information, visit: Mixing Java and Kotlin in One Project.

In fact, Android team announced Kotlin a first class language for developing Android apps.  In addition to that, it allows you to compile quite a few Kotlin projects to JavaScript modules.

**_Concise and Expressive_**

>Rough estimation indicates that, using Kotlin allows you to cut off the lines of code by approximately 40% (compared to Java).

**_Tool-friendly_**

>Kotlin is developed by JetBrains, a company renowned for creating development tools for professionals. No wonder, it is tool-friendly.      
You can choose any Java IDE to run Kotlin or build it from the command line.

# **About the syntax**

### Hello world

```kotlin
fun main(args : Array<String>) {
    println("Hello, world!")
}
```
Just like Java, the entry point of Kotlin's compiler is the _main_ function.

### Variable Declaration

Kotlin is a _statically_ typed language, meaning the type of the variable
must be known by compile time.

Here is an example of variable declaration:

```kotlin
var age = 20  //Int data type
var name = "Etienne" //String data type
```
Kotlin supports type inferencing, meaning we do not have to state the data
type of the variable when we declare it.

However, if we want to explicitly state the data type, here's how:

```kotlin
var age: Int //declaring age as type Int
age = 20  //assigning value
var name: String //declaring name as type String
name = "Etienne" //assigning value
var class: String = "CSCI 3055U" //Shorter way of doing it
```

Here's some example of errors:
```kotlin
var age: Int //declaring age as type Int
age = "20"  //Error: Assigning a type String to an Int variable
var name
//Error: variable must be initialized or have type declared
name = "Etienne"
```

**_Val vs Var_**

We can declare a variable in Kotlin using either *val* or *var*. The difference
between the two is that *val* is an immutable value while *var* isn't.

```kotlin
val age = 20
age = 20 //Error
var name = "Etienne"
name = "Eric" //this is okay
```

### Flow Control

In this section I will detail the different ways we can control the flow of our program.

**if expression**

There is a traditional use of the if expression, syntatically it looks the same
as Java:

```kotlin
val mark = 89
if (mark < 50) {
    println("Failed class!")
} else {
    println("Passed class!")
}
//outputs "Passed class!"
```
Please note that, the else block is optional.


With Kotlin there is another way we can use the if/else block:
```kotlin
val mark = 89
val result = if (mark < 50) {
    "Failed class!"
} else {
    "Passed class!"
}
println(result) //outputs "Passed class!"
```
You can see with this code block the value assigned to result is the executed line in the else block. With Kotlin, the if/else blocks can return values. The data type assigned is inferred.

Here's another example:
```kotlin
val mark = 89
val result = if (mark < 50) {  
    print("We are so sorry that")
    print(",you ")
    "Failed class!"
} else {
    print("Congratulations")
    print(" you have ")
    "Passed class!"
}
print(result)
```
The output of this code would be:
```kotlin
Congratulations you have Passed class!
```
Another thing to take note of on if expressions is that, the last line
of the the executed if/else block is returned.

**while loop**

Here is the basic syntax of a while loop in Kotlin:
```kotlin
while (testExpression) {
    // codes inside body of while loop
}
```
Where _testExpression_ is a boolean expression. The _testExpression_ gets checked every iteration, if the evaluation is _false_ then the block doesn't get executed. Otherwise, the block gets executed.

Here's an example:
```kotlin
  var num_beers = 99
    while (num_beers > 0) {
        println( "$num_beers bottles of beer on the wall, $num_beers bottles of beer")
        --num_beers
        print("Take one down and pass it around, $num_beers bottles of beer on the wall." + '\n')
    }
```
Where the output is:
```kotlin
99 bottles of beer on the wall, 99 bottles of beer
Take one down and pass it around 98 bottles of beer on the wall.
98 bottles of beer on the wall, 98 bottles of beer
Take one down and pass it around 97 bottles of beer on the wall.
97 bottles of beer on the wall, 97 bottles of beer
.
.
.
1 bottles of beer on the wall, 1 bottles of beer
Take one down and pass it around 0 bottles of beer on the wall.
```

**for loop**

The _for_ loop in Kotlin is used to iterate over ranges, arrays or any collection that provides an iterator.

Here's a sample structure of a for loop block:

```kotlin
for (item in collection) {
    // body of loop
}
```
Where item is the current object in the iteration.

Here's another example where we iterte over a range of numbers:
```kotlin
for (number in 1..5) {
    println(number)
}
```
Where the output would be:
```kotlin
1
2
3
4
5
```

**Others**

There are other ways of controlling the flow of a program in Kotlin:
1. _when_
2. _break_
3. _continue_

### Functions
**Function Types**
1. _Kotlin Standard Library_
* These are built in functions that are ready for use. This will be discussed later under the _About the standard library_ section of this document
2. _User defined_
* These are functions that are defined by users themselves.

**Basics**

Here is a sample structure of a function definition:
```kotlin
fun functionName(param1: Type1): returnType{
    //body of function
    return returnType
}
```
Whenever we declare a new function, we must start with the keyword _fun_, then it is followed up the function name. Inside the brackets are the arguments of the function (the values it takes as input), where we must explicitly state the its dataype. It is important that the dataype of the input matches the specified datatype in the function declaration or else it would cause a compiletime error. Followed by argument declartion comes the ":", where we specify the datatype returned by the function.

Here is a function that calculates the sum of two numbers:
```kotlin
fun main(args: Array<String>) {
    println(sum(1,2))
}
fun sum(num1: Int, num2: Int): Int{
    //body of function
    return num1 + num2
}
```
We call the function _sum_ in line 2, inside the main function printing the value:
```kotlin
3
```

**Default Arguments**

In Kotlin, we can specify the default arguments that a function takes as input. Meaning if there are no values passed onto the function call, it used the default values instead.

See this example:
```kotlin
fun repeatMessage(message: String = "Sorry, no message", length: Int = 1) {
    for (i in 1..length) {print(message)}
}

fun main(args: Array<String>) {
    repeatMessage()
}
```
Which outputs the value:
```kotlin
Sorry, no message
```
On the other hand if the first argument was _"Hello World"_ and the second argument was _5_, such as in this example:
```kotlin
fun repeatMessage(message: String = "Sorry, no message", length: Int = 1) {
    for (i in 1..length) {println(message)}
}

fun main(args: Array<String>) {
    repeatMessage("Hello World", 5)
}
```
The output would be:
```kotlin
Hello World
Hello World
Hello World
Hello World
Hello World
```
_Note that the function didn't specify a _return type_, meaning that the function returns nothing_

**Recursion**

Let's take a look at the _repeateMessage_ function that we implemented awhile ago but this time as a recursive function:
```kotlin
fun repeatMessage(message: String, length: Int) {
    if(length != 0){
        println(message)
        return repeatMessage(message, length-1)
    }
}

fun main(args: Array<String>) {
    repeatMessage("Hello World", 5)
}
```
Where its output is:
```kotlin
Hello World
Hello World
Hello World
Hello World
Hello World
```
Another way we can do recursive functions in Kotlin is through _tail recursion_.
The difference between the recursion we did from the example above is that, with _tail recursion_ the recursive call is done as the last operation of the entire function.

In order to do _tail recursion_ in Kotlin, we have to tell the compiler by using the **_tailrec_** function prefix.

Let us look at our beloved _fibonacci sequence_ function as an example:
```kotlin
import java.math.BigInteger

fun main(args: Array<String>) {
    val n = 10
    val first = BigInteger("0")
    val second = BigInteger("1")

    println(fibonacci(n, first, second))
}

tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n-1, b, a+b)
}
```
_Notice how the function's recursive call is the last line to be executed in_

This function outputs to:
```kotlin
55
```
The _fibonacci_ function takes in three arguments and exactly in this order:
n (the number we will be calculating the fibonacci of), a and b which both takes the arguments of 0 and 1 respectively.

With this _tail recursion_, the recursive function _bottoms out_ once n reaches the value of 0. Everytime we iterate the recursive function, we always check if n is equal to 0. If not, we do a recursive call to the _fibonacci_ function passing the values of: decrement of n by 1, b and the sum of a and b.




## About the tools

> _Describe the compiler or interpreter needed_.

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _Organize your report according to the project description
document_.
