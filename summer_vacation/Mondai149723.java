package summer_vacation;

import java.util.Scanner;

public class Mondai149723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("nを入力：");
		int n = stdIn.nextInt();

		//処理部分
		for(int i = 0,count = 0; i >= 0; count++){
			//矢印の為のループ
			for(int j = i; j > 0; j--){
				System.out.print(">");
			}
			//アスタリスクの為のループ
			for(int j = (n-i); j > 0; j--){
				System.out.print("*");
			}
			System.out.println();

			if(count < n-1){
				i++;
			}else{
				i--;
			}
		}

	}

}
