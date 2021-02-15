package Day0215;

import java.util.Stack;

import kr.or.bit.MyStack;
import kr.or.bit.MyStack2;

/*
JAVA API
Stack   Queue 제공


Stack 자료구조 그림 그리고 암기 (응용)
 */
public class Ex05_Stack_Collection {

    public static void main(String[] args) {
        /*
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        System.out.println(s.pop());
        System.out.println(s.pop());
        //System.out.println(s.pop());  java.util.EmptyStackException
        System.out.println(s.isEmpty());//true
        
        MyStack mystack = new MyStack();
        mystack.push("asdf");
        System.out.println(mystack);
        mystack.push("dfdfdf");
        mystack.push("dfdfdf");
        mystack.push("dfdfdf");
        mystack.push("dfdfdf");
        mystack.push("dfdfdf");
        mystack.push("dfdfdf");
        
        System.out.println(mystack);
        mystack.pop();
        System.out.println(mystack);
        mystack.pop();
        mystack.pop();
        mystack.pop();
        mystack.pop();
        
        
        
        System.out.println(mystack);
        */
        
        
        MyStack2 my = new MyStack2(5);
        System.out.println(my.isEmpty());
        System.out.println(my.isFull());
        my.push("A");
        my.push("B");
        my.push("C");
        my.push("D");
        my.push("E");
        
        my.pop();
        my.pop();
        System.out.println(my.toString());
        
    }

}
