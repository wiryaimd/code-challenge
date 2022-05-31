package com.wiryaimd.codechallenge.ds.stack;

public class StackDs {

    public static void main(String[] args) {

        Stack myStack = new Stack();
        myStack.push(23);
        myStack.push(63);
        myStack.push(13);
        System.out.println(myStack.peek());
        myStack.push(2);
        myStack.push(5);
        System.out.println("size: " + myStack.size());
        System.out.println("pop: " + myStack.pop());
        System.out.println("size: " + myStack.size());
        System.out.println("peek: " + myStack.peek());



    }

}
