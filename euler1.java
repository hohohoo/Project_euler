public class euler1 {

	public static void main(String[] args){
		
		int t = 3;
		int sum=0;
		
		while(t < 1000){
			
			if( t%3==0 || t%5==0 ){
				sum+=t;
			}
			t++;
		}
		System.out.println(sum);
	}
}
