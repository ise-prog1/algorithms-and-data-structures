package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * This class demonstrates type boundaries
 * 
 * @param <T>
 *            Type of the stored elements
 */
public class GenericList<T> {

	private List<T> list = new LinkedList<>();

	/**
	 * Adds an element to the list. The element can be a sub type of the defined
	 * list
	 * 
	 * @param element
	 */
	public <K extends T> void add(K element) {
		this.list.add(element);
	}

	/**
	 * Returns the value at the given position i.
	 * 
	 * @param i
	 *            the position
	 * @return the value
	 */
	public T get(int i) {
		return this.list.get(i);
	}

	/**
	 * We can set an lower bound with super. This enables us to return an even
	 * more generic list
	 */
	public List<? super T> getList() {
		// return list;
		// allowed as T extends Object
		return new LinkedList<Object>();
	}
}
