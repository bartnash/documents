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
