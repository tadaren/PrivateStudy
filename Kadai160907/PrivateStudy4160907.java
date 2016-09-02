package Kadai160907;

public class PrivateStudy4160907{

	public static void main(String[] args){
		//初期の文字列
		String hello = "UchidaShinji";
		//文字列の一部を取り出す
		String s1 = hello.substring(1, 4);//2文字目から4文字目まで
		String s2 = hello.substring(6);//7文字目から最後まで
		String s3 = hello.substring(0);//最初から最後まで
		//出力
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
