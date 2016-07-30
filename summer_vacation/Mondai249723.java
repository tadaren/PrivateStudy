package summer_vacation;

import java.util.Scanner;

public class Mondai249723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 入力部分
		System.out.print("整数を入力：");
		int num = stdIn.nextInt();

		//処理部分
		if(num / 1000 != 0){
			System.out.println("その整数は4桁です");
		}else if(num / 100 != 0){
			System.out.println("その整数は3桁です");
		}else if(num / 10 != 0){
			System.out.println("その整数は2桁です");
		}else{
			System.out.println("その整数は1桁です");
		}

	}

}
