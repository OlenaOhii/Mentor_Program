package linkedList;



public class LinkedContainer<E> implements Linked<E> {
	Node<E> firstNode;
	Node<E> lastNode;
	int size = 0;
	
	public LinkedContainer() {
		this.lastNode = new Node<E> (null, firstNode, null);
		this.firstNode = new Node<E> (null, null, lastNode);
	}
	
	@Override
	public void addLast(E e) {
		Node<E> prevElement = lastNode;
		prevElement.setCurrentElement(e);
		lastNode = new Node<E>(null, prevElement, null);
		prevElement.setnextElement(lastNode);
		size ++;
	}


	@Override
	public void addFirst(E e) {
		Node<E> nextElement = firstNode;
		nextElement.setCurrentElement(e);
		firstNode = new Node<E> (null, null, nextElement);
		nextElement.setPrevElement(firstNode);
		size++;
	}


	@Override
	public int size() {
		return size;
	}


	@Override
	public E getElementByIndex(int counter) {
		Node<E> result = firstNode.getNextElement();
		for (int i = 0; i < counter; i++) {
			result = getNextElement(result);
		}
		return result.getCurrentElement();
	}
	
	private Node<E> getNextElement(Node<E> current) {
		return current.getNextElement();
	}


	private class Node<E> {
		private E currentElement; 
		private Node<E> nextElement;
		private Node<E> prevElement;
	
		private Node(E currentElemen, Node<E> prevElement , Node<E> nextElement) {
			this.currentElement = currentElement;
			this.prevElement = prevElement;
			this.nextElement = nextElement;
		}
		
	
	public void setCurrentElement (E currentElement) {
		this.currentElement = currentElement;
	}

	public E getCurrentElement () {
		return currentElement;
	}
	
	public void setnextElement (Node<E> nextElement) {
		this.nextElement = nextElement;
	}
	
	public Node<E> getNextElement() {
		return nextElement;
	}
	public Node<E> getPrevElement (Node<E> prevElement) {
		return prevElement;
	}
	
	public void setPrevElement(Node<E> prevElement) {
		this.prevElement = prevElement;
	}
	}
}
