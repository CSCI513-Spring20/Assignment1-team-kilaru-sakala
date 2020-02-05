public class HorizantalSweepStrategy implements SearchStrategy{
	
	/*
	 function name: findships
	 arguments: game[][]
	 purpose: It is a functions which overrides the function of the Interface search ships.
	 */
	public void searchship(int grid[][]) {
		int counter =0; // total number of cells searched
		int count = 0;
		String carr=""; // concatinating the carrier strings.
		String sub = ""; // concatinating the submarines strings.
		//System.out.println("Horizontal is implemented"+ game);
		for(int i=0 ; i<25; i++) {
			for(int j =0; j<25;j++) {
				if(grid[i][j]==1) {
					//System.out.print(" Found Carrier at ("+i+","+j+") ");
					String a = "("+i+","+j+")";
					carr = carr.concat(a);
				}
				
				else if(grid[i][j]==2) {
					//System.out.print(" Found submarine at ("+i+","+j+") ");
					String b = "("+i+","+j+")";
					sub = sub.concat(b);
					count++;
				}
				if(count==7) {
					break;
				}
				else {
				counter++;
				}
			}
			
		}
		System.out.println("Strategy: Horizontal Sweep");
		System.out.println("Number of cells searched: "+counter);
		System.out.print("Found Carrier at "+carr+";");
		System.out.println(" Found Sub at "+sub);
		
	}

	
	
}
/*public class HorizantalSweepStrategy implements SearchStrategy{
	
	int searchCount = -1;
    int foundCount = 0;
    String carrierHead;
    String carrierTail;
    String submarineHead;
    String submarineTail;
    
    
	public void searchship(int[][] grid) {
		
		
		while(grid.size()<8) {
	        for (int row = 0; row < 25; row++) {
	            for (int col = 0; col < 25; col++) {
	                if (grid[row][col] != 0) {
	                    //foundCount++;//
	                    if (grid[row][col] == 1)  
	                    	carrierHead = "("+row+","+col+")";
	                    else if(grid[row][col] == 2)
	                    	 carrierTail = "("+row+","+col+")";
	                    else if (grid[row][col] == 3) 
	                    	submarineHead = "("+row+","+col+")";
	                    else if (grid[row][col]== 4)
	                    	submarineTail = "("+row+","+col+")";
	                 	            
	                    foundCount++;
	                   if(foundCount==3) {
	                  break;
	                   }         
	                searchCount++;
	                if (foundCount > 7) break;
	            }
               
	            if (foundCount >7) break;
	        }
	        }
	        }
	        System.out.println("Strategy: Horizontal Sweep");
	        System.out.println("Number of cells searched: " + searchCount);
	        System.out.println("Carrier found: "+carrierHead+" to "+carrierTail+" Submarine found: "+submarineHead+" to "+submarineTail);
		
		
		
	}

}*/


