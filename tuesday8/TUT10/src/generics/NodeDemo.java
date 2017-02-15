package generics;

/**
 * This class demonstrates using generics
 */
public class NodeDemo {

	public static void main(String[] args) {
		Node<IBanana> node = new Node<IBanana>(new BananaClass());
		// Node<String> bad = new Node<String>("");
		// String does not implement IBanana
		System.out.println(node.getDataBanana());
		
		GenericList<Object> list = new GenericList<>();
		// We can add Sub classes without any problem
		list.add("AAAA");
		list.add("BBB");
		System.out.println(list.get(0));
	}

}
