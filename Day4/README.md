# Java Programs Collection

This repository contains various Java programs covering topics such as loops, arrays, conditionals, enums, patterns, and more. Each program demonstrates different concepts and problem-solving approaches.

## Files and Descriptions

1. **NestedIfExample.java**  
   Demonstrates nested `if` statements for decision making.

2. **NestedIfExample1.java**  
   Another example of nested `if` statements with multiple conditions.

3. **LeapYearCheck.java**  
   Checks whether a given year is a leap year.

4. **TriangleCheck.java**  
   Determines the type of triangle based on side lengths.

5. **EnumSwitchExample.java**  
   Demonstrates using enums with switch-case statements.

6. **LoopsExample.java**  
   Demonstrates `for`, `while`, and `do-while` loops in Java.

7. **TrianglePattern.java**  
   Prints various triangle patterns using loops.

8. **ForWithArray.java**  
   Iterates over an array using `for` loop and demonstrates escape characters in output.

9. **TwoSum.java**  
   Solves the Two Sum problem using arrays.

10. **TwoArrayIncreasing.java**  
    Checks if two adjacent subarrays of length k are strictly increasing.

11. **MergeTwoSortedArray.java**  
    Merges two sorted arrays into one sorted array.

12. **Palindrome.java**  
    Checks if a given number is a palindrome.

13. **ReverseInteger.java**  
    Reverses a given integer.

14. **LoadingAnimation.java**  
    Demonstrates a console-based loading animation using loops.

15. **Main.java**  
    Contains a comprehensive program (e.g., menu-driven system) demonstrating multiple concepts.

---

## How to Run

1. Make sure you have **Java installed** on your system.
2. Open terminal/command prompt and navigate to the folder containing these files.
3. Compile a Java file:

   ```bash
   javac FileName.java



## program
program



     public class TriangleCheck {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 5;
        System.out.println("Sides are: " + a + ", " + b + ", " + c);

        // Check triangle validity
        boolean isValid = (a + b > c) && (b + c > a) && (a + c > b);

        // Use ternary operator for classification
        String result = isValid
                ? (a == b && b == c) ?
                       "Type: Equilateral Triangle"
                    :   (a == b || b == c || a == c) ? 
                                "Type: Isosceles Triangle"
                        :       "Type: Scalene Triangle"
                : "Not a Valid Triangle.";

        System.out.println(isValid ? "It is a Valid Triangle." : "Not a Valid Triangle.");
        if (isValid) System.out.println(result);
    }
}


