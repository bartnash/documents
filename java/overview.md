
# Java Programming Language Usage and Examples

## Variables
Declare variables with a type and name:

```java
int myInteger = 10; 
double myDouble = 1.5;
String myString = "Hello";
```

### Primitive Data Types
Java provides 8 primitive data types:

**byte**: 
- 8-bit signed integer 
- Range: -128 to 127
- Default value: 0
- Use for saving memory when value is small

**short**:
- 16-bit signed integer
- Range: -32,768 to 32,767
- Default value: 0 

**int**: 
- 32-bit signed integer 
- Range: -2,147,483,648 to 2,147,483,647
- Default value: 0
- Generally the most used integer type

**long**:  
- 64-bit signed integer
- Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
- Default value: 0L
- Use when int is not large enough 

**float**:
- 32-bit floating point number  
- 6-7 decimal digits precision 
- Default value: 0.0f

**double**:
- 64-bit floating point number
- 15 decimal digits precision
- Default value: 0.0d
- Generally preferred for decimal values

**char**: 
- Single 16-bit Unicode character
- Min value: '\u0000' (0)
- Max value: '\uffff' (65,535)

**boolean**: 
- True or false value
- Default: false

So in summary:
- Integers for whole numbers, floats and doubles for decimals
- Boolean for true/false 
- Char for single characters
- Chose type based on range and precision needed

Primitive types provide efficient storage but lack functionality of object wrappers like Integer and Boolean.

### var
`var` is a type inference keyword introduced in Java 10. It allows the type of a variable to be implicitly defined by the compiler based on the type of the initializing expression.

Example `var`:

```java
// The compiler infers type int
var x = 10;  

// The compiler infers type String 
var name = "John";   

// Also works for complex types
var map = new HashMap<String, Integer>();
```

- `var` cannot be used for method parameters, it can only be used for local variables.
- The `var` type is determined by the compiler, you cannot explicitly specify the type.
- The initializer expression must have an explicit type for the compiler to infer from. 
- `var` simplifies code by replacing explicit and potentially verbose types.
- It avoids duplicating the type specification.

### Non-primitive Data Types

In Java, non-primitive data types refer to reference types - objects created from classes, interfaces and arrays. Here is an overview:

**Classes**:
- User defined custom reference types
- Define state via fields and behavior with methods 
- Example classes: String, Math, Scanner etc 

**Enums**:  
- Special class to represent enumerated set of constants
- More readable and safer alternative to constants
- Values available at compile time

**Interfaces**:
- Define a contract without implementation
- Specify capabilities a class should have
- Used to achieve abstraction and multiple inheritance

**Arrays**: 
- Container to store a fixed number of elements 
- Stored as objects so can hold primitives or objects
- Indexed numerically, always fixed size

**Type Wrappers**:
- Wrapper classes that encapsulate primitive types into objects
- Enable primitives to use APIs requiring reference types  
- Examples: Integer, Boolean, Character etc

Common Usage:

- Classes and interfaces used to model concepts and abstractions in code
- Arrays frequently used with algorithms and collections
- Type wrappers used with Collections APIs 

Key Benefit:
Provide object oriented capabilities like inheritance, abstraction through use of references. Enable modeling real world entities.

So in essence, non-primitive types facilitate OOP in Java through object references and pointers whereas primitive types are simple raw data storage.

## Strings
Combine and format strings: 

```java 
String name = "John";
String greeting = "Hello " + name; 

String formatted = String.format("My name is %s", name);
```
Note that strings are immutable.  The actual object defined by a string cannot be modified.  All forms of string manipulation actually create a new String.

### Primitive vs Non-primitive Arguments
The main difference between primitive types and non-primitive (reference) types when passed as arguments to methods is in how they are passed - by value vs by reference:

**Primitive Types** (int, double, boolean etc):

- Passed by value to methods
- Value of the argument is copied 
- Changes made inside method are not reflected outside 

For example:

```java
void increment(int n) {
  n++; 
}

int x = 5; 
increment(x);
// x is still 5
```

**Non-Primitive Types** (classes, arrays, interfaces):

- Passed by reference to methods 
- Reference/address of object is copied instead of entire object
- Changes made inside method are reflected outside

For example: 

```java  
void modifyArray(int[] arr) {
  arr[0] = 100; // Change element  
}

int[] nums = {1, 2, 3};
modifyArray(nums);  
// nums array now updated to {100, 2, 3} 
```

In summary, primitive types pass a copy of the value and no changes are reflected, while non-primitive types like arrays or classes pass a pointer so changes are visible after the method executes. This is an important difference that affects how methods and functions interact with the calling code.  Remember that strings are immutable, which can make them a bit confusing.  When passed as an argument, it is the reference to the string that is passed. Any string manipulation which occurs within the method will produce a new String and will have no impact on the original String referenced through the variable in the calling code.

## Basic Data Structures

Arrays

```java  
int[] numbers = {1, 2, 3};
String[] names = {"John", "Sarah"}; 
```

