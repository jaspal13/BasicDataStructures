import java.util.*;
import java.io.*;
public class StackUsingArray {
	public static void main(String args[])throws IOException{
		StackTest st=new StackTest();
		int ar[]= {-3,4,5,6};
		for (int i:ar) {
			st.push(i);
		}
		//Print all elements in the stack
		if (!st.isEmpty()) {
			Iterator<Integer> it=st.ar.iterator();
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
class StackTest{
	ArrayList<Integer> ar=new ArrayList<Integer>();
	
	void push(int x) {
		ar.add((Integer)x);
	}
	int pop() {
		Integer element=ar.get(ar.size()-1);
		ar.remove(ar.size()-1);
		return (int)element;
	}
	int peek() {
		Integer element=ar.get(ar.size()-1);
		return (int)element;
	}
	boolean isEmpty() {
		if (ar.size()==0)
			return true;
		else
			return false;
	}
	int length() {
		return ar.size();
	}
}
