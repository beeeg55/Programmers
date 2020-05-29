package 연습문제;

import java.util.HashMap;

public class p_12981_영어끝말잇기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"hello","one","even","never","now","world","draw"};
		int[] answer = solution(2,arr);
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
	public static int[] solution(int n, String[] words) {
		int[] answer = {0,0};
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put(words[0], 1);
		for(int i=1;i<words.length;i++){
			if(words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)){
				answer[0] = (int)(i+1)%n;
				answer[1] = (int) Math.ceil((double)(i+1)/n);
				return answer;
			}
			if(hm.containsKey(words[i])){
				answer[0] = (int)(i+1)%n;
				answer[1] = (int)Math.ceil((double)(i+1)/n);
				return answer;
			}else{
				hm.put(words[i], 1);
			}
		}
        return answer;
    }
}
