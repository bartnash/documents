# JUnit




```java
import java.io.*;
import java.util.*;
import javafx.util.Pair;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.*;

public class Solution {
  public String reverse(String input){
    
    StringBuilder builder = new StringBuilder();
    for(int i=input.length()-1; i>=0; --i){
      builder.append(input.charAt(i));
    }
    return builder.toString();
    
  }
  public static void main(String[] argv) {
    System.out.println("Hello, world!");
    System.out.println("This is a fully functioning Java environment.");
    
    
    //JUnitCore junit = new JUnitCore();
    //junit.run(Solution.TestSolution.class);
    
    //JUnitCore.main("Solution.TestSolution");
    JUnitCore.main(Solution.TestSolution.class.getName());
    
  }

public static class TestSolution {
    
    @Test
    public void testReverse(){
      Solution solution = new Solution();
      System.out.println("Testing reverse.");
      assertEquals("ahplaxx", solution.reverse("alpha"));
    }
  }

```
