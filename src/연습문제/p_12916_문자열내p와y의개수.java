package 연습문제;

public class p_12916_문자열내p와y의개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 boolean solution(String s) {
	        boolean answer = false;
	        int p =0;
	        int y = 0;
	        for(int i=0;i<s.length();i++){
	        	if(s.charAt(i)=='p'||s.charAt(i)=='P'){
	        		p++;
	        	}
	        	if(s.charAt(i)=='y'||s.charAt(i)=='Y'){
	        		y++;
	        	}
	        }
	        if(p==y){
	        	answer = true;
	        }
	        return answer;
	    }
}
