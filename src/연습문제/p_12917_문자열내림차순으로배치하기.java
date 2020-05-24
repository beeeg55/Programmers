package 연습문제;

import java.util.Arrays;

public class p_12917_문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String solution(String s) {
        String answer = "";
        String[] arr = new String[s.length()];
        for(int i=0;i<s.length();i++){
        	arr[i]=Character.toString(s.charAt(i));
        }
        Arrays.sort(arr);
        for(int i=0;i<s.length();i++){
        	answer += arr[s.length()-1-i];
        }
        return answer;
    }
}
