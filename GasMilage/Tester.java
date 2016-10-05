
public class Tester {

	public static void main(String[] args) {
		Automobile Stella=new Automobile(24);
		Stella.fillUp(20);
		Stella.takeTrip(100);
		double fuel_left=Stella.reportFuel();
		System.out.println(fuel_left);

	}

}
