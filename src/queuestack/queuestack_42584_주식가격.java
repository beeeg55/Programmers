package queuestack;

public class queuestack_42584_주식가격 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 3};
		int[] ans = solution(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(ans[i]);
		}
		
	}
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length;i++){
        	int t = prices[i];
        	for(int j=i+1;j<prices.length;j++){
        		answer[i]++;
        		if(t>prices[j]){
        			break;
        		}
        	}
        }
        return answer;
    }

}
