import java.util.Scanner;

public class euler13 {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		long t = 0;
		String a;
		for(int i = 0 ; i < 100 ; i ++){
			
			a = sc.next();
			a = a.substring(0,13);

			t+= Long.parseLong(a);
			
		}
		
		a = String.valueOf(t).substring(0, 10);
		System.out.println(Long.parseLong(a));


	}


}
