package 연습문제;

import java.util.Arrays;

public class p_12913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,5},{5,6,7,8},{4,3,18,1}};
		//int[][] arr= {{0,0,0,1},{0,0,0,1},{4,3,2,1}};
		System.out.println(solution(arr));
	}
	public static int solution(int[][] land) {
		int answer = 0;
		int index = -1;
		for(int i=0;i<land.length;i++){
				int[] arr = land[i];
				Arrays.sort(arr);
				if(index== Arrays.binarySearch(land[i], arr[3])){
					index = Arrays.binarySearch(land[i], arr[2]);
					answer += arr[2];
				}else{
					index = Arrays.binarySearch(land[i], arr[3]);
					answer += arr[3];
				}
		}
        return answer;
    }
}
