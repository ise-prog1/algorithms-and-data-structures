package generics;

/**
 * A simple class that implements the IBanana interface
 */
public class BananaClass implements IBanana, Comparable<IBanana>{

	@Override
	public String getBanana() {
		return "Normal Banana";
	}

	@Override
	public int compareTo(IBanana o) {
		return getBanana().compareTo(o.getBanana());
	}

}
