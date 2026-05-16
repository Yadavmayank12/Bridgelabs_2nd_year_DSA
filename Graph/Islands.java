public class Islands{
    void dfs2(int i,int j,int grid[][],boolean vis[][]){
        int n=grid.length,m=grid[0].length;
        if(i<0||j<0||i>=n||j>=m||grid[i][j]==0||vis[i][j]) return;
        vis[i][j]=true;
        dfs2(i+1,j,grid,vis);
        dfs2(i-1,j,grid,vis);
        dfs2(i,j+1,grid,vis);
        dfs2(i,j-1,grid,vis);
    }
    int countIslands(int grid[][]){
        int n=grid.length,m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    dfs2(i,j,grid,vis);
                    count++;
                }
            }
        }
        return count;
    }
}