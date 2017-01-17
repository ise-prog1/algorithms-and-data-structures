package generics;

public class NodeDemo {

	public static void main(String[] args) {
		Node<BananaClass> node = new Node<BananaClass>(new BananaClass());
		System.out.println(node.getDataBanana());
	}

}
