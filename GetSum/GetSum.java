package GetSum;

public class GetSum {

	public static void main(String[] args) {
		int[] array = new int[100];
				
		for (int i = 0; i<array.length; i++) {
			array[i] = i+1;
		}
		int sum = 0;
		int i = 0;
		double sumResult = getSum(0, array, i);
		
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("Sum =" + " " + sumResult);
		System.out.print("Average =" + " " + sumResult/100);
		
	}
	private static int getSum(int sum, int[] array, int i) {
		for (i = 0; i<=array.length-1; i++) {
		sum = sum + array[i];
		}
		return sum;
	}

}
