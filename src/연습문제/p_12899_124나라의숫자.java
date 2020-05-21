package 연습문제;

import java.util.LinkedList;
import java.util.Queue;

public class p_12899_124나라의숫자 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(6));
	}
	public static String solution(int n) {
		Queue<Integer> qu = new LinkedList<>();
		if(n<=3){
			if(n==1) return "1";
			if(n==2) return "2";
			if(n==3) return "4";
		}else{
			qu.add(1);
			qu.add(2);
			qu.add(4);

			for(int count=3;count<n;){
				count++;
				if(count==n) return Integer.toString(qu.peek()*10+1);
				qu.add(qu.peek()*10+1);
				
				count++;
				if(count==n) return Integer.toString(qu.peek()*10+2);
				qu.add(qu.peek()*10+2);
				
				count++;
				if(count==n) return Integer.toString(qu.peek()*10+4);
				qu.add(qu.poll()*10+4);
			}
		}
		return Integer.toString(qu.peek());
    }
}
