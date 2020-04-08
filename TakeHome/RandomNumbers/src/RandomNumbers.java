import java.text.DecimalFormat;

public class RandomNumbers {
	public static void main(String[] args) {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		double sum = 0;
		System.out.println("Random Numbers are:");
		for(int i=0;i<10;i++) {
			String temp = numberFormat.format(Math.random());
			System.out.println(i+1 +": " +temp);
			sum = sum + Double.parseDouble(temp);
		}
		System.out.println("Sum of 10 Random Numbers is: " + sum);
		
	}

}
