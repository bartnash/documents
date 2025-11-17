# Go Stuff
[go.dev](https://go.dev/)

The 'go' command basically is the build tool.
 - ``` go build ```
   compiles everything
 - ``` go install ```
   installs the binary wherever the go env path is configured to install stuff.

go.mod is analagous to pom.xml.

# Overview
Go/Golang is an open-source, statically typed language developed by Google.  Geared toward backend and systems programming.

## Variable Declaration

Go supports variable declaration using the var keyword or the short declaration operator := (inside functions:
``` go
var name  string = "Alice"
age := 30
var height float64
height = 1.75

```
Variables declared without being explicitally initialized will default to the types zero value( 0 for int, "" for string, false for bool)

## Data Structures
Go has build-in support for several data structures.
### Arrays
Fixed-size, specific type:
``` go
var arr [5]int
arr[0] = 10
nums := [3]int{1,2,3}
```
### Slices
Dynamically-sized, flexible views over arrays.

``` go
// Declare a slice
var sli []int

// Initialize a slice
sli = []int{1,2,3,4}
sli = append(sli, 5, 6)
t := make([]int, 3)

// Slice of a slice (or array)
sli2 := sli[3:4]

```

### Maps
Hash Table/Dictionary, unordered key-value store.

``` go
//Declare an empty map (nil map)
var ages map[string]int

ages = make(map[string]int)
fmt.Println(ages)
ages["old"] = 60
fmt.Println(ages)

```

### Structs

User-defined composite type for grouping together fields of different types.

``` go
type Person struct {
  Name string
  Age int
}

p := Person{Name: "Bob", Age: 25}

```

## Functions
Funcions are first-class citizens and can have multiple return values:

```
func add(x int, y int) int {
  return x + y
}

func swap(x, y string) (string, string) {
  return y, x
}
```

## String Manipulation
Strings are immutable byte slices.
- Concatenation
  ```go
  s := "Hello, " + "world!"

  ```
- Length
  ```go 
  s := "Hello, world"
  l := len(s)
  ```
- Access bytes or slices
```
 // Slice
 sub := s[1:2]
 b := s[1]
```



Resources (minimally verfied):
- https://www.cs.cmu.edu/afs/cs.cmu.edu/academic/class/15440-f11/go/doc/effective_go.html#:~:text=This%20document%20gives%20tips%20for,which%20you%20should%20read%20first.
- https://www.amazon.com/Programming-Language-Addison-Wesley-Professional-Computing/dp/0134190440
- https://go.dev/doc/

