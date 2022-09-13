package ETA_SB.jntu_calc_application;

public class Calculator {
	public double doAdd(double num1, double num2) {
		return num1 + num2;
	}

	public double doSub(double num1, double num2) {
		//comment line
		return num1 - num2;
	}

	public double doMul(double num1, double num2) {
		return num1 * num2;
	}

	public double doDiv(double num1, double num2) {
		return num1 / num2;
	}
	public double doIncrementByOne(double num1)
	{
		return doAdd(num1, 1);
	}
	public double doFact(double num1) {
		if( num1 == 0 )
		{
			return 1;
		}
		else
		{
			return doMul(num1,doFact(num1-1));
		}
	}

}
