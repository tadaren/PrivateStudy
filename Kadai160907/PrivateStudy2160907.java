package Kadai160907;

import java.util.Scanner;

public class PrivateStudy2160907{

	public static void main(String[] args){
		//入力
		Scanner stdIn = new Scanner(System.in);
		System.out.print("名前:"); String name = stdIn.nextLine();
		//文字列の長さを求める
		int length = name.length();
		//出力
		System.out.println(name+"さんは"+length+"文字です");

	}
}
