package bfsdfs;

import java.util.LinkedList;
import java.util.Queue;

public class bfsdfs_1829_카카오프렌즈컬러링북 {
	static boolean vmap[][];
	static int rl[] = {0,0,-1,1};
	static int ud[] = {1,-1,0,0};
	public static int bfs(int x, int y,int[][] map,int m,int n) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] {x,y});
		vmap[x][y]=true;
        int width = 1;
		while(!q.isEmpty()){
			int l[] = q.poll();
			for(int i =0;i<4;i++){
				int r = l[0] + rl[i]; 
				int c = l[1] + ud[i];
				if(r>=0&&c>=0&&r<m&&c<n){
					if(vmap[r][c]==false && map[r][c]==map[x][y]){
						width++;
						vmap[r][c] = true;
						q.offer(new int[] {r,c});
					}
				}
			}
			
		}
		return width;
	}
	public static void main(String[] args) {
		
	}
	public static int[] solution(int m, int n, int[][] picture) {
        vmap = new boolean[m][n];
		
		int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
            	if(vmap[i][j]==false&&picture[i][j]>0){
            		numberOfArea++;
            		int size = bfs(i,j,picture,m,n);
            		if(size>maxSizeOfOneArea){
            			maxSizeOfOneArea=size;
            		}
            	}
            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}
