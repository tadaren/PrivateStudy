package summer_vacation;

import java.util.Scanner;

public class Mondai079723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1からnまでの和を求めます。");
		//入力部分
		int in = -1;
		for(;in < 0;){
			System.out.print("nの値：");
			in = stdIn.nextInt();
		}

		//処理部分
		int total = 0;
		for(int i = 1; i <= in; i++){
			total += i;
			//式の出力
			System.out.print(i);
			//式の最後のイコールの出力
			if(i == in){
				System.out.print(" = ");
				break;
			}
			System.out.print(" + ");
		}
		System.out.println(total);//合計の出力

	}

}
