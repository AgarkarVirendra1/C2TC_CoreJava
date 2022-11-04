package Array;

public class Jagged {

	public static void main(String[] args) 
	{
//		Int arr1[][]=new Int [2][3];//heap
//	
//      arr1[0]=new int[3];
//      arr1[1]=new int[3];
	
//      arr1[0][0]=5;

	
	int arr1[][]= {{2,3,4},{5,6,7}};  //stack
	
	for (int i=0;i<2;i++)
	{
		for (int j=0;j<3;j++)
		{
          System.out.print(arr1[i][j]+" ");		
        }
        System.out.println();
	}
	

}
}
