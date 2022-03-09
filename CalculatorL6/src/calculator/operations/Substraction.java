package calculator.operations;

public class Substraction extends Operation{

	@Override
	public String getName() {
		return "substraction";
	}

	@Override
	public String getOperator() {
		return "-";
	}

	@Override
	public double calc() {

		return a-b;
	}
	
}
