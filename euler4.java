
public class euler4 {
	public static void main(String[] args){

		int a,b;
		int max = 0;

		int t = 999;
		for(a = t ;a > 0;a--){
			for(b = t ;b > 0;b--){
				if(max>a*b) continue;

				int k = a*b;
				int n=0,ten = 1;
				
				/** isPalindrom? **/
				while(k>0){
					k/=10;
					ten*=10;
				}
				ten/=10;
				int nten = 1;
				k = a*b;
				while(k>0){
					n += (k/ten)*nten;
					k%=ten;
					nten *= 10;
					ten /= 10;
				}
				if(n == a*b)	max = a*b;    
			}
		}
		System.out.println(max);
	}
}
