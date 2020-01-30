package org.studyeasy;

import java.util.Stack;

public class S12L07 {
    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        demo.push(0);
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        demo.push(5);

        demo.pop(); // Now LIFO comes in place, so the last demo.push(5); will be out

        System.out.println("Last element that was added to the stack is "+demo.peek()); // Top of the stack
        System.out.println("****");

        for(int temp: demo) {
            System.out.println(temp);
        }

        if(demo.empty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack is NOT empty!");
        }

        int num = 2;
        if(demo.search(num) > 0) {
            System.out.println(num+" is in the stack!");
        } else {
            System.out.println(num+" is NOT in the Stack!");
        }
    }
}