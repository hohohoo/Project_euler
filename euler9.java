public class euler9 {
	public static void main(String[] args){
		
		int a=1, b=1, c=1;
		int t = 1000;
		
		boolean flag = false;
		
		for(a = 1 ; a < t/3 ; a ++){
			for(b = a ; b < t/2 ; b ++){
				c = t-a-b;
				if(a*a + b*b == c*c){
					flag = true;
					break;
				}
				
			}
			if(flag) break;
		}
		System.out.println(a*b*c);
	}
}
