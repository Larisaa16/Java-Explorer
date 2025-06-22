package ro.digitalnation.conditionsloops;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Logic {

	public static boolean ex1(int a, int b,int c) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		if(a>0) count++;
		if(b>0) count++;
		if(c>0) count++;

		return count>=2;
	
	}

	public static int ex2(int a, int b, int c) {
		int max=(a>b?a:b);
		max=(max>c?max:c);
		return max;

	}

	public static int ex3(int a, int b) {
		int sum=0;
		for(int i=a;i<=b;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		return sum;
	}

	public static boolean ex4(int nr) {
		if(nr<=1) return false;
		if(nr==2) return true;
		if(nr%2==0) return false;
		for(int i=3;i<=sqrt(nr);i+=2){
			if(nr%i==0) return false;
		}
		return true;
	}

	public static boolean ex5(String s) {
		int left=0;
		int right=s.length()-1;
		while(left<right){
			if(s.charAt(left)!=s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static int ex6(int n) {
		if(n==1||n==2){
			return 1;
		}
		return ex6(n-1)+ex6(n-2);

	}
	
	public static boolean ex7(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum==n;
	}

	public static int ex8(int x) {

		int f;
		if(x<=-5){
			f=x+10;
		} else if(x>-5 && x<=10){
			f=x*2;
		} else{
			f=x*x+50;
		}
		return f;

	}

	public static double ex9(String valuta, int valoare) {
		double rezultat=0;
		switch(valuta.toUpperCase()){
			case "EUR":
				rezultat=valoare/4.9;
				break;
			case "USD":
				rezultat=valoare/4.6;
				break;
			case "GDP":
				rezultat=valoare/5.6;
				break;
			case "MDL":
				rezultat=valoare/0.25;
				break;
			case "CAD":
				rezultat=valoare/3.3;
				break;
			default:
				System.out.println("nu ati introdus valuta buna");
				rezultat=-1;
		}
		return rezultat;
	}

	public static boolean ex10(String pass) {
		if(pass.length()<8) return false;

		boolean literaMica=pass.matches(".*[a-z].*");
		boolean literaMare=pass.matches(".*[A-Z].*");
		boolean numar=pass.matches(".*[0-9].*");
		boolean charSpecial=pass.matches(".*[^a-zA-Z0-9].*");

		return literaMica&&literaMare&&numar&&charSpecial;
	}
}
