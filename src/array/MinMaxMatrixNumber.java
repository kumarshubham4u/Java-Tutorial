package array;

public class MinMaxMatrixNumber {
	
	
	public static void minimum(int[][] a, int min) {
		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				
				if(a[i][j]<min) {
					
					min=a[i][j];
				}
				
			}
		}
		
		System.out.println("Minimum number in matrix is: "+min);
		
		
	}
	
	
	private static void maximum(int[][] a, int max) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (a[i][j] > max) {

					max = a[i][j];
				}

			}
		}

		System.out.println("Maximum number in matrix is: "+max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int a[][] = { { 9, 4, 6 }, { 3, 9, 18 }, { 5, 10, 15 } };
		int value=a[0][0];

		minimum(a,value);
		maximum(a,value);
		
	

	}



}
