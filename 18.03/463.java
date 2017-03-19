public class Solution {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        int neib = 0;
        
        for (int i = 0; i < grid.length; i++) {
           for (int j = 0; j < grid[0].length; j++) {
               if (grid[i][j]==0) continue;
               
               count++;
               
               int buf = 0;
               //if (i!=0 && grid[i-1][j]==1) buf++;
               if (i!=grid.length-1 && grid[i+1][j]==1) buf++;
               //if (j!=0 && grid[i][j-1]==1) buf++;
               if (j!=grid[0].length-1 && grid[i][j+1]==1) buf++;
               neib+=buf;
               
           }
 
        }
        
        return 4*count - neib*2;
    }
}