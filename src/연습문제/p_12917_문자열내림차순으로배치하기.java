package ��������;

import java.util.Arrays;

public class p_12917_���ڿ������������ι�ġ�ϱ� {

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
