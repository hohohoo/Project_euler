public class euler3 {

	public static void main(String[] args){
		
		long i;
		long j;
		long t = 600851475143L;
		long result = 0;

		for( i = 3 ; i <= Math.sqrt(t) ; i += 2){
			for(j = 3 ; j*j <= i ; j +=2){
				if(i%j == 0) break;
			}
			
			if(j*j> i&& j>1){
				if(t%i == 0 ){
					result = i;
				}
			}
		}
		
		System.out.println(result);
		
	}
}
