import java.io.*;
import java.util.*;

/*
We are working on a security system for a badged-access room in our company's building.

Given an ordered list of employees who used their badge to enter or exit the room, write a function that returns two collections:

1. All employees who didn't use their badge while exiting the room - they recorded an enter without a matching exit. (All employees are required to leave the room before the log ends.)

2. All employees who didn't use their badge while entering the room - they recorded an exit without a matching enter. (The room is empty when the log begins.)

Each collection should contain no duplicates, regardless of how many times a given employee matches the criteria for belonging to it.

records1 = [
  ["Paul",     "enter"],
  ["Pauline",  "exit"],
  ["Paul",     "enter"],
  ["Paul",     "exit"],
  ["Martha",   "exit"],
  ["Joe",      "enter"],
  ["Martha",   "enter"],
  ["Steve",    "enter"],
  ["Martha",   "exit"],
  ["Jennifer", "enter"],
  ["Joe",      "enter"],
  ["Curtis",   "exit"],
  ["Curtis",   "enter"],
  ["Joe",      "exit"],
  ["Martha",   "enter"],
  ["Martha",   "exit"],
  ["Jennifer", "exit"],
  ["Joe",      "enter"],
  ["Joe",      "enter"],
  ["Martha",   "exit"],
  ["Joe",      "exit"],
  ["Joe",      "exit"] 
]

Expected output: ["Steve", "Curtis", "Paul", "Joe"], ["Martha", "Pauline", "Curtis", "Joe"]

Other test cases:

records2 = [
  ["Paul", "enter"],
  ["Paul", "exit"],
]

Expected output: [], []

records3 = [
  ["Paul", "enter"],
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
]

Expected output: ["Paul"], ["Paul"]

records4 = [
  ["Raj", "enter"],
  ["Paul", "enter"],
  ["Paul", "exit"],
  ["Paul", "exit"],
  ["Paul", "enter"],
  ["Raj", "enter"],
]

Expected output: ["Raj", "Paul"], ["Paul"]

All Test Cases:
mismatches(records1) => ["Steve", "Curtis", "Paul", "Joe"], ["Martha", "Pauline", "Curtis", "Joe"]
mismatches(records2) => [], []
mismatches(records3) => ["Paul"], ["Paul"]
mismatches(records4) => ["Raj", "Paul"], ["Paul"]

n: length of the badge records array
*/

public class Solution {
  public static void main(String[] argv) {
    // Inputs
    String[][] records1 = {
      {"Paul", "enter"},
      {"Pauline", "exit"},
      {"Paul", "enter"},
      {"Paul", "exit"},
      {"Martha", "exit"},
      {"Joe", "enter"},
      {"Martha", "enter"},
      {"Steve", "enter"},
      {"Martha", "exit"},
      {"Jennifer", "enter"},
      {"Joe", "enter"},
      {"Curtis", "exit"},
      {"Curtis", "enter"},
      {"Joe", "exit"},
      {"Martha", "enter"},
      {"Martha", "exit"},
      {"Jennifer", "exit"},
      {"Joe", "enter"},
      {"Joe", "enter"},
      {"Martha", "exit"},
      {"Joe", "exit"},
      {"Joe", "exit"},
    };

    String[][] records2 = {
      {"Paul", "enter"},
      {"Paul", "exit"},
    };

    String[][] records3 = {
      {"Paul", "enter"},
      {"Paul", "enter"},
      {"Paul", "exit"},
      {"Paul", "exit"},
    };

    String[][] records4 = {
      {"Raj", "enter"},
      {"Paul", "enter"},
      {"Paul", "exit"},
      {"Paul", "exit"},
      {"Paul", "enter"},
      {"Raj", "enter"},
    };
    
    String[][][] recordss = {records1, records2, records3, records4};
    
    for(String[][] records : recordss){
      System.out.println("\n\n****************\n\n");
      for(String[] record : records) {
        System.out.println(Arrays.toString(record));
      }
      var results = processRecords(records);
      System.out.println("Bad Exit - "+Arrays.toString(results[0]));
      System.out.println("Bad Entry - "+Arrays.toString(results[1]));
      
    }

  }
  
  /*
   * Method for 
   */
  public static String[][] processRecords(String[][] records){
    
    //Set to contain list of users currently in the room.
    Set<String> inRoom = new TreeSet<String>();
    
    //List of users who exited without swiping their badge.
    Set<String> badExit = new TreeSet<String>();
    
    //List of users who entered without swiping their badge.
    Set<String> badEnter = new TreeSet<String>();
    
    //Process each badge swipe.
    for (String[] record : records){
      
      switch( record[1]){
        
        case "enter":
        
          if(inRoom.contains(record[0])){
            
            /*  Previous entry recorded for this user, 
             *  they must have exited without swiping.
             */
            badExit.add(record[0]);
            System.out.printf("Duplicate enter %s\n", record[0]);
          } else {
          
            // Add to list of users present in room.
            inRoom.add(record[0]);
          }
          
          break;
          
        case "exit":
          if(!inRoom.contains(record[0])){
            
            /*
             *  No entry was recorded for this user,
             *  they must have entered without swiping.
             */
            badEnter.add(record[0]);
            System.out.printf("Exit without entry %s\n", record[0]);
          } else {
            
            // Remove from list of users present in room.
            inRoom.remove(record[0]);
          }
          
          break;
          
        
      }
      
    }
    
    /*
     * The room should be empty at end of day.  Anyone
     * still listed as in the room will be counted as
     * an exit without swiping.
     */
    if(inRoom.size() > 0){
      for (String record : inRoom.toArray(records[1])){
        badExit.add(record);
      }
    }
    
    String[][] result = {badExit.toArray(String[]::new), badEnter.toArray(String[]::new)}; 
    return result;
    
    
    
  }
}
