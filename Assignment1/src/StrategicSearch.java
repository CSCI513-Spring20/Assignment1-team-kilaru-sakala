import java.util.HashSet;

public class StrategicSearch implements SearchStrategy {
	    String carrierHead;
	    String carrierTail;
	    String submarineHead;
	    String submarineTail;
	    HashSet<String> searched, found;

	    public void searchship(int[][] grid) {
	        System.out.println("Strategy: Strategic Search");

	        searched = new HashSet<String>();
	        found = new HashSet<String>();

	        while (found.size() < 8) {
	            int row = (int) (Math.random() * grid.length);
	            int col = (int) (Math.random() * grid[0].length);
	            if (!searched.contains(row+" "+col)) {
	                if (!found.contains(row+" "+col) && grid[row][col] != 0) {
	                    if (grid[row][col] == 1) carrierHead = "("+row+","+col+")";
	                    else if (grid[row][col] == 2) carrierTail = "("+row+","+col+")";
	                    else if (grid[row][col] == 3) submarineHead = "("+row+","+col+")";
	                    else if (grid[row][col] == 4) submarineTail = "("+row+","+col+")";
	                    found.add(row+" "+col);

	                }
	                searched.add(row+" "+col);
	            }
	        }
	        System.out.println("Number of cells searched: " + searched.size());
	        System.out.println("Carrier found: "+carrierHead+" to "+carrierTail+" Submarine found: "+submarineHead+" to "+submarineTail);
	    }

		
			

	}
