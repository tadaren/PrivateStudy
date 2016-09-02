package kadai160907;

import java.util.Scanner;

public class PrivateStudy3160907{

	public static void main(String[] args){
		//入力
		Scanner stdIn = new Scanner(System.in);
		System.out.print("文字列1:"); String s1 = stdIn.nextLine();
		System.out.print("文字列2:"); String s2 = stdIn.nextLine();
		//文字列の比較をして出力
		if(s1.equals(s2)){
			System.out.println("同じ文字列です");
		}else{
			System.out.println("異なる文字列です");
		}
	}
}
