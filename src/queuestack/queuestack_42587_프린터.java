package queuestack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class queuestack_42587_«¡∏∞≈Õ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {2,1,3,2};
		int[] arr = {1,1,9,1,1,1};
		System.out.println(solution(arr,0));
	}
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        int[] rank = Arrays.copyOf(priorities, priorities.length); 
        Arrays.sort(rank);
        for(int i=0;i<priorities.length;i++){
        	q.add(priorities[i]);
        }
        int count = 0;
        int index = 1;
        while(!q.isEmpty()){
        	while(q.peek()<rank[rank.length-index]){
            	if(location==0){
            		location = q.size()-1;
            	}else{
            		location--;
            	}
            	q.add(q.poll());
            }
            q.poll();
            location--;
            index++;
            count++;
            if(location==-1){
            	answer = count;
            	break;
            }
        }
        
        return answer;
    }
}
