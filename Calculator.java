class Calculator
{
	private double firstNumber, secondNumber;
	void setfirstNumber(double fn)
	{
		firstNumber = fn;
	}
	double getfirstNumber()
	{
		return firstNumber;
	}
	void setsecondNumber(double sn)
	{
		secondNumber = sn;
	}
	double getsecondNumber()
	{
		return secondNumber;
	}
	double add()
	{
		return firstNumber + secondNumber;
	}
	double subtract()
	{
		return firstNumber - secondNumber;
	}
	double multiply()
	{
		return firstNumber * secondNumber;
	}
	double divide()
	{
		if(secondNumber == 0)
			return 0;
		return firstNumber / secondNumber;
	}
}