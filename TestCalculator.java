import java.util.Scanner;
class TestCalculator
{
	public static void main(String[] args)
	{
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		Calculator c = new Calculator();
		c.setfirstNumber(sc.nextDouble());
		c.setsecondNumber(sc.nextDouble());
		do
		{
			System.out.println("Enter 1 to add");
			System.out.println("Enter 2 to subtract");
			System.out.println("Enter 3 to multiply");
			System.out.println("Enter 4 to divide");
			System.out.println("Enter 5 to exit");
			number = sc.nextInt();
			switch(number)
			{
				case 1: System.out.println("Addition : "+c.add());
						break;
				case 2: System.out.println("Subtraction : "+c.subtract());
						break;
				case 3: System.out.println("Multiplication : "+c.multiply());
						break;
				case 4: System.out.println("Division : "+c.divide());
						break;		
			}
		}while(number != 5);
	}
}