// Time - O( M*N)
// Space - O( M*N)

class floodFill {
    int color;
    int m;
    int n;
    int [][] dirs;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if(image == null || image.length == 0 || image[sr][sc] == newColor) return image;
        color = image[sr][sc];
        m = image.length;
        n = image[0].length;
        dirs = new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        dfs(image,sr,sc,newColor);
        return image;


    }


    private void dfs(int[][] image, int r, int c,int newColor) {

        // base

        if( r < 0 || c < 0 || r == m || c == n || image[r][c] != color) return;

        //logic

        // set the current element value in mat to new color and iterate 4 directions to change new Color in 4 directions
        image[r][c] = newColor;

        for(int [] dir: dirs) {

            int nr =  r + dir[0];
            int nc =  c + dir[1];
            dfs(image,nr,nc,newColor);

        }


    }
}