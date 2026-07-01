class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();

        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(res[i],-1);
        }
        Queue<int[]> q= new LinkedList<>();
        // 1 take q and push initial 1 values
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid.get(i).get(j) == 1){
                    res[i][j]=0;
                    q.add(new int[]{i,j});
                }
            }
        }
        // 2) apply bfs and clalulate mahatan diatnace and update in res
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int row = temp[0];
            int col = temp[1];
            // update res value only if the value is less than current value
            // top
            if(row>0 && res[row-1][col] == -1){
                res[row-1][col] = res[row][col]+1;
                q.add(new int[]{row-1,col});
            }
            // left
            if(col>0 && res[row][col-1]==-1){
                res[row][col-1] = res[row][col]+1;
                q.add(new int[]{row,col-1});
            }
            // right
            if(col<n-1 && res[row][col+1]==-1){
                res[row][col+1] = res[row][col]+1;
                q.add(new int[]{row,col+1});
            }
            //bottom
            if(row<n-1 && res[row+1][col] == -1){
                res[row+1][col] = res[row][col]+1;
                q.add(new int[]{row+1,col});
            }
        }
        // 3) start from 0,0 take max heap and everytime insert minimum distance to pq , when i reach n-1,n-1 return value;
        // logic = max heap and insert min dist
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)->b[2]-a[2]
        );
        boolean[][] visited = new boolean[n][n];
        pq.add(new int[]{0,0,res[0][0]});
        while(!pq.isEmpty()){
            int[] temp = pq.poll();
            int row = temp[0];
            int col = temp[1];
            int dist = temp[2];

            if(visited[row][col])continue;
            visited[row][col]=true;

            // base case
            if(row==n-1 && col==n-1)return dist;

            // top
            if(row>0 && !visited[row-1][col]){
                pq.add(new int[]{row-1,col,Math.min(dist ,res[row-1][col])});
            }
            //left
            if(col>0 && !visited[row][col-1]){
                pq.add(new int[]{row,col-1,Math.min(dist ,res[row][col-1])});
            }
            // bottom
            if(row<n-1 && !visited[row+1][col]){
                pq.add(new int[]{row+1,col,Math.min(dist ,res[row+1][col])});
            }
            // right
            if(col<n-1 && !visited[row][col+1]){
                pq.add(new int[]{row,col+1,Math.min(dist ,res[row][col+1])});
            }
        }
        return 0;
    }
   
}