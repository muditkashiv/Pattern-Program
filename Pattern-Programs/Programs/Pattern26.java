
public class Pattern25 {  
	public static void main(String[] args) {
	int k=1; 
	for(int i=5;i>=1;i--) { 
		for(int j=5;j>=k;j--) { 
			System.out.print(j);
		}k++; 
		System.out.println();
	}
}
} 

OUTPUT: 
54321
5432
543
54
5
