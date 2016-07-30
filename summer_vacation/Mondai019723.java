package summer_vacation;

import java.util.Scanner;

public class Mondai019723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("整数入力：");
		int num1 = stdIn.nextInt();
		System.out.print("整数入力：");
		int num2 = stdIn.nextInt();
		System.out.print("整数入力：");
		int num3 = stdIn.nextInt();

		//Mathクラスを用いて最小値を求めて表示
		System.out.println("最小値は"+Math.min(num1, Math.min(num2, num3)));

	}

}
