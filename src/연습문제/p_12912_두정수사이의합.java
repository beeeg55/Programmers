package 연습문제;

public class p_12912_두정수사이의합 {

	public long solution(int a, int b) {
        long answer = 0;
       if(a>b){
       	int temp = b;
       	b=a;
       	a=temp;
       }
       for(int i=a;i<=b;i++){
       	answer += i;
       }
       return answer;
   }

}
