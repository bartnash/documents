
# Python

Python is a high-level, interpreted programming language that is widely used for web development, scientific computing, data analysis, artificial intelligence, and more. 

## Variables
Declare variables with a name and assign a value:

```python
my_var = 5 
name = "John"
```

## Data Structures

### Lists
Declare lists with square brackets:

```python
my_list = [1, 2, 3]
```

Access elements by index:

```python 
print(my_list[0]) # Prints 1
```

### Dictionaries 
Declare dictionaries with curly braces:

```python
my_dict = {"name": "John", "age": 30}
```

Access values by key:

```python
print(my_dict["name"]) # Prints "John"
```

## Functions

Define functions with `def`:

```python
def my_function(arg1, arg2):
  print(arg1, arg2)

my_function("Hello", "World") # Prints "Hello World"
```

## String Manipulation

Concatenate strings with `+`:

```python
first_name = "John"
last_name = "Doe"
full_name = first_name + " " + last_name # full_name = "John Doe"
```

Format strings with `format()`:

```python
"{} {}".format(first_name, last_name) # "John Doe"
```

Additional string manipulation:
```python
my_string = "hello world"
print(my_string.upper())  # prints "HELLO WORLD"
print(my_string.replace("world", "Python"))  # prints "hello Python"

```

## Operators

Math operators: `+`, `-`, `*`, `/`, `%`, `**` (exponent) 

Comparison operators: `==`, `!=`, `>`, `<`, `>=`, `<=`

Logical operators: `and`, `or`, `not`

```python
x = 5
y = 10
print(x < y and y > 15)  # prints False
print(x + y)  # prints 15
print(y % x)  # prints 0

```
## Loops

For loop:

```python
for i in [1, 2, 3]:
  print(i) 
```

While loop: 

```python
count = 0
while count < 3:
  print(count)
  count += 1
```

## Command Line Arguments

Import `sys` to access command line args:

```python
import sys 

for arg in sys.argv[1:]:
  print(arg)
```

### argparse

Python has a built-in module called argparse that makes it easy to parse command line arguments. Here is an example of a script that takes a file name as a command line argument:

```python
import argparse

parser = argparse.ArgumentParser()
parser.add_argument("filename", help="the name of the file to check")
args = parser.parse_args()

if os.path.isfile(args.filename):
    print(args.filename + " exists")
else:
    print(args.filename + " does not exist")

```
## Exit Values

Import `sys` and use `sys.exit()` to return an exit code:

```python
import sys

print("Error occurred")
sys.exit(1) 
```
### subprocess
Python has a built-in module called subprocess that makes it easy to execute commands and capture their output and exit status. Here is an example of a script that executes a command and prints its exit status:

```python
import subprocess

result = subprocess.run(["ls", "-l"], capture_output=True)
print(result.returncode)

```

## Hello World Example

```python
import sys
import os.path

for arg in sys.argv[1:]:
  if os.path.exists(arg):
    print(arg, "exists")
  else:
    print(arg, "does not exist")
```

This loops through command line arguments and checks if each one is an existing file, printing the result.

## More complete argparse example

```python
#!/usr/bin/python3
import argparse
import subprocess

parser = argparse.ArgumentParser()
parser.add_argument("-m", "--master", help="master file name",
        required=True)
parser.add_argument("-t", "--true", help="set flag to true", action="store_true")
parser.add_argument("filenames", nargs="+", help="the names of the files to check")
#parser.add_argument("-h", "--help", help="display help", action="help")
args = parser.parse_args()

master_file_name = args.master
flag = args.true
filenames = args.filenames

print("Master file name:", master_file_name)
print("Flag:", flag)
print("Files:", filenames)

for file in filenames:
    result = subprocess.run(["diff", master_file_name, file],
        capture_output=True)
    print(result.returncode)


```
