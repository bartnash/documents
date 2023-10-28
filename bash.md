
# Bash Scripting Overview

Bash is a commonly used shell and scripting language in Linux and macOS. Here are some key concepts and examples:

## Variables

To declare a variable in Bash, you simply assign a value to a name. There should be no spaces around the equals sign. Here is an example:

```bash
name="John"
num=42
```

Reference variables with `$`: 

```bash 
echo "Hello $name"
```

## Lists

In Bash, lists are called arrays. To declare an array, you can use the following syntax: 

```bash
names=("John" "Jane" "Jim")
echo ${names[0]} # John
``` 

## Functions

Define with `function name() { }`:

```bash
function hello() {
  echo "Hello $1"
}

hello "John"
```

## Strings

Get length with `${#string}`:

```bash
str="Hello"
echo ${#str} # 5
```

Substring with `${string:start:length}`:

```bash
echo ${str:0:2} # He
```

## Operators

Arithmetic: `+ - * / %`

Logical: `-a -o !` 

Comparison: `-eq -ne -gt -lt`


```bash
# Logical operators
if [ $x -eq 1 ] && [ $y -eq 2 ]; then
  echo "Both conditions are true"
fi

# Mathematical operators
x=1
y=2
z=$((x + y)) # 3

```

## Loops

For loop:

```bash
for i in 1 2 3; do
  echo $i
done

for x in {1..5} do
  echo $x
done

```

While loop: 

```bash
i=0 
while [ $i -lt 3 ]; do
  echo $i
  i=$((i+1)) 
done
```

Looping over array content:
```bash
my_array=(value1 value2 value3)
for i in "${my_array[@]}"; do
  echo $i
done
```

## Arguments

Access with `$1`, `$2`, etc:

```bash
echo "Hello $1"
```

## Other

Comments with `#`

Output with `echo`


## Handling Exit Values

Get exit value of last command with `$?`:

```bash
grep "foo" file.txt
echo $? # 0 if found, 1 if not found

ls /nonexistent
if [ $? -ne 0 ]; then
  echo "Command failed"
fi
```

Exit script early with exit code:

```bash 
if [ $? -ne 0 ]; then
  echo "Error occurred"
  exit 1
fi
```

Here is an example stand-alone bash script that displays "Hello World", loops through command line arguments, and checks if each argument is an existing file:

```bash
#!/bin/bash

# Display Hello World
echo "Hello World"

# Loop through command line arguments
for arg in "$@"
do
  # Check if argument is existing file
  if [ -f "$arg" ] 
  then
    echo "$arg is a file"
  else 
    echo "$arg is not a file"
  fi
done
```

To use it, save the script as `hello.sh`, make it executable with `chmod +x hello.sh`, and run it like:

```
./hello.sh file1.txt file2.txt nofile.txt
```

It will output:

```
Hello World
file1.txt is a file 
file2.txt is a file
nofile.txt is not a file
```

The `"$@"` handles all command line arguments, and it loops through checking if each `-f` exists as a file.
