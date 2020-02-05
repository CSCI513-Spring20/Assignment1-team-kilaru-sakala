import java.util.HashSet;

public class RandomSearchStrategy implements SearchStrategy {
    int searchCount = 0;
    int foundCount = 0;
    String carrierHead;
    String carrierTail;
    String submarineHead;
    String submarineTail;
    HashSet<String> found;

    public void searchship(int[][] grid) {
        found = new HashSet<String>();
        System.out.println("Strategy: Random Search");

        while (found.size() < 8) {
            int row = (int) (Math.random() * grid.length);
            int col = (int) (Math.random() * grid[0].length);
            if (grid[row][col] != 0) {
                found.add(row + " " + col);
                if (grid[row][col] == 1) carrierHead = "("+row+","+col+")";
                else if (grid[row][col] == 2) carrierTail = "("+row+","+col+")";
                else if (grid[row][col] == 3) submarineHead = "("+row+","+col+")";
                else if (grid[row][col] == 4) submarineTail = "("+row+","+col+")";
            }
            searchCount++;
        }


        System.out.println("Number of cells searched: " + searchCount);
        System.out.println("Carrier found: "+carrierHead+" to "+carrierTail+" Submarine found: "+submarineHead+" to "+submarineTail);
    }
}
