#!/usr/bin/python3
import argparse
import os

parser = argparse.ArgumentParser()
parser.add_argument("filenames", nargs="+", help="the names of the files to check")
args = parser.parse_args()

for filename in args.filenames:
    if os.path.isfile(filename):
        print(filename + " exists")
    else:
        print(filename + " does not exist")