Lists are unordered collections of elments of any data type.
ArrayLists store values of any type and can resize:

```java
import java.util.ArrayList;

List<String> list = new ArrayList<>();
list.add("first");
list.add("second");
```

Maps are collections of key-value pairs:

```java
import java.util.HashMap; 

Map<String, Integer> ages = new HashMap<>();
ages.put("John", 30); 
ages.put("Sarah", 28);
```

### Collections

Java collections are a powerful set of reusable data structures available in the java.util package. The main interfaces for collections are:

**List** - Ordered sequence of elements accessible by index. Allows duplicates. Implemented by ArrayList, LinkedList, Vector and Stack.

```java
List<String> fruits = new ArrayList<>();
fruits.add("Apple"); // Add element
String fruit = fruits.get(0); // Get element by index
```
**Set** - Collection of unique elements with no duplication. Implemented by HashSet, LinkedHashSet and TreeSet. 

```java
Set<String> set = new HashSet<>(); 
set.add("A");
set.add("B");
boolean exists = set.contains("A"); // Check if exists
```

**Queue** - Collection for holding elements before processing. Provides FIFO order. Implemented by PriorityQueue and ArrayDeque.

```java
Queue<Integer> queue = new PriorityQueue();
queue.offer(5); // Add element
int first = queue.poll(); // Retrieve first element
```
**Map** - Collection of key-value pairs allowing lookup via keys. Allows null keys/values unlike sets. Implemented by HashMap, LinkedHashMap and TreeMap.

```java
HashMap<String, Integer> map = new HashMap<>();
map.put("A", 1); // Store key-value pair
int val = map.get("A"); // Retrieve value by key
```

Common collection operations available through base interfaces:

- add/remove elements
- iterate using foreach loop or iterator 
- check size, availability of elements
- sort/shuffle order

Benefits:

- Reusable data structures
- Improved code quality 
- Consistent API 
- Optimized implementations

Common usage patterns: 

- ArrayLists to store and access sequential data
- HashSets when order not required and fast lookup needed
- TreeSets for sorted data
- HashMaps for key-value data

Additionally, collections utilize generics for type safety and have stream APIs available for functional programming. On the whole, collections form a critical part of Java and provide building blocks for most programs.

## Importing Packages

The import statement in Java is used to access classes and interfaces from other packages. Here is a quick overview of how it works:

**1. Importing a single class:**

```java 
import java.util.ArrayList;
```

This imports just the ArrayList class from the java.util package. 

**2. Importing the entire package:**

```java
import java.util.*; 
```

The "*" imports all classes and interfaces defined in java.util into the current namespace.

**3. Static imports:** 

```java
import static java.lang.System.out;
```

Allows accessing static members of classes directly without class qualifier.

**Rules of import statement**:

- Needs to be written after the package declaration
- Only one class/interface can be imported per statement  
- The * wildcard only imports classes in that specific package
- Static imports are for static members of a class only

**Benefits**:

- Eliminates the need for fully qualified class names
- Makes code more readable and clean
- Bulk import entire packages when needed

In summary, import statements save time and reduce verbosity by importing commonly used classes and packages into the current namespace for easy usage within Java code.

## Functions
Define functions with arguments and return types:

```java
int add(int x, int y) {
  return x + y;
}

void printMessage(String msg) {
  System.out.println(msg);  
}
```

## Operators
Mathematical operators like +, -, *, / work as expected. 

Logical operators:
```
&& - logical and
|| - logical or 
! - logical not
```

Comparison operators: 
```
== - equals 
!= - not equals
> - greater than
< - less than
>= - greater than or equal to 
<= - less than or equal to
```

## Loops
Process arrays and collections with for loops:

```java
String[] names = {"John", "Sarah", "Bob"};

for(String name : names) {
  System.out.println(name); 
}
```

While loop repeats until condition is false:

```java
int i = 0;
while(i < 10) {
  System.out.println(i);
  i++;
}
```

## Classes and Interfaces
Classes and interfaces are fundamental building blocks of object-oriented programming in Java.

    Classes: Classes are blueprints for creating objects. They define the attributes (fields) and behaviors (methods) of objects.
Define classes with fields and methods: 

```java
public class Person {

  private String name;
  
  public Person(String name) {
    this.name = name;  
  }
  
  public String getName() {
    return this.name;
  }

}
```

Implement interfaces in classes:

```java  
public interface Shape {
  void getArea(); 
}

public class Circle implements Shape {

  @Override
  public void getArea() {
    // calculate circle area
  }

}
```

## Lambda Functions 

Lambdas are anonymous functions:

```java
(int x) -> { 
  return x + 5;
};

(String s) -> s.length()
```

Used often with streams:

```java
list.stream().map(n -> n * 2).forEach(x -> System.out.print(x + " ")); 
```

## Command Line Arguments

Access command line arguments via args array:

```java
public static void main(String[] args) {
  if(args.length > 0) {
    System.out.println("Hello " + args[0]);  
  }
}
```


