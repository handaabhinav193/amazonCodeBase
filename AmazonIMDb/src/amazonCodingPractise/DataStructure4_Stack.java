package amazonCodingPractise;

import java.util.Stack;

public class DataStructure4_Stack {

	public static void stackPushEx(Stack st, int val) {
		System.out.println("Before Push Stack: " +st);
		System.out.println("Push("+val+")");
		st.push(val);
		System.out.println("After Push Stack: " +st);
	}
	
	public static void stackPopEx(Stack st) {
		System.out.println("Before Pop Stack: " +st);
		int popValue = (Integer)st.pop();
		System.out.println("Ineteger Popped: " +popValue);
		System.out.println("After Pop Stack: " +st);
	}
	
	public static void main(String[] args) {
		Stack st = new Stack();
		
		System.out.println("Function pushing value in the Stack");
		stackPushEx(st,10);
		stackPushEx(st,29);
		stackPushEx(st,11);
		stackPushEx(st,21);
		
		System.out.println("Function poping value out of the Stack");
		stackPopEx(st);

	}

}
