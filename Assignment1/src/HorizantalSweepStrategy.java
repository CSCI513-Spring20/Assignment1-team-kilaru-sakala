public class HorizantalSweepStrategy implements SearchStrategy{
	
	int cellsearch;
	int counter;
    String carrStart;
    String carrEnd;
    String subStart;
    String subEnd;
    
    
	public void searchship(int[][] grid) {
		 counter = 0;
		 cellsearch =0;
		
	        for (int row = 0; row < 25; row++) {
	            for (int col = 0; col < 25; col++) {
	               
	                    if (grid[row][col] == 1)  {
	                    	carrStart = "("+row+","+col+")";
	                    	//counter++;
	                        }
	                    else if(grid[row][col] == 2) {
	                    	 carrEnd = "("+row+","+col+")";
	                    	counter++;
	                    	}
	                    else if (grid[row][col] == 3) { 
	                    	subStart = "("+row+","+col+")";
	                    	//counter++
	                   }
	                    else if (grid[row][col]== 4) {
	                    	subEnd = "("+row+","+col+")";
	                    	counter++;
	                    	//System.out.println(counter)
	                    	}
	                if (counter == 2) 
	                	break;
	                cellsearch++;
	            }
               
	            if (counter == 2) break;
	        }	        
	        System.out.println("Strategy: Horizontal Sweep");
	        System.out.println("Number of cells searched: " + cellsearch);
	        System.out.println("Carrier found: "+carrStart+" to "+carrEnd);
	        System.out.println("Submarine found: "+subStart+" to "+subEnd);
	         
		
		
	}

}
