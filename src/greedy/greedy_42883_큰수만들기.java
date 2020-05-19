package greedy;

import java.util.Arrays;

public class greedy_42883_큰수만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("1924",2));
		System.out.println(solution("1231234",3));
		System.out.println(solution("4177252841",4));
	}
	public static String solution(String number, int k) {
		String answer = "";
		k = number.length()-k;
		int mi = 0;
		for(int i=0;i<k;i++){
			int submi = 0;
			char m = '0';
			String sub;
			sub = number.substring(mi, number.length()-k+i+1);
			for(int j=0;j<sub.length();j++){
				if(sub.charAt(j)=='9'){
					m = sub.charAt(j);
					submi = j;
					break;
				}
				if(m<sub.charAt(j)){
					m = sub.charAt(j);
					submi = j;
				}
			}
			answer += m;
			mi += submi+1;
			
		}
        return answer;
    }
}
