package summer_vacation;

import java.util.ArrayList;
import java.util.Scanner;

public class Mondai029723_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> inList = new ArrayList<Integer>();
		//入力部分(入力はリストに入れる)
		System.out.print("整数入力：");
		inList.add(stdIn.nextInt());
		System.out.print("整数入力：");
		inList.add(stdIn.nextInt());
		System.out.print("整数入力：");
		inList.add(stdIn.nextInt());

		//リストのソート
		inList.sort(null);

		//入力は3つなので2つ目が中央値で、それを出力する
		System.out.println("中央値は"+inList.get(1));
	}

}
