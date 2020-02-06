import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringTokenizer;

public class Battleship{
    int count;
    List<String> input;
    StringTokenizer tokenizer;

    public Battleship() {
        count = 0;
        try {
            input = Files.readAllLines(Paths.get("src//input.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int[][] read() {
        int[][] grid = new int[25][25];
        tokenizer = new StringTokenizer(input.get(count), "(");
        int tokenCount = 0;
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int commaIndex = token.indexOf(",");
            int row = Integer.parseInt(token.substring(0, commaIndex));
            int col = Integer.parseInt(token.substring(commaIndex+1, token.length()-1));
            
            if (tokenCount == 0) grid[row][col] = 1;
            else if (tokenCount == 4) grid[row][col] = 2;
            else if (tokenCount == 5) grid[row][col] = 3;
            else if (tokenCount == 7) grid[row][col] = 4;
            else grid[row][col] = 5;
            tokenCount++;
        }
        count++;
        return grid;
    }

}
