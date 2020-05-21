package 연습문제;

import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
        	if(arr[i]%divisor==0){
        		li.add(arr[i]);
        	}
        }
        if(li.size()==0){
        	int[] answer = {-1};
        	return answer;
        }
		int[] answer = new int[li.size()];
		for(int i=0;i<answer.length;i++){
			answer[i]=li.get(i);
		}
		Arrays.sort(answer);
        return answer;
    }
}