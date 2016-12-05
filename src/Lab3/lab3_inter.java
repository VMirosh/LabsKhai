package Lab3;

public class lab3_inter implements var08 {
	public double logika(double d1, double d2, double d3){
		double different;
		
		if (d2 == d3)
		{
			different = 1;
		}
		else 
		{
			if (d1 == d3)
			{
				different = 2;
			}
			else
			{
				different = 3;
			}
		}
		System.out.println("Different number is " + different);
		
		return different; 
	}
	
	
	
		
	public void poka(int N){
			int ost; // для сохранения остатка 
			while(N>0){ 
				ost = N%10; 
					if (ost%2!=0){
						System.out.println("true");
						N/=10;
						continue;
					}
					System.out.println("false");
					 N/=10;
				}
			}
			
	public void massivy(double[] A){
				 int index;
				 
				 if(A.length == 0)
				 {
					System.out.println("Array is empty");
				 }
				 else
				 {
					 index = 0;
					 if(A.length > 2)
					 {
						double min = A[index];
						
						for(int i = 2; i < A.length; i += 2)
						{
							if(min > A[i])
							{
								index = i;
								min = A[i];
							}
						}
					 }
					 
					 System.out.println("Min element is has " + index + " index and equal to " + A[index]);
				}
}}