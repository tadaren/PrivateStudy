package summer_vacation;

import java.util.Scanner;

public class Mondai159723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("nを入力：");
		int n = stdIn.nextInt();

		//処理部分
		//上半分のループ
		for(int i = 0; i <= n; i++){
			//スペースの為のループ
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
			//アスタリスクの為のループ
			for(int j = 0; j < n; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//下半分のループ
		for(int i = 0; i < n; i++){
			//スペースの為のループ
			for(int j = 1; j < (n-i); j++){
				System.out.print(" ");
			}
			//アスタリスクの為のループ
			for(int j = 0; j < n; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
