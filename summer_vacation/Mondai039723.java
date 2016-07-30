package summer_vacation;

import java.util.Scanner;

public class Mondai039723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("整数入力：");
		int num1 = stdIn.nextInt();
		System.out.print("整数入力：");
		int num2 = stdIn.nextInt();

		//num1がnum2より小さかったら順番を入れ替える
		if(num1 < num2){
			int buffer = num1;
			num1 = num2;
			num2 = buffer;
		}

		//出力部分
		System.out.println("入力された値を降順（大きい順）にソートしました");
		System.out.println("結果は、" + num1 + "," + num2);

	}

}
