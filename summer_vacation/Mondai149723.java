package summer_vacation;

import java.util.Scanner;

public class Mondai149723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("nを入力：");
		int n = stdIn.nextInt();

		//処理部分
		//上半分ループ
		for(int i = 1; i < n; i++){
			//矢印の為のループ
			for(int j = 1; j < i; j++){
				System.out.print(">");
			}
			//アスタリスクの為のループ
			for(int j = 0; j <= (n-i); j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//下半分ループ
		for(int i = 1; i <= n; i++){
			//矢印の為のループ
			for(int j = (n-i); j > 0; j--){
				System.out.print(">");
			}
			//アスタリスクの為のループ
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
