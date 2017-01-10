package list;

/**
 * This class tests our DoublyLinkedList
 */
public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertAtHead("erster");
		list.insertAtEnd("zweiter");
		list.insertAtEnd("dritter");
		list.insertAtHead("nullter");
		System.out.println(list);
		System.out.println("Nicht da: " + list.get("nicht-da"));
		System.out.println("nullter: " + list.get("nullter"));
		
	}

}
