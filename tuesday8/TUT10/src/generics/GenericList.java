package generics;

import java.util.LinkedList;
import java.util.List;

public class GenericList<T> {

	private List<T> list = new LinkedList<>();
	
	public <K extends T> void add(K element) {
		this.list.add(element);
	}
	
	public  T get(int i) {
		return this.list.get(i);
	}
	
	public List<? super T> getList() {
		//return list;
		return new LinkedList<Object>();
	}
}
