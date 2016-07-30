package summer_vacation;

import java.util.Scanner;

public class Mondai209723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 入力部分
		System.out.print("職階：");
		int shokukai = stdIn.nextInt();
		System.out.print("資格：");
		int shikaku = stdIn.nextInt();
		System.out.print("年数：");
		int n = stdIn.nextInt();

		//処理部分
		if(shokukai == 0){
			if(shikaku == 0){
				if(n <= 5){
					System.out.println("給与：" +(3000*n + 100000));
				}else if(n > 5){
					System.out.println("給与：" + (3500*n + 100000));
				}
			}else{
				if(n <= 5){
					System.out.println("給与：" + (3000*n + 110000));
				}else if(n > 5){
					System.out.println("給与：" + (3500*n + 110000));
				}
			}
		}else if(shokukai == 1){
			if(shikaku == 0){
				if(n <= 7){
					System.out.println("給与：" + (4000*n + 150000));
				}else if(n > 7){
					System.out.println("給与：" + (4500*n + 150000));
				}
			}else if(shikaku == 1){
				if(n <= 7){
					System.out.println("給与：" + (4000*n + 160000));
				}else if(n > 7){
					System.out.println("給与：" + (4500*n + 160000));
				}
			}else if(shikaku == 2){
				if(n <= 7){
					System.out.println("給与：" + (4000*n + 170000));
				}else if(n > 7){
					System.out.println("給与：" + (4500*n + 170000));
				}
			}
		}else if(shokukai == 2){
			System.out.println("給与：" + (5000*n + 200000));
		}else if(shokukai == 3){
			System.out.println("給与：" + (6000*n + 250000));
		}


	}

}
