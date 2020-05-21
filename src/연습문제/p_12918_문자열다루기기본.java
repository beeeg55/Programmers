package 연습문제;

public class p_12918_문자열다루기기본 {
	 public boolean solution(String s) {
	        boolean answer = true;
	        if(s.length()!=4&&s.length()!=6){
	            return false;
	        }
	        for(int i=0;i<s.length();i++){
	        	if(s.charAt(i)>57){
	        		answer = false;
	        		break;
	        	}
	        }
	        return answer;
	    }
}
