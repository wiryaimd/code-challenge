package com.wiryaimd.codechallenge.leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        if (s.trim().isEmpty()){
            return false;
        }

        Stack<String> brackets = new Stack<>();
        brackets.push(String.valueOf(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            switch (s.charAt(i)){
                case ')':
                    if (!brackets.isEmpty() && brackets.peek().equalsIgnoreCase("(")){
                        brackets.pop();
                        continue;
                    }
                    break;
                case '}':
                    if (!brackets.isEmpty() && brackets.peek().equalsIgnoreCase("{")){
                        brackets.pop();
                        continue;
                    }
                    break;
                case ']':
                    if (!brackets.isEmpty() && brackets.peek().equalsIgnoreCase("[")){
                        brackets.pop();
                        continue;
                    }
                    break;
            }

            brackets.push(String.valueOf(s.charAt(i)));
        }

        return brackets.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}()(){}{}"));
        System.out.println(isValid("{[()]}"));
        System.out.println(isValid("{[(]]}]"));
        System.out.println(isValid("{[()]}{}"));
        System.out.println(isValid("{[()]}{}]"));
        System.out.println(isValid("{[()]}{}]]]]"));
        System.out.println(isValid("[{[()]}{}]]]]"));
        System.out.println(isValid("[[[[{[()]}{}]]]]"));
        System.out.println(isValid("[[[[{{[()]}{}]]]]"));
    }

}
