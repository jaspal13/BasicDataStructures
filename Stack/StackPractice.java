/*Initialize a stack containing positive and negative integers. The stack would contain the following numbers -5,-3,2,4,6*/
import java.io.*;
import java.util.*;
public class StackPractice {
	public static void main(String args[]) throws IOException{
		//Using built in stack method
		int ar[]= {-5,-3,2,4,6};
		Stack<Integer> st = new Stack<Integer>();
		for (int i:ar) {
			st.push(i);
		}
		//Print all elements in the stack
		if (!st.isEmpty()) {
			Iterator<Integer> it=st.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		//Peek on the stack
		System.out.println(st.peek());
		//Pop all elements from the stack
		while(!st.isEmpty()) {
			int popped=(int)st.pop();
			System.out.println(popped);
		}
	}
}
