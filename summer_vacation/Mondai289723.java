package summer_vacation;

import java.util.Random;
import java.util.Scanner;

public class Mondai289723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);//インスタンスの生成
		Random rand = new Random();

		//初期処理
		int stone = rand.nextInt(56)+4;//最初の石の数を決める
		System.out.println("ゲーム開始");
		System.out.println("残りの石の数：" + stone);

		//メイン処理
		for(;;){
			//プレイヤ側の処理
			int player;
			for(;;){ //正しい入力されるまで
				System.out.print("プレイヤ：1から3までの数字を入力：");
				player = stdIn.nextInt();
				if(player < 1 || 3 < player){
					System.out.println("正しく入力してください");
				}else{
					break;
				}
			}
			stone -= player;

			//勝敗判定
			System.out.println("残りの石の数：" + stone);
			if(stone == 1){
				System.out.println("プレイヤの勝ち！");
			}else if(stone <= 0){
				System.out.println("コンピュータの勝ち！");
				break;
			}

			//コンピュータ側の処理
			int com = rand.nextInt(3) + 1;
			stone -= com;
			System.out.println("コンピュータ：コンピュータが取った石の数：" + com);

			//勝敗判定
			System.out.println("残りの石の数：" + stone);
			if(stone == 1){
				System.out.println("コンピュータの勝ち！");
			}else if(stone <= 0){
				System.out.println("プレイヤの勝ち！");
				break;
			}


		}

	}

}
