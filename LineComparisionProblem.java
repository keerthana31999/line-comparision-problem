import java.util.*;

public class LineComparisonProblem {

	static int UserInput(){
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		return x;
	}

	static double Length(int a, int b, int c, int d){
		double lenOfLine = Math.sqrt(Math.pow((c - a),2) + Math.pow((d - b),2));
		return lenOfLine;
	}

	public static void main(String[] args){
		System.out.println("Welcome to Line Comparison Computation");

		int x1 = UserInput();
		int x2 = UserInput();
		int x3 = UserInput();
		int x4 = UserInput();
		int y1 = UserInput();
		int y2 = UserInput();
		int y3 = UserInput();
		int y4 = UserInput();
		double lenOfLine1 = Length(x1, y1, x2, y2);
		double lenOfLine2 = Length(x3, y3, x4, y4);

		System.out.println("length of First Line: " + lenOfLine1 );

		System.out.println("length of Second Line: " + lenOfLine2 );

		Double len1 = new Double(lenOfLine1);
		Double len2 = new Double(lenOfLine2);

		System.out.println(len1.equals(len2));

		System.out.println(len1.compareTo(len2));
	}
}
