package ��������;

public class p_12903_������ڰ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("abcde"));
		System.out.println(solution("abcd"));
		System.out.println(solution("abcdef"));
	}
	public static String solution(String s) {
        String answer = "";
        if(s.length()%2==0){
        	answer = s.substring(s.length()/2-1, s.length()/2+1);
        }else{
        	answer = s.substring(s.length()/2,s.length()/2+1);
        }
        return answer;
    }
}
