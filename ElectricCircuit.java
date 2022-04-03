public class ElectricCircuit
{
	//Data members
	private double voltage;
	private double resistance;

	//Constructors
	public ElectricCircuit(double voltage, double resistance)
	{
		this.voltage = voltage;
		this.resistance = resistance;
	}
	
	//Methods
	public double ComputeCurrent()
	{
		double result = voltage / resistance;

		return result;
	}
}
