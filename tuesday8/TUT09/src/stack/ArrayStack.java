package stack;

/**
 * An array based stack class.
 * Can save a total of ten elements
 */
public class ArrayStack {

	/** the underlying array that stores our data */
	private Object[] stack;
	/** The current size of the stack. */
	private int size;
	/** the index for inserting new elements*/
	private int index;
	
	public ArrayStack() {
		this.stack = new Object[10];
		this.size = 0;
		this.index = 0;
	}
	
	/**
	 * Pushes the given element onto the stack.
	 * Can hold a maxium of ten elements and ignores any additional elements
	 * until one element gets removed.
	 * @param newElement - the element to be pushed
	 */
	public void push(Object newElement) {
		if (size == 10) {
			// do not add the new Element if there is no space
			return;
		}
		stack[index] = newElement;
		size++;
		index++;
	}
	
	/**
	 * Removes and returns the top element of the stack
	 * @return the element that got removed or null if the stack is empty
	 */
	public Object pop() {
		if (size == 0) {
			return null;
		}
		// index is at the insertion point
		// index - 1 is the last element that got added
		Object result = stack[index - 1];
		stack[index - 1] = null;
		index--;
		size--;
		return result;
	}
	
	/**
	 * Returns the top element of the stack without removing it
	 * @return the top element of the stack or null if the stack is empty
	 */
	public Object top() {
		if (size == 0) {
			return null;
		}
		return stack[index - 1];
	}
}
