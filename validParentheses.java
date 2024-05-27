import java.util.*;
import java.io.*;

class Solution {
    public boolean isValid(String s) {
        
        Stack <Character> stack = new Stack <Character> ();

        char [] arrayOfChars = s.toCharArray();

        for(char bracketType : arrayOfChars) {
            
            if (bracketType == '(' || bracketType == '[' || bracketType == '{') {
                stack.push(bracketType);
            }

            else if ((bracketType == ')' || bracketType == '}' || bracketType == ']') && stack.isEmpty()) {
                return false;
            }

            else if (bracketType == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                }

                else return false;
            }

            else if (bracketType == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                }

                else return false;
            }

            else if (bracketType == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                }

                else return false;
            }
        }

        if (!stack.isEmpty()) return false;

        return true;
    }
}