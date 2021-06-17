package array;

public class MultiDimmensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{2,4,6},{3,9,18},{5,10,15}};
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				System.out.print(a[i][j]+"\t");
			}
			
			System.out.println("");
		}

		
	}

}
