package easy;

public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int island=0, neighbor=0;
        
        for(int i=0;i<grid.length;i++){
        	for(int j=0;j<grid[0].length;j++){
        		if(grid[i][j]==1){
        			island++;
        			if(i<grid.length-1 && grid[i+1][j]==1)
        				neighbor++;
        			if(j<grid[0].length-1 && grid[i][j+1]==1)
        				neighbor++;
        		}
        	}
        }
        perimeter = island*4-neighbor*2;
        return perimeter;       
    }
	
	public static void main(String[] args){
		int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		IslandPerimeter ip = new IslandPerimeter();
		System.out.println(ip.islandPerimeter(grid));
	}
}
