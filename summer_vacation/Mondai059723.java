package summer_vacation;

import java.util.Scanner;

public class Mondai059723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("カウントダウンをします。");
		//入力部分
		int in = -1;
		for(;in < 0;){
			System.out.print("正の整数値：");
			in = stdIn.nextInt();
		}

		//処理部分
		for(int i = in; i >= 0; i--){
			System.out.println(i);
		}

	}

}
