package summer_vacation;

import java.util.Scanner;

public class Mondai189723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 入力部分
		System.out.print("入力a：");
		int a = stdIn.nextInt();
		System.out.print("入力b：");
		int b = stdIn.nextInt();

		//処理部分
		if(a == b){
			System.out.println("出力x:0");
		}else{
			System.out.println("出力x:1");
		}

	}

}
