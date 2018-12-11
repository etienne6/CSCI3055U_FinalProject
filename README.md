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

### OOP (Object Oriented Programming)

In Kotlin, just like Java we can create an object class. But, Kotlin supports both _functional_ and _OOP_. Kotlin supports features such as _higher-order functions_ and _lambdas_.

Before we divulge into those features, let us look at a basic example of a class declaration in Kotlin:

```kotlin
fun main(args: Array<String>) {
    val person1 = Person("Etienne",20)
    print(person1.getName() + " is " + person1.getAge() + " years old")
}

class Person (personName: String, personAge: Int) {
    private var name: String
    private var age: Int
    // constructor
    init {
        name = personName
        age = personAge
    }
    fun getName(): String{return name}
    fun getAge(): Int{return age}
}
```
Where the output is:
```kotlin
Etienne is 20 years old
```

Now, there's quite a bit going on in this block of code, so let us break it down:

1. _class Person_ looks just like a function where we specify its arguments. Unlike a function, it's arguments go into the _init_ block where we initialize the values of the class. In this case, age and name.

2. _getName()_ and _getAge()_ are accessor functions which gets the value of name and age variables of the class.

3. _Line 2_ of the function is the declaration of instance of the class Person, assigned to the variable person1.

4. _Line 3_ is an example of doing function calls that belong to a class.

**Lambda Expressions and Anonymous functions**

Lambda expressions and anonymous functions are 'function literals', i.e. functions that are not declared, but passed immediately as an expression.

A full syntatic sample of a lambda expresion in Kotlin is like this:
```kotlin
val multiply = { x: Int, y: Int -> x * y }
//function call
println(multiply(1,2))
//2
```
Lambda expressions in Kotlin always have to be enclosed in curly brackets. The first "arguments" are the parameters that the function will take. Followed by the _->_ is the body of the function.

The use of _anonymous functions_ lets us specify the return type of the functions that we declare. Although this is not required since data types are ineferred. But if we need to do so, here's an example of how:
```kotlin
fun(x: Int, y: Int): Int = x * y
```
It looks exactly like a regular function but we ommit the name.

**Higher Order Functions**

In Kotlin, a function can be passed as a parameter or can be returned from a function, the function which does the same is known as a higher-order function.

Here is an example that I took from one of my references:
```kotlin
fun <T> ArrayList<T>.filterOnCondition(condition: (T) -> Boolean): ArrayList<T>{
    val result = arrayListOf<T>()
    for (item in this){
        if (condition(item)){
            result.add(item)
        }
    }

    return result
}
```
There's alot going on in this block of code so let's break it down:
1. _<T>_ defines the _template type_ that the function operation will be done over.
2. _Line 1_ ArrayList<T>.filterOnCondition. ArrayList is a Kotlin class object that is part of its standard library. What we're doing here is defining a method for it.
3. The argument (condition: (T) -> Boolean) defnes an anonymous function that takes in (T) class object and returns a Boolean. This anonymous function is bounded to _condition_
4. _line 5_ based on the method _condition_, it will add an item to the arrayList result

Here's an example where I define my own condition function used with the _filterOnCondition_ function.

```kotlin

fun <T> ArrayList<T>.filterOnCondition(condition: (T) -> Boolean): ArrayList<T>{
    val result = arrayListOf<T>()
    for (item in this){
        if (condition(item)){
            result.add(item)
        }
    }

    return result
}
//checks if number is odd or even
fun isOdd(number: Int): Boolean{
    if(number % 2 == 0){
        return false
    }else{
        return true
    }
}
fun main(args: Array<String>) {
    var list = arrayListOf<Int>()
    for (number in 1..10){
        list.add(number)
    }
    var resultList = list.filterOnCondition { isOdd(it) }
    println(resultList)
}
```
Where the output is:
```Kotlin
[1, 3, 5, 7, 9]
```
In this snippet of code, I defined an _isOdd_ function which checks if a number is either odd or even. In the body of the main function, I instantiate an object of arrayList and added the values of 1 to 10. Then, I used the _filterOnCondition_ in conjunction with the _isOdd_ function to filter out even numbers form the array. _Note that the argument _it_ in the _isOdd_ function is just the variable _resultList__



## About the tools

* Kotlin has a compiler called **_kotlinc_**, which integrates parts of JVM (_Java Virtual Machine_).
* Kotlin's compiler can also target JVM, JS and Native.
* JDK is required to run programs compiled by Kotlin. Kotlin is compatible with JDK 1.6+
* Even though Kotlin is an independent language, it requires on Java's standard library and development kit.
* Since JetBrains developed kotlin, their IDE **_intelliJ_** contains all such tools required: Build tools(optional), JDK and JVM.

## About the standard library
> Here are examples of some features of Kotlin's standard lirary. Since it is a **huge** library, by no means this is an exhaustive list. We'll also only focus on it's syntax in Kotlin.

