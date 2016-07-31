package summer_vacation;

import java.util.Random;
import java.util.Scanner;

public class Mondai299723 {

	public static void main(String[] args) {
		int count = 0; //組み合わせの数を保管する変数

		for(int i = 0; i <= 2; i++){ //500円玉のループ
			for(int j = 0; j <= 10; j++){ //100円玉のループ
				for(int k = 0; k <= 20; k++){ //50円玉のループ
					for(int l = 0; l <= 100; l++){ //10円玉のループ
						if(i+j+k+l <= 15){ //硬貨が15枚以内なら
							if(500*i + 100*j + 20*k + 10*l == 1000){
								count++;
							}
						}
					}
				}
			}
		}

		//出力
		System.out.println(count + "パターン");
	}

}
