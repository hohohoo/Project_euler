public class euler10 {
	
	public static void main(String[] args){
		
		int t = 2000000;
		long result = 0;
		for(int i = 3 ; i <= t; i += 2){
			int j=1;
			for( j = 3 ; j*j <= i ; j +=2){
				if(i%j == 0) break;
			}
			
			if(j*j> i&& j>1){   //isPrime
				result += i;
			}
		
		}
		
		System.out.println(result);
	}
}
