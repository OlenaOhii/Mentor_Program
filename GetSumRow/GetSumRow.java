package GetSumRow;

public class GetSumRow {

	public static void main(String[] args) {
		double result = getResult();
		System.out.print("Sum =" + " " + result );

	}
	private static double getResult() {
		double sum = 0;
		for (double number = 1; number <=50000; number++) {
			sum = sum + 1/number;
		}
		return sum;
	}

}
