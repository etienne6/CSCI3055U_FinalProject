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

## About the syntax

**Hello world**

```kotlin
fun main(args : Array<String>) {
    println("Hello, world!")
}
```
Just like Java, the entry point of Kotlin's compiler is the _main_ function.

**Variable Declaration**

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
//Error: variable must be initialized oro have type declared
name = "Etienne"
```

**Val vs Var**

We can declare a variable in Kotlin using either *val* or *var*. The difference
between the two is that *val* is an immutable value while *var* isn't.

```kotlin
val age = 20
age = 20 //Error
var name = "Etienne"
name = "Eric" //this is okay
```

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
