package linkedList;



public class LinkedList {

	public static void main(String[] args) {
		Node tail = new Node();
		int length = tail.getLength();
		Node tails = tail.getList(new int[length]);
		System.out.println("Sourse:      " + tail.toString(tails));
		System.out.println("Copy:        " + tail.toString(tail.copy(tails)));
		tail.index(tails, 5);
		System.out.println("AddLastNode: " + tail.toString(tail.addLast(tails, length)));
		System.out.println("DeleteLast:  " + tail.toString(tail.removeLast(tails)));
		Linked<String> stringLinked = new LinkedContainer <> ();
		stringLinked.addLast("Olena");
		stringLinked.addLast("OHII");
		stringLinked.addFirst("HAPPY");
		System.out.println("Size of Double Linked List: " + stringLinked.size());
		System.out.println(stringLinked.getElementByIndex(0));
		
	}
}

