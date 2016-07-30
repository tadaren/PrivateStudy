package summer_vacation;

import java.util.Scanner;

public class Mondai219723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("整数を入力：");
		int x = stdIn.nextInt();

		//処理部分
		if(x/10 != 0 && x/100 == 0){
			System.out.println("２桁の整数です。");
		}else{
			System.out.println("２桁の整数ではありません。");
		}

	}

}
