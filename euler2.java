public class euler2 {

	public static void main(String[] args){
		
		int i = 0, j = 1;
		int t=0;
		long sum=0;
		
		for( ; t <= 4000000; t += i+j){
			
			if(t%2==0) sum+= t;
			t = i+j;
			i = j;
			j = t;
		}
		System.out.println(sum);
	}
}
