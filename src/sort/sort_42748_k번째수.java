package sort;
import java.util.Arrays;

public class sort_42748_k¹øÂ°¼ö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] solution(int[] array, int[][] commands) {
        int length= commands.length;
        int[] answer = new int[length];
        
        for(int i=0; i< length; i++){
            int start= commands[i][0];
            int end= commands[i][1];
            int k = commands[i][2];
            
            int arr[] = Arrays.copyOfRange(array,start-1,end);
            Arrays.sort(arr);
            answer[i]= arr[k-1];
        }
        return answer;
    }
}
