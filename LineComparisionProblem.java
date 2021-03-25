import java.util.*;

public class LineComparisonProblem {

	public static void main(String[] args){
		System.out.println("Welcome to Line Comparison Computation");

		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter x1 value: ");
		int x1 = input1.nextInt();

		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter y1 value: ");
		int y1 = input2.nextInt();

		Scanner input3 = new Scanner(System.in);
                System.out.println("Enter x2 value: ");
                int x2 = input3.nextInt();

                Scanner input4 = new Scanner(System.in);
                System.out.println("Enter y2 value: ");
                int y2 = input4.nextInt();

		double length = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		System.out.println(length);
	}
}
