package ��������;

import java.util.Stack;

public class p_12973_¦���������ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("baabaa"));
		System.out.println(solution("baaba"));
	}
	 public static int solution(String s){
		Stack<Character> st = new Stack<>();
		st.push(s.charAt(0));
		for(int i=1;i<s.length();i++){
			if(st.empty()){
				st.push(s.charAt(i));
			}else{
				if(st.peek()==s.charAt(i)){
					st.pop();
				}else{
					st.push(s.charAt(i));
				}
			}
		}
		if(st.empty()){
			return 1;
		}else{
			return 0;
		}
	}
}
