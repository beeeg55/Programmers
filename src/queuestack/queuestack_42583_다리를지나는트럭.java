package queuestack;

import java.util.LinkedList;
import java.util.Queue;

public class queuestack_42583_다리를지나는트럭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {7,4,5,6};
		//System.out.println(solution(2,10,arr));
		int[] arr = {10,10,10,10,10,10,10,10,10,10};
		System.out.println(solution(100,100,arr));
	}
	 public static int solution(int bridge_length, int weight, int[] truck_weights) {
		 	Queue<Integer> qu = new LinkedList<Integer>();
		 	int answer = 0;
		 	int i = 0;
		 	int w = 0;
		 	
		 	while(true){
		 		if(qu.size()==bridge_length){
		 			w -= qu.poll();
		 		}
		 		if(w+truck_weights[i]<=weight){
		 			w += truck_weights[i];
		 			qu.add(truck_weights[i]);
			 		i++;
		 		}else{
		 			qu.add(0);
		 		}
		 		answer++;
		 		if(i==truck_weights.length){
		 			break;
		 		}
		 	}
		 	answer += bridge_length;
	        return answer;
	    }

}
