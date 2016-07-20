package kadai160713;

import java.util.Scanner;

public class PrivateStudy4160713 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int sum = 0;
		double ave = 0;
		for(;;){
			System.out.print("��������́F");
			int n = stdIn.nextInt();
			if(n >= 0){
				a++;
				sum += n;
			}else{
				b++;
			}
			if(sum>=100)
				break;
		}
		ave = sum/a;
		System.out.println("�f�[�^��="+a);
		System.out.println("�����f�[�^��="+b);
		System.out.println("���v="+sum);
		System.out.printf("����=%.1f",ave);

	}

}
