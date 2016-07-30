package summer_vacation;

import java.util.Random;
import java.util.Scanner;

public class Mondai279723 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("ブラックジャック開始");

		//コンピュータ側の手を処理する
		int com = 0;
		for(int i = 0; com < 16 && i < 10; i++){
			int draw = rand.nextInt(13)+1;
			if(draw >= 10){
				com += 10;
			}else{
				com += draw;
			}
		}

		//プレイヤー側の手を処理する
		int player = 0;
		int onedraw = rand.nextInt(13)+1;
		if(onedraw >= 10){
			player += 10;
		}else{
			player += onedraw;
		}
		for(int i = 0; i < 10; i++){
			int draw = rand.nextInt(13) + 1;
			System.out.println("プレイヤの手："+player+" もう一枚引きますか？");
			System.out.print("1:引く　0:降りる　：");
			if(1 == stdIn.nextInt()){
				if(draw >= 10){
					player += 10;
				}else{
					player += draw;
				}
			}else{
				break;
			}
		}
		System.out.println("プレイヤの手："+player+"　コンピュータ"+com);
		if(player == com || (player > 21 && com > 21)){
			System.out.println("引き分け");
		}else if(player > 21){
			System.out.println("プレイヤの負け");
		}else if(com > 21){
			System.out.println("プレイヤの勝ち");
		}else if(player > com){
			System.out.println("プレイヤの勝ち");
		}else if(player < com){
			System.out.println("プレイヤの負け");
		}


	}

}
