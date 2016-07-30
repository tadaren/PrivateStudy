package summer_vacation;

import java.util.Scanner;

public class Mondai089723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("何cmから：");
		int start = stdIn.nextInt();
		System.out.print("何cmまで：");
		int end = stdIn.nextInt();
		System.out.print("何cmごと：");
		int every = stdIn.nextInt();

		//処理部分
		System.out.println("身長\t標準体重");
		for(int i = start; i <= end; i += every){
			System.out.printf("%d\t%.1f\n", i,((i - 100)*0.9));
		}

	}

}
