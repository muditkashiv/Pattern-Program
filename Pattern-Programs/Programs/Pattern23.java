
public class Pattern22 {  
	public static void main(String[] args) { 
		int n=5; 
		for(int i=n;i>=1;i--){  
			for(int s=1;s<=i-1;s++){   
				System.out.print(" "); 	 
			}   
			for(int j=n;j>=i;j--) { 
				System.out.print(j);
			
		} 
			System.out.println(); 
	}   		 
}
}  

OUTPUT: 
    5
   54
  543
 5432
54321


