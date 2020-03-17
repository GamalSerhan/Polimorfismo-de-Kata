package parrot;

public class AfricanSpeedCalculator implements ParrotSpeed
{
	public double getParrotSpeed(int numberOfCoconuts, double voltage, boolean isNailed) 
	{
		return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
	}
	private double getLoadFactor() 
	{
	        return 9.0;
	}

	private double getBaseSpeed() 
	{
	        return 12.0;
	}
}

