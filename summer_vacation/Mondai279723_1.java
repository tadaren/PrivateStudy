package summer_vacation;

import java.util.Random;
import java.util.Scanner;

public class Mondai279723_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("ブラックジャック開始");

		//コンピュータ側の手を処理する
		int com = 0;
		for(int i = 0; com < 16 && i < 10; i++){
			com += draw();
		}

		//プレイヤー側の手を処理する
		int player = 0;
		player += draw();
		for(int i = 0; i < 10; i++){
			System.out.println("プレイヤの手："+player+" もう一枚引きますか？");
			System.out.print("1:引く 0:降りる ：");
			if(1 == stdIn.nextInt()){
				player += draw();
			}else{
				break;
			}
		}
		System.out.println("プレイヤの手："+player+" コンピュータ"+com);
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

	private static int draw(){
		Random rand = new Random();
		int draw = rand.nextInt(13)+1;
		if(draw >= 10){
			return 10;
		}else{
			return draw;
		}
	}

}
