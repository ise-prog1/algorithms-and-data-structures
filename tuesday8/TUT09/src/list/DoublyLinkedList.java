package list;

/**
 * A doubly linked List that saves Strings
 */
public class DoublyLinkedList {

	// The head element. Points to the first element in the list.
	private ListElement head;
	
	/**
	 * Creates a new empty DoublyLinkedList
	 */
	public DoublyLinkedList() {
		this.head = null;
	}
	
	/**
	 * Inserts the given value at the beginning of the list
	 * @param value - the value to be inserted
	 */
	public void insertAtHead(String value) {
		if (head == null) {
			//case list empty.
			head = new ListElement(value);
		} else {
			// case not empty
			ListElement newHead = new ListElement(value);
			// link the oldHead and the new Head
			head.setPrev(newHead);
			newHead.setNext(head);
			// Replace the old head with the new head
			head = newHead;
		}
	}
	
	/**
	 * Removes and returns the first element of the list
	 * @return the first element of the list or null if the list is empty.
	 */
	public String removeAtHead() {
		if (head == null) {
			return null;
		}
		String result = head.getValue();
		head = head.getNext();
		if (head != null) {
			head.setPrev(null);
		}
		return result;
	}
	
	/**
	 * Returns the first element of the list
	 * @return the first element of the list or null if the list is empty
	 */
	public String getAtHead() {
		return head == null ? null : head.getValue();
	}
	
	/**
	 * Inserts the given value at the end of the list
	 * @param value the value to be inserted
	 */
	public void insertAtEnd(String value) {
		if (head == null) {
			// list is empty
			head = new ListElement(value);
		} else {
			ListElement current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			//current is now the last element in the list
			// the last element is defined as having no next value
			ListElement newLastElement = new ListElement(value);
			// link the new element to the old last element
			current.setNext(newLastElement);
			newLastElement.setPrev(current);
		}
	}
	
	/**
	 * Tries to find the given value inside the list
	 * Returns null if the value is nowhere to be found.
	 * @param value
	 * @return the ListElement for the given value or null if the value does not exist
	 */
	public ListElement get(String value) {
		ListElement current = head;
		while (current != null && !current.getValue().equals(value)) {
			current = current.getNext();
		}
		return current;
	}
	
	/*
	 * Generates a string representation of the list 
	 */
	public String toString() {
		if (head == null) {
			return "[]";
		}
		String result = "[";
		ListElement current = head;
		while (current.getNext() != null) {
			result += current.getValue() + ",";
			current = current.getNext();
		}
		//current is now the last value
		result += current.getValue();
		result += "]";
		return result;
	}
}
