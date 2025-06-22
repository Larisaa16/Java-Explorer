package ro.digitalnation.conditionsloops;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(Logic.ex1(in.nextInt(), in.nextInt(), in.nextInt()));
		System.out.println("Cel mai mare numar este: " + Logic.ex2(in.nextInt(), in.nextInt(), in.nextInt()));
		int ex_3 = Logic.ex3(in.nextInt(), in.nextInt());
		System.out.println(ex_3);
		boolean ex_4= Logic.ex4(in.nextInt());
		System.out.println(ex_4);
		Logic.ex5(in.next());
		Logic.ex6(in.nextInt());
		Logic.ex7(in.nextInt());
		Logic.ex8(in.nextInt());
		double ex=Logic.ex9(in.next(),in.nextInt());
		System.out.println(ex);
		Logic.ex10(in.next());
	}

	
}
