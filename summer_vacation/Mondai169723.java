package summer_vacation;

import java.util.Scanner;

public class Mondai169723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//入力部分
		System.out.print("身長入力(cm):");
		double height = stdIn.nextDouble();
		System.out.print("体重入力(kg):");
		double weight = stdIn.nextDouble();

		//処理部分
		double standard = height - 110;
		if((weight/standard) > 1.2){
			System.out.println("You are FAT!!");
		}else if((weight/standard) < 0.8){
			System.out.println("You are THIN!!");
		}else{
			System.out.println("You are STANDARD!!");
		}

	}

}
