package bruteforce;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] arr = solution(a);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public static int[] solution(int[] answers) {
        int[] arr = new int[3];
        int p = 0;
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        while(p<answers.length){
        	if(arr1[p%5]==answers[p]){
        		arr[0]++;
        	}
        	if(arr2[p%8]==answers[p]){
        		arr[1]++;
        	}
        	if(arr3[p%10]==answers[p]){
        		arr[2]++;
        	}
        	p++;
        }
        int max = 0;
        for(int i=0;i<3;i++){
        	if(max<arr[i]){
        		max = arr[i];
        	}
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(arr[0]==max) list.add(1);
        if(arr[1]==max) list.add(2);
        if(arr[2]==max) list.add(3);
        int[] answer = new int[list.size()];
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
