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

