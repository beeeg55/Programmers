package 연습문제;

public class p_12921_소수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(10);
	}	
		public static int solution(int n) {

	        int answer = 2;
			if(n<=3) return n-1;
			for(int i=5;i<=n;i+=2){
				boolean b = true;
				if(i%3==0){
					continue;
				}
				for(int j=5;j<=i/5;j+=2){
					if(i%j==0){
						b=false;
						break;
					}
				}
				if(b==false) continue;
				answer++;
			}
	        return answer;
	    }
	

}
