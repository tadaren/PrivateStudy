package summer_vacation;

import java.util.Scanner;

public class Mondai099723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("何個*を表示しますか ：");
		int input = stdIn.nextInt();

		//処理部分
		for(int i = 1; i <= input; i++){
			System.out.print("*");
			if((i % 5) == 0){
				System.out.println();
			}
		}

	}

}
