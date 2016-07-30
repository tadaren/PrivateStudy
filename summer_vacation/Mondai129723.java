package summer_vacation;

public class Mondai129723 {

	public static void main(String[] args) {
		System.out.println("ab + ca = bbc");
		//全パターンをfor文のloopで調べる
		for(int a = 1; a <= 9; a++){
			for(int b = 1; b <= 9; b++){
				for(int c = 1; c <= 9; c++){
					//式を満たしたとき表示する
					if((10*a + b)+(10*c + a) == (100*b + 10*b + c)){
						System.out.println((10*a + b)+ " + " +(10*c + a) + " = " + (100*b + 10*b + c));
					}
				}
			}
		}

	}

}
