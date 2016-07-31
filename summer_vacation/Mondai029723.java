package summer_vacation;

import java.util.Scanner;

public class Mondai029723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("整数入力：");
		int num1 = stdIn.nextInt();
		System.out.print("整数入力：");
		int num2 = stdIn.nextInt();
		System.out.print("整数入力：");
		int num3 = stdIn.nextInt();

		//処理部分
		//昇順にソートをする
		if(num1 > num2){
			int buffer = num2;
			num2 = num1;
			num1 = buffer;
		}
		if(num2 > num3){
			int buffer = num3;
			num3 = num2;
			num2 = buffer;
		}
		if(num1 >num2){
			int buffer = num2;
			num2 = num1;
			num1 = buffer;
		}

		System.out.println("中央値は" + num2);

	}

}
