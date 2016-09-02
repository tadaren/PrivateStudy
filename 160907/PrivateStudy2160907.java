import java.util.Scanner; 
public class PrivateStudy2160907{
	public static void main(String[] args){ 
		Scanner stdIn = new Scanner(System.in);
		System.out.print("名前:"); String name = stdIn.nextLine(); 
		int length = name.length(); 
		System.out.println(name+"さんは"+length+"文字です");
	
	}
}
