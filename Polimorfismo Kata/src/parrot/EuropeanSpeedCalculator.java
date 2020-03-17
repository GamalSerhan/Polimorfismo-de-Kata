package parrot;

public class EuropeanSpeedCalculator implements ParrotSpeed
{

	public double getParrotSpeed(int numberOfCoconuts, double voltage, boolean isNailed) 
	{
		return getBaseSpeed(); 
	}
	private double getBaseSpeed() 
	{
		return 12.0;
	}

}
