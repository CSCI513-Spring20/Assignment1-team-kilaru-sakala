import java.util.HashSet;

public class StrategicSearch implements SearchStrategy {
	    String carrStart;
	    String carrEnd;
	    String subStart;
	    String subEnd;
	    HashSet<String> search, found;

	    public void searchship(int[][] grid) {
	        System.out.println("Strategy: Strategic Search");

	        search = new HashSet<String>();
	        found = new HashSet<String>();

	        while (found.size() < 8) {
	            int row = (int) (Math.random() * grid.length);
	            int col = (int) (Math.random() * grid[0].length);
	            if (!search.contains(row+" "+col)) {
	                if (!found.contains(row+" "+col) && grid[row][col] != 0) {
	                    if (grid[row][col] == 1) carrStart = "("+row+","+col+")";
	                    else if (grid[row][col] == 2) carrEnd = "("+row+","+col+")";
	                    else if (grid[row][col] == 3) subStart = "("+row+","+col+")";
	                    else if (grid[row][col] == 4) subEnd = "("+row+","+col+")";
	                    found.add(row+" "+col);

	                }
	                search.add(row+" "+col);
	            }
	        }
	        System.out.println("Number of cells search: " + search.size());
	        System.out.println("Carrier found: "+carrStart+" to "+carrEnd);
	        System.out.println("Submarine found: "+subStart+" to "+subEnd);
	    }
}	    
