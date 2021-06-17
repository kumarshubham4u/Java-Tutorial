package array;

public class CiscoInterviewQuestion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int a[][] = { { 9, 4, 6 }, { 3, 0, 18 }, { 5, 10, 15 } };
		int min=a[0][0];
		int minColumn=0;

		
		for (int i = 0; i < 3; i++) {

			
			for (int j = 0; j < 3; j++) {

				
				if(a[i][j]<min) {
					
					min=a[i][j];
					minColumn=j;
				}
				
			}
		}
		
		int max=a[0][minColumn];
		int k = 0;
		while(k<3)
		{
		if(a[k][minColumn]>max)
		{
		max=a[k][minColumn];
		}
		k++;
		}

		System.out.println("Maximum number in the minimum number column is: "+max);
		

		
	

	}
	
	
		
	
}
