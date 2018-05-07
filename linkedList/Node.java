package linkedList;

import java.util.Random;
import java.util.Scanner;

public class Node {
	public int value;
	public Node nextValue;
	Random rand = new Random();
	private static Scanner in;
	
	public Node() {
	}
	
	public Node (int value, Node nextValue) {
		this.value = value;
		this.nextValue = nextValue;
	}
	
	public int getLength() {
		System.out.println("Enter any length > 5 of linkedList");
		in = new Scanner(System.in);
		int length = in.nextInt();
		return length;
		}
	
	public Node getList(int[] values) {
		Node tail = null;
		for (int i = values.length - 1; i >=0; i--) {
			values[i]=rand.nextInt(99);
			tail = new Node(values[i], tail);
		}
		return tail;
	}
	
	public String toString(Node tail) {
		if (tail == null) {
			return "*";
		}
		else {
			return tail.value + " -> " + toString(tail.nextValue);
		}
	}
	
	
	public Node addLast (Node tail, int value) {
		tail.nextValue = (tail.nextValue == null) ? new Node (value, null) : addLast(tail.nextValue, value);
		return tail;
	}
	
	public int index(Node tail, int index){
		if (tail == null) {
			return 0;
		}
			int i = index(tail.nextValue, index) + 1;
			if (i == index) {
				System.out.println(i + "th" + " element from tail is " + tail.value);
			}
			return i;
		}
	
	public Node removeLast(Node tail) {
		return tail.nextValue != null ? new Node (tail.value, removeLast(tail.nextValue)) : null;
		
		
	}
      
        	
	
	public Node copy(Node tail) {
		return  tail == null ? null : new Node(tail.value, copy(tail.nextValue));
	}

}
