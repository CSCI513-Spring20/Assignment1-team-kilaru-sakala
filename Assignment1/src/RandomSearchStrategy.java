import java.util.HashSet;

public class RandomSearchStrategy implements SearchStrategy {
    int cellsearch = 0;
    
    String carrStart;
    String carrEnd;
    String subStart;
    String subEnd;
    HashSet<String> found;

    public void searchship(int[][] grid) {
        found = new HashSet<String>();
        System.out.println("Strategy: Random Search");

        while (found.size() < 8) {
            int row = (int) (Math.random() * grid.length);
            int col = (int) (Math.random() * grid[0].length);
            if (grid[row][col] != 0) {
                found.add(row + " " + col);
                if (grid[row][col] == 1) carrStart = "("+row+","+col+")";
                else if (grid[row][col] == 2) carrEnd = "("+row+","+col+")";
                else if (grid[row][col] == 3) subStart = "("+row+","+col+")";
                else if (grid[row][col] == 4) subEnd = "("+row+","+col+")";
            }
            cellsearch++;
        }


        System.out.println("Number of cells searched: " + cellsearch);
        System.out.println("Carrier found: "+carrStart+" to "+carrEnd);
        System.out.println("Submarine found: "+subStart+" to "+subEnd);
    }
}
