package printingAnX;

public class PrintingAnX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assgining the varibles
		
		int k=5; 
 		int numOfColumns=5; 
		
		for(int i=1;i<=5;i++){
	
		
			for(int j=1;j<=numOfColumns;j++){
				//	Logic for printing X
				if(i==j){
					System.out.print("*");
				}
					else if(j==k){
					System.out.print("*");
			}
					else{
					System.out.print("_");	
					}	
			}
				System.out.println();
				k=k-1;
				
			
				if(i<3){
				
					numOfColumns=numOfColumns-1;
					
				}
				else{
					numOfColumns=numOfColumns+1;
				}
			}
		
		
		}
	}