**kotlin.collections**
>Contains all the collection types suchs as, as Iterable, Collection, List, Set, Map and related top-level and extension functions.

**kotlin.collections/MutableList**
> Generic ordered collection of elements that supports adding and removing elements.
```kotlin
interface MutableList<E> : List<E>, MutableCollection<E>
```
Where E is the element type of the list. There can be only one type for the list.

***functions***

_add_
>Adds specified values to the end of the list.
```kotlin
abstract fun add(element: E): Boolean
```
If we want to specify the index to put the value at:
```kotlin
abstract fun add(index: Int, element: E)
```
_remove_
>Removes a specified value, if it appears in the list.
```kotlin
abstract fun remove(element: E): Boolean
```
_clear_
>Removes all the elements of the specified collection, returns an empty list.
```kotlin
abstract fun removeAll(elements: Collection<E>): Boolean
```
_binarySearch_
>  Searches the list given the provided element using the Binary Search algorithm. The list is expected to be sorted according to the comparator operator. If this argument is not supplied the results will be undefined.
Returns the index of the element.
```kotlin
fun <T> List<T>.binarySearch(
    element: T,
    comparator: Comparator<in T>,
    fromIndex: Int = 0,
    toIndex: Int = size
): Int
```
_sort_
> returns a list sorted in its natural order.
```kotlin
fun <T> MutableList<T>.sort()
```

Sample Code
```Kotlin
fun main(args: Array<String>) {
    var numbers: MutableList<Int> = mutableListOf(10, 7, 98)

    numbers.add(1)
    println(numbers)

    numbers.sort()
    println(numbers)

    numbers.remove(7)
    //we sort the list before using binarySearch
    numbers.sort()
    numbers.binarySearch(7)
    println(numbers)

    numbers.clear()
    println(numbers)
}
```
This results in the output of:
```kotlin
[10, 7, 98, 1]
[1, 7, 10, 98]
[1, 10, 98]
[]
```


## Android App Development with Kotlin (Specialized Library)

> Please see the real-app folder

## Analysis of the language

**Kotlin a Hybrid**

Kotlin supports both functional and procedural paradigms.

*functional*
* Kotlin supports features such as top-level scoping, lambdas and tail recursion as featured in our previous examples.

*procedural*
* We can see this through top level functions meaning, things such as this is allowed in Kotlin:
```kotlin
fun call(){
    //empty function
}
fun person(){
//makes function call
 call()
}
```
**Meta-Programming**

During my research I was able to find that Kotlin does indeed support Meta-Programming. Kotlin supports the OOP feature _reflections_. "Reflections is the ability of a computer program to examine, introspect and modify its own structure during runtime."

In order to use this, we have to add Kotlin's reflection API as a dependency.
```kotlin
 "org.jetbrains.kotlin:kotlin-reflect:$kotlin_version"
```

With regards to _macros_ as far to my knowledge Kotlin does not support it.

**Symbol Resolution / Closure**

Lambda expressions or anonymous functions can capture the variables declared in the outer scope. They can also modify its value.

See example:
```kotlin
fun main(args: Array<String>) {
    var number = 10
    val multiply = { x: Int, y: Int -> number = x * y}
//function call
    multiply(1,2)
    println(number) // Output is 2
}
```

**Scoping**
> Please consider this function:
```kotlin
fun main(args: Array<String>) {
    var num = 99
    fun b() { num = 100 }
    fun c() {
        var num: Int
        b()
    }
    c()
    print(num)
}
```
The output of this function is:
```kotlin
100
```
Kotlin supports *lexical* scoping. This is because Kotlin's compiler determines the value of _num_ that we are referring to at compile time. If it supported _dynamic scoping_ the value would have been 100.

**Functional Programming**

Yes, it is a part of Kotlin's standary library. To reiterate, we can see this in our examples such as lambdas. We do not have to import a library of sorts we can just code it straight away!

**The good and the bad**

*Strengths*
*  One of the main reasons why it was invented, it's not as verbose as Java. It's much faster to write coded in comparison to it.
*  Interoperable with Java, code compiles in Java bytecode
*  Many features, supports several programming paradigms: OOP, functional and procedural

*Weaknesses*
* Fluctuating compilation speed.
* Not that many resources to learn from, since language is relatively new.
* No namespaces, making it harder to organize the code.
* No static modifiers.

## References

All the information I gathered for this repo, I credit to my sources
[1] https://www.programiz.com/kotlin-programming
[2] https://kotlinlang.org/docs/reference/basic-syntax.html
[3] https://medium.com/@agrawalsuneet/higher-order-functions-in-kotlin-3d633a86f3d7
[4] https://hackernoon.com/how-to-write-your-first-program-in-kotlin-8554cb526158
[5] https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html -
[6] https://codelabs.developers.google.com/codelabs/build-your-first-android-app
[7] https://www.brightec.co.uk/ideas/kotlin-here-so-what
[8] https://en.wikipedia.org/wiki/Scope_(computer_science)
