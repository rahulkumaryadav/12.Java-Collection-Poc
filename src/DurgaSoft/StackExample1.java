package DurgaSoft;

import java.util.Stack;

/**
 * @Author Rahul Yadav
 * Dated :2018-2-07
 * This is child class of vector Contains only one constructor
 * Stack s = new Stack();
 */
public class StackExample1 {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        stack.pop();//element will be removed form the top
        System.out.println(stack);
        System.out.println(stack.peek());//to return the top of the element
        System.out.println(stack.isEmpty());//return true if stack is empty
        System.out.println(stack.search("B"));//return offset form the top of the stack if the object is available otherwise return -1


    }
}
