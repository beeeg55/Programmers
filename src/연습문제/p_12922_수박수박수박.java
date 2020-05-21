package 연습문제;

public class p_12922_수박수박수박 {

	public String solution(int n) {
        String answer = "";
        for(int i=0;i<n/2;i++){
        	answer += "수박";
        }
        if(n%2==1){
        	answer += "수";
        }
        return answer;
    }

}
