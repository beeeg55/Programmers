package queuestack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class functionDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {93,30,55};
		int[] arr2 = {1,30,5};
		
		int arr[] = solution(arr1,arr2);
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0;i<progresses.length;i++){
            q.add(progresses[i]);
        }
        int i = 0;
    	int arrindex = 0;
    	int day = 0;
        while(!q.isEmpty()){
        	int num = q.peek();
        	num = num + day*speeds[i];
        	int count = 0;
        	while(num<100){
            	num += speeds[i];
            	//System.out.println(num+" "+day);
            	day++;
        	}
        	System.out.println(day+"------------");
        	q.poll();
        	i++;
        	count++;
        	while(!q.isEmpty()){
        		if(q.peek()+speeds[i]*day>=100){
            		q.poll();
            		count++;
            		i++;
        		}else{
        			break;
        		}
        	}
        	answer[arrindex] = count;
        	arrindex++;
        }
        answer =Arrays.copyOfRange(answer, 0, arrindex);
        return answer;
    }
}
