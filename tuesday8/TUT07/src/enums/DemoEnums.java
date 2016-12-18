package enums;
public class DemoEnums {

	public static void main(String[] args) {

		TransportType type = TransportType.HELIKOPTER;

		// Enums can be used without any problems in switch case statements
		switch (type) {
		case HELIKOPTER:
			System.out.println("Heli");
			break;
		default:
			System.out.println("Kein Heli");
			break;
		}
		
		if (type == TransportType.HELIKOPTER) {
			System.out.println(type.toString());
		}
	}

}
