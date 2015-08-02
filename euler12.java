public class euler12 {
	
	public static void main(String[] args){
		
		int t = 0;
		int cnt=0;
		
		for(int i = 1 ; ; i ++){
			t += i;
			cnt = 0;
			for(int j = 1 ; j < Math.sqrt(t) ; j ++){
				if(t%j == 0) cnt+=2;
			}
			if(cnt >= 500) break;

		}
		System.out.println(t+ " " + cnt);
	}
}
