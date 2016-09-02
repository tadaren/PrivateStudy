package kadai160907;

import java.util.Scanner;

public class PrivateStudy1160907{

	public static void main(String[] args){
		//入力
		Scanner stdIn = new Scanner(System.in);
		System.out.print("姓:"); String s1 = stdIn.nextLine();
		System.out.print("名:"); String s2 = stdIn.nextLine();
		//文字列の合成
		String name = s1+s2;
		//出力
		System.out.println("こんにちは"+name+"さん");
	}
}
