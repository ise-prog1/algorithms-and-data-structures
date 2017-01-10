package list;

/**
 * This class represents an element inside our list.
 */
public class ListElement {
	/** the value that is to be represented */
	private String value;
	/** the list element's previous element */
	private ListElement prev;
	/** the list element's following element */
	private ListElement next;
	
	/**
	 * Creates a single ListElement that is not linked to anything
	 * @param value - the value to be saved
	 */
	public ListElement(String value) {
		this.value = value;
		this.prev = null;
		this.next = null;
	}

	public String getValue() {
		return value;
	}

	public ListElement getPrev() {
		return prev;
	}

	public void setPrev(ListElement prev) {
		this.prev = prev;
	}

	public ListElement getNext() {
		return next;
	}

	public void setNext(ListElement next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "ListElement [value=" + value + "]";
	}

	
}
