package 연습문제;
//해보는중
import java.util.LinkedList;
import java.util.Queue;

public class p_12899_124나라의숫자 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(4));
		System.out.println(solution(5));
		System.out.println(solution(6));
		System.out.println(solution(7));
		System.out.println(solution(8));
		System.out.println(solution(9));
		System.out.println(solution(10));
	}
	public static String solution(int n) {
		Queue<Long> qu = new LinkedList<>();
		int[] arr = {1,2,4};
		int i = 0;
		if(n<=3){
			if(n==1) return "1";
			if(n==2) return "2";
			if(n==3) return "4";
		}else{
			qu.add((long) 1);
			qu.add((long) 2);
			qu.add((long) 4);
			
			for(int count=0;count<(n-4)/3;count++){
				qu.add(qu.peek()*10+arr[0]);
				qu.add(qu.peek()*10+arr[1]);
				qu.add(qu.poll()*10+arr[2]);
			}
			//System.out.println(qu.peek());
			for(i=0;i<(n-1)%3;i++){
				qu.add(qu.peek()*10+arr[i]);
			}
		}
		return Long.toString(qu.peek()*10+arr[i]);
    }
}
/*
Queue<Long> qu = new LinkedList<>();
if(n<=3){
	if(n==1) return "1";
	if(n==2) return "2";
	if(n==3) return "4";
}else{
	qu.add((long) 1);
	qu.add((long) 2);
	qu.add((long) 4);

	for(int count=3;count<n;){
		count++;
		if(count==n) return Long.toString(qu.peek()*10+1);
		qu.add(qu.peek()*10+1);
		
		count++;
		if(count==n) return Long.toString(qu.peek()*10+2);
		qu.add(qu.peek()*10+2);
		
		count++;
		if(count==n) return Long.toString(qu.peek()*10+4);
		qu.add(qu.poll()*10+4);
	}
}
return Long.toString(qu.peek());
*/