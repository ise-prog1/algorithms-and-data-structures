package stack;

import list.DoublyLinkedList;

/**
 * A list based stack that can hold an unlimited amount of elements
 */
public class ListStack {

	/**
	 * the list behind the stack
	 */
	private DoublyLinkedList list;

	/**
	 * Creates a new empty stack
	 */
	public ListStack() {
		this.list = new DoublyLinkedList();
	}

	/**
	 * Pushes a given value onto the stack
	 * @param value - the new value
	 */
	public void push(String value) {
		list.insertAtHead(value);
	}
	
	/**
	 * Removes and returns the top of the stack
	 * @return the top of the stack or null if the stack is empty
	 */
	public String pop() {
		return list.removeAtHead();
	}
	
	/**
	 * Returns the top element of the stack without removing it.
	 * @return the top of the stack or null if the stack is empty
	 */
	public String top() {
		return list.getAtHead();
	}
}
