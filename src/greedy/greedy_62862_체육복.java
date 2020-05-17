package greedy;

import java.util.Arrays;

public class greedy_62862_Ã¼À°º¹ {
	public static void main(String[] args) {
		int[] lost = {3,5,8};
		int[] res = {1};
		
		System.out.println(solution(8,lost,res));
	}
	public static int solution(int n, int[] lost, int[] reserve) {
		int[] arr = new int[n+1];
        Arrays.fill(arr, 1);
        for(int i=0;i<reserve.length;i++){
        	arr[reserve[i]]=2;
        }
        for(int i=0;i<lost.length;i++){
        	arr[lost[i]]--;
        }
        
        for(int i=1;i<arr.length;i++){
        	if(arr[i]==0){
        		if(1<i&&arr[i-1]==2){
        			arr[i-1]--;
        			arr[i]++;
        		}else if(i<n&&arr[i+1]==2){
        			arr[i+1]--;
        			arr[i]++;
        		}
        	}
        }
        int answer=0;
        for(int i=1;i<arr.length;i++){
        	if(arr[i]>0){
        		answer++;
        	}
        }
        return answer;
    }
}
