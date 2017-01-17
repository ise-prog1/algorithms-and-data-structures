package generics;

/**
 * This class demonstrates generic Type parameters
 * 
 * @param <T
 *            extends IBanana> - Type for the data
 */
public class Node<T extends IBanana> {

	private Node<T> left;
	private Node<T> right;
	private final T data;

	/**
	 * Constructs a new Node<T>.
	 * 
	 * You can have parameter typed as the type parameter
	 * 
	 * @param data
	 *            - the data to be saved
	 */
	public Node(T data) {
		this.data = data;
		// You cannot instantiate a generic type!
		// this.data = new T();
	}

	/**
	 * This method is possible as we are limiting the used types to sub classes
	 * / implementors of IBanana.
	 * 
	 * @return data.getBanana()
	 */
	public String getDataBanana() {
		return data.getBanana();
	}

	/**
	 * You can use generic type parameters as a return type.
	 * 
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * You can also return generic types which are parameterized with the type
	 * parameter.
	 * 
	 * @return left node
	 */
	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

}
