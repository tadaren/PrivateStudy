package summer_vacation;

import java.util.Scanner;

public class Mondai109723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("正の整数入力：");
		int input = stdIn.nextInt();

		//処理部分
		for(int i = 1; i <= input; i++){
			//スペースの出力
			for(int j = 0; j < (input - i); j++){
				System.out.print(" ");
			}
			//アスタリスクの出力
			for(int j = 0; j < (2*i-1); j++){
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
