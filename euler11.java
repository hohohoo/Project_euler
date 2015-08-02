import java.util.Scanner;

public class euler11 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[][] t = new int[20][20];
		int max = 0;
		
		for(int i = 0 ; i < 20 ; i ++){
			for(int j = 0 ; j < 20 ; j ++){
				t[i][j] = sc.nextInt();       // get input
			}
		}
		
		for(int i = 0 ; i < 20 ; i ++){
			for(int j = 0 ; j < 16 ; j ++){
				int tmpmax = 1;
				for(int k = 0 ; k < 4 ; k ++){
					tmpmax *= t[i][j+k];        // calculate horizontal
				}
				if(tmpmax > max)
					max = tmpmax;
			}
		}
		
		for(int i = 0 ; i < 16 ; i ++){
			for(int j = 0 ; j < 20 ; j ++){
				int tmpmax = 1;
				for(int k = 0 ; k < 4 ; k ++){
					tmpmax *= t[i+k][j];        // calculate vertical
				}
				if(tmpmax > max)
					max = tmpmax;
			}
		}

		for(int i = 3 ; i < 20 ; i ++){
			for(int j = 0 ; j < 16 ; j ++){
				int tmpmax = 1;
				for(int l = 0 ; l < 4 ; l ++){
					tmpmax *= t[i-l][j+l];      // calculate diagonal
				}
				
				if(tmpmax > max)
					max = tmpmax;
			}
		}
		
		System.out.println(max);
	}
}
