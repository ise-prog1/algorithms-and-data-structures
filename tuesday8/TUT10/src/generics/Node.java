package generics;

public class Node<T extends IBanana> {

	private Node<T> left;
	private Node<T> right;
	private T data;
	
	public Node(T data) {
		this.data = data;
		// You cannot instantiate a generic type!
		//this.data = new T();
	}

	public String getDataBanana() {
		return data.getBanana();
	}
	
	
	public T getData() {
		return data;
	}
	
}
