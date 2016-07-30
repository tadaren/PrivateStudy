package summer_vacation;

import java.util.Scanner;

public class Mondai239723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 入力部分
		System.out.print("整数aを入力：");
		int a = stdIn.nextInt();
		System.out.print("整数bを入力：");
		int b = stdIn.nextInt();
		System.out.println("(0) a + b\n(1) a - b\n(2) a * b\n(3) a / b\n(4) a % b");
		System.out.print("演算コードを入力：");
		int code = stdIn.nextInt();

		//処理部分
		if(code == 0){
			System.out.println("a + b = " + (a + b));
		}else if(code == 1){
			System.out.println("a - b = " + (a - b));
		}else if(code == 2){
			System.out.println("a * b = " + (a * b));
		}else if(code == 3){
			System.out.println("a / b = " + (a / b));
		}else if(code == 4){
			System.out.println("a % b = " + (a % b));
		}else{
			System.out.println("入力エラー");
		}
	}

}
