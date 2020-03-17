package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts = 0;
    private double voltage;
    private boolean isNailed;


    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() 
    {
    	ParrotSpeed parrotSpeed = null;
        switch(type) 
        {
            case EUROPEAN:
            	parrotSpeed = new EuropeanSpeedCalculator();
            	break;
            case AFRICAN:
            	parrotSpeed = new AfricanSpeedCalculator();
            	break;
            case NORWEGIAN_BLUE:
                parrotSpeed = new NorwegianBlueSpeed();
                break;
        }
        throw new RuntimeException("Should be unreachable");
    }

}
