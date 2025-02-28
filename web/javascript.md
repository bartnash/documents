# Javascript

Javascript is not based on Java, though they do share similar syntax.

JavaScript was invented by Brendan Eich in 1995, and became an ECMA standard in 1997.

ECMAScript is the official name of the language.

ECMAScript is an object-oriented, scripting language, which runs in a a host environment. 
It was originally designed to be a Web scripting language, running inside a web browser.

ECMAScript versions have been abbreviated to ES1, ES2, ES3, ES5, and ES6.

Since 2016, versions are named by year (ECMAScript 2016, 2017, 2018, 2019, 2020).

## Language Basics

### Variables

JavaScript Variables can be declared in 4 ways: 
- Automatically (discouraged)
- Using var 
- Using let 
- Using const

```
let name = "John"; // Can be reassigned
const age = 30; // Cannot be reassigned
var isStudent = true; // Function-scoped variable
```

### Functions

```
// Function declaration
function greet(name) {
  return `Hello, ${name}`;
}

// Function expression
const greet = function(name) {
  return `Hello, ${name}`;
};

// Arrow function
const greet = (name) => `Hello, ${name}`;
```

### Control Structures

```
// If-else
if (age > 18) {
  console.log("Adult");
} else {
  console.log("Minor");
}

// For loop
for (let i = 0; i < 5; i++) {
  console.log(i);
}

// While loop
let i = 0;
while (i < 5) {
  console.log(i);
  i++;
}
```

### Objects
```
// Object
const person = {
  name: "John",
  age: 30,
  greet: function() {
    console.log("Hello");
  }
};

// Accessing object properties
console.log(person.name);
person.greet();

```

### Arrays
```
// Array
const numbers = [1, 2, 3, 4, 5];

// Accessing array elements
console.log(numbers[0]);
```

### JavaScript within HTML

In HTML, JavaScript is inserted between \<script> and \</script> tags.

```
<script>
document.getElementById("demo").innerHTML = "My First JavaScript";
</script> 
```

Scripts can be loaded from external sources.
```
<script src="someScript.js"><\script>
```

JavaScript can be placed within the \<body> or \<head> of an HTML page, or both.

Javascript will executes as the page loads.

#### Events

