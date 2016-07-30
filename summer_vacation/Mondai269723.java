package summer_vacation;

import java.util.Scanner;

public class Mondai269723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 入力部分
		System.out.print("整数n入力：");
		int n = stdIn.nextInt();

		//処理部分
		//行数分のループ
		for(int i = 0; i < n; i++){
			//スペース分のループ
			for(int j = Math.abs(i-(n/2)); j > 0;j--){
				System.out.print(" ");
			}
			//アスタリスク分のループ
			if(i < (n/2+1)){
				for(int j = (2*i+1); j > 0; j--){
					System.out.print("*");
				}
			}else{
				for(int j = Math.abs(2*i-(2*n-1)); j > 0; j--){
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
