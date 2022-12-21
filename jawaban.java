Output 2

public class PyramidPatternStarProgram 
{
	public static void PyramidPattern(int n)
	{
		for (int i=0; i<n; i++)
		{
			for (int j=n-1; j>1; j--)
			{
				System.out.print(" ");
			}
			
			for (int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String args [])
	{
		int n = 5;
		PyramidPattern(n);
	}

}

Hasil
*
**
***
****
*****


Output 2

public class DeretAngka {    
	    public static void main(String[] args) {
	        int a,b;
	        for (a = 1; a <=6; a++) {
	           //outer loop
	            System.out.println();
	            //Memberi garis baru atau enter
	  
	            for (b = 1; b < a; b++) {
	                //inner loop
	                System.out.print(b + " ");
	                //menampilkan bintang pada output  
	            }
	        }
	    }  
	} 

Hasil
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 


	
	

