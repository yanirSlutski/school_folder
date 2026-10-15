package genrlised_lists;

public class Expression {
	private int num1;
	private int num2;
	private char oprator;
	
	public Expression(int num1, int num2, char oprator) {
		this.num1 = num1;
		this.num2 = num2;
		this.oprator = oprator;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public char getOprator() {
		return oprator;
	}

	public void setOprator(char oprator) {
		this.oprator = oprator;
	}
	
	public double calculate()
	{
		double result = 0;
		if(this.oprator == '+')
		{
			result = num1 + num2;
		}
		else if(this.oprator == '-')
		{
			result = num1 - num2;
		}
		else if(this.oprator == '*')
		{
			result = num1 * num2;
		}
		else if(this.oprator == '/')
		{
			result = num1 / num2;
		}
		else
		{
			System.out.println("not a valid oprator (+, - , *, /");
		}
		return result;	
	}
}
