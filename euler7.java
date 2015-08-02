public class euler7 {
	public static void main(String[] args){
		
		
		int j; 
		int count = 1;
		
		for(int i = 3 ; ; i += 2){
			for( j = 3 ; j*j <= i ; j +=2){
				if(i%j == 0) break;
			}
			
			if(j*j> i&& j>1){   //isPrime?
				count++;
			}
			
			if(count == 10001){ 
				
				System.out.println(i);
				break;
			}
		}
		
	}
}
