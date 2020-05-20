package 연습문제;

import java.util.Stack;

public class p_12906_같은숫자는싫어 {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		
		System.out.println(solution(arr));
	}
	public static int[] solution(int []arr) {
       Stack<Integer> st = new Stack<>();
       st.push(arr[0]);
       for(int i=1;i<arr.length;i++){
    	   if(st.peek()==arr[i]){
    		   continue;
    	   }
    	   st.push(arr[i]);
       }
       int[] answer = new int[st.size()];
       for(int i=st.size()-1;i>=0;i--){
    	   answer[i] = st.pop();
       }
       return answer;
    }
}
