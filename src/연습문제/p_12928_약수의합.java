package ��������;

public class p_12928_������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution);
	}
	public int solution(int n) {
		 int answer = n;
			for(int i=1;i<=n/2;i++){
				if(n%i==0){
	               answer += i;
				}
			}
			return answer;
	 }
}
