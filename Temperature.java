public class Temperature
{
	//Finals
	private final int FREEZING_TEMPERATURE = 32;
	private final double F_TO_C_CONVERSION_FACTOR = 5.0 / 9.0;
	private final double C_TO_F_CONVERSION_FACTOR = 9.0 / 5.0;

	//Data Members
    private double degrees;
    private char units;				//'C' for Celsius, 'F' for Fahrenheit

    //Constructors
 
    //Default Constructor
    public Temperature()
    {
        degrees = 0;
        units = 'C';
    }
    
    public Temperature(double degrees, char units)
    {
        this.degrees = degrees;
        this.units = units;
    }

    public Temperature(double degrees)
    {
        this.degrees = degrees;
        this.units = 'C';
    }

    public Temperature(char units)
    {
        this.degrees = 0;
        this.units = units;
    }
    
    //Getters (Accessor)
    public double getFahrenheit()
    {
        switch(units)
        {
	        case 'F': case 'f':
	        {
	        	long roundedDegrees = Math.round(degrees*10);
	        	
	            return roundedDegrees / 10.0;
	        }
	        case 'C': case 'c':
	        {
	            double convertedDegrees = (C_TO_F_CONVERSION_FACTOR * degrees) + FREEZING_TEMPERATURE;
	            
	            long roundedDegrees = Math.round(convertedDegrees * 10);
	        	
	            return roundedDegrees / 10.0;
	        }
	        default:
	            return Math.round(degrees * 10) / 10.0;
        }
    }

    public double getCelsius()
    {
        switch(units)
        {
	        case 'F': case 'f':
	        {
	            double convertedDegrees = F_TO_C_CONVERSION_FACTOR * (degrees - FREEZING_TEMPERATURE);
	            
	            long roundedDegrees = Math.round(convertedDegrees * 10);
	        	
	            return roundedDegrees / 10.0;
	        }
	        case 'C': case 'c':
	        {
	        	long roundedDegrees = Math.round(degrees * 10);
	        	
	            return roundedDegrees / 10.0;
	        }
	        default:
	            return Math.round(degrees * 10) / 10.0;
        }
    }

    //Setters (Mutators)

    public void set(double degrees, char units)
    {
        this.degrees = degrees;
        this.units = units;
    }

    public void set(double degrees)
    {
        this.degrees = degrees;
    }

    public void set(char units)
    {
        this.units = units;
    }

    //Three comparison methods.

    //To avoid floating-point representational errors, 
    //convert temperatures to a long integer.
    //See IEEE-754 FPS (Floating Point Standard) https://en.wikipedia.org/wiki/IEEE_754
    
    public boolean equals(Temperature another)
    {
        //Use same units for comparison
    	long temp1 = (long)(this.getCelsius() * 10);
    	long temp2 = (long)(another.getCelsius() * 10);
    
        return (temp1 == temp2);
    }

    public boolean isGreaterThan(Temperature another)
    {
        //Use same units for comparison
    	long temp1 = (long)(this.getCelsius() * 10);
    	long temp2 = (long)(another.getCelsius() * 10);
    	
    	return (temp1 > temp2);
    }

    public boolean isLessThan(Temperature another)
    {
        //Use same units for comparison
    	long temp1 = (long)(this.getCelsius() * 10);
    	long temp2 = (long)(another.getCelsius() * 10);
    	
    	return (temp1 < temp2);
    }
}

