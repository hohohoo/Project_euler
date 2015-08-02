public class euler5 {
	public static void main(String[] args){
		
		int mul = 1;
		int t = 20;
		for(int i = t ; i > 0 ; i --){
			if(mul%i == 0) continue;
			else{
				int tmp = GCD(mul,i);
				mul = mul*i/tmp;
			}
		}
		System.out.println(mul);
	}
	
	static int GCD(int u, int v)	// greatest common divisor algorithm
	{
	    int tmp;
	 
	    while(v > 0)
	    {
	        tmp = u%v;
	        u = v;
	        v = tmp;
	    }
	    return u;
	}
}
