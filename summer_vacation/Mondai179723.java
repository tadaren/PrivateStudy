package summer_vacation;

import java.util.Scanner;

public class Mondai179723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 入力部分
		System.out.print("距離を入力：");
		int x = stdIn.nextInt();

		// 処理部分
		if (x > 500) {
			System.out.println("運送料金：" + (x + 2300));
		} else if (201 <= x && x <= 500) {
			System.out.println("運送料金：" + (2 * x + 1800));
		} else if (101 <= x && x <= 200) {
			System.out.println("運送料金：" + (4 * x + 1400));
		} else {
			System.out.println("運送料金：" + (8 * x + 1000));
		}

	}

}
