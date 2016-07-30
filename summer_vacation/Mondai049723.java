package summer_vacation;

import java.util.Scanner;

public class Mondai049723 {

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
		if(num1 > num2){
			int buffer = num1;
			num1 = num2;
			num2 = buffer;
		}
		if(num2 > num3){
			int buffer = num2;
			num2 = num3;
			num3 = buffer;
		}
		if(num1 > num2){
			int buffer = num1;
			num1 = num2;
			num2 = buffer;
		}

		//出力部分
		System.out.println("入力された値を昇順（小さい順）にソートしました");
		System.out.println("結果は、" + num1 + "," + num2 + "," + num3);

	}

}
