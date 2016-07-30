package summer_vacation;

import java.util.Scanner;

public class Mondai139723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("nを入力：");
		int n = stdIn.nextInt();

		//処理部分
		//行数のループ
		for(int i = 0; i < n; i++){
			//出力するスペースの数だけループ
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			System.out.println("*");
		}

	}

}
