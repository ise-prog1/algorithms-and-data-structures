import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * This class demonstrates some basic usage of the Java Collections API
 * 
 * This content was created on request by students and is not relevant for now.
 */
public class ArrayListDemo {



	public static void main(String[] args) {
		ArrayList<AbstractBaseClass> list = new ArrayList<>();
		ClassOne a = new ClassOne();
		ClassTwo b = new ClassTwo();
		// You can add Subclasses of AbstractBaseClass to any list
		list.add(a);
		list.add(b);
		// Returns the correct type of the list element thanks to Generics
		AbstractBaseClass a1 = list.get(0);
		System.out.println(a1);
		// The Deque Interface is a combination of a stack and a queue.
		// Typesafe thanks to Generics
		Deque<String> stack = new LinkedList<>();
		stack.push("String");
		System.out.println(stack.pop());
 	}

}
