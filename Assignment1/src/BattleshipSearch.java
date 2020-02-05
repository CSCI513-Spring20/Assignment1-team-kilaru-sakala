public class BattleshipSearch {
    int[][] grid;
    Battleship reader;
    SearchStrategy[] strategies = {new HorizantalSweepStrategy(), new RandomSearchStrategy(), new StrategicSearch()};

    public BattleshipSearch() {
        reader = new Battleship();
    }

    public void SearchStrategy() {
        for (int i = 0; i < strategies.length; i++) {    	
        int[][] grid = reader.read();
        System.out.println("Game "+(i+1));
        for (int j = 0; j < strategies.length; j++) {
            //int[][] grid = reader.read();
            strategies[j].searchship(grid);
        }
        }
    }

    public static void main(String[] args) {
        BattleshipSearch search = new BattleshipSearch();
        search.SearchStrategy();
    }
}
