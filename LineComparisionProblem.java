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

		Scanner input5 = new Scanner(System.in);
                System.out.println("Enter x3 value: ");
                int x3 = input5.nextInt();

                Scanner input6 = new Scanner(System.in);
                System.out.println("Enter y3 value: ");
                int y3 = input6.nextInt();

                Scanner input7 = new Scanner(System.in);
                System.out.println("Enter x4 value: ");
                int x4 = input7.nextInt();

                Scanner input8 = new Scanner(System.in);
                System.out.println("Enter y4 value: ");
                int y4 = input8.nextInt();

		double lenOfFirstLine = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		System.out.println(lenOfFirstLine);

		double lenOfSecondLine = Math.sqrt(Math.pow((x4 - x3),2) + Math.pow((y4 - y3),2));
                System.out.println(lenOfSecondLine);

		Double len1 = new Double(lenOfFirstLine);
		Double len2 = new Double(lenOfSecondLine);

		System.out.println(len1.equals(len2));
	}
}
