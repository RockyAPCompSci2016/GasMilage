
public class Automobile {
	private double mpg;
	private double gallons;
	
public Automobile(double milespergallon)
{
	mpg=milespergallon;
	double g=0;
	gallons=g;
}
public double fillUp(double f)
{
	gallons=f+gallons;
	return gallons;
}
public double takeTrip(double t)
{
	gallons=gallons-(t/24);
	return gallons;
}
public double reportFuel()
{
	return gallons;
}

}
