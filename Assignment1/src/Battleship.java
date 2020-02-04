import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Battleship {
	
	static SearchStrategy searchStrategy;	
	int carrier = 1;
	int submarine = 2;
	int count;
	int x,y;
	String line;
	List<int[][]> mylist = new ArrayList<int[][]>(); 
	int[][] game = new int[25][25];
	
	public void readInputFile(){
		mylist = placingcoordinateFile("src//input.txt");
	}

	public void setStrategy(SearchStrategy strategy){
		searchStrategy = strategy;
	}	
	
	public List<int[][]> placingcoordinateFile(String fileName){
		  try {
			  FileReader inputFile = new FileReader(fileName);
			  BufferedReader reader = new BufferedReader(inputFile);
			  for(int i=0;i<=2;i++) {
					String line = reader.readLine();
					StringTokenizer tokenizer = new StringTokenizer(line,"()");
					count=1;
					for(int j=0;j<8;j++) {
						
						String element = tokenizer.nextToken();
						StringTokenizer tokenizer1 = new StringTokenizer(element,",");
						x = Integer.parseInt(tokenizer1.nextToken());
						y = Integer.parseInt(tokenizer1.nextToken());
						if(i<5) {
							game[x][y] = carrier;
						}
						else {
							game[x][y] = submarine;
						}
			  }
					mylist.add(game);
					/*int[][] searchGrid = mylist.get(count);
					count++;
					for (int p = 0; p < searchGrid.length; p++)
					{
						for (int q = 0; q < searchGrid.length; q++)
						{
							if (searchGrid[p][q] == 1)
							{
								System.out.println("carrier"+p+","+q);
							}
						}
					}*/
					/*for( int j = 0; j < grid.length; j++ )
						   Arrays.fill( grid[j], 0);*/
					for (int row = 0; row < game.length; row++) {
						   for (int column = 0; column < game.length; column++) {
						      game[row][column] = 0;
						   }
						}
			  }
			  reader.close();
			  }
		  catch(Exception e) {
		  System.out.println("Exception occured "+e);
		  }
			return mylist;
		}
	
	
	public static void main(String[] args) {
		Battleship battleship = new Battleship();
		
	battleship.readInputFile();
		//	battleship.setStrategy(new HorizontalSweepStrategy());
			//battleship.performSearch();
			//battleship.setStrategy(new RandomSearchStrategy());
			//battleship.performSearch();
			//battleship.setStrategy(new StrategicSearchStrategy());
			//battleship.performSearch();
	}
}



