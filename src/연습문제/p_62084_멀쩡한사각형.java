package 연습문제;

public class p_62084_멀쩡한사각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(8,12));
		System.out.println(solution(2,2));
		System.out.println(solution(2,5));
		System.out.println(solution(10,10));
		System.out.println(solution(2,6));
		System.out.println(solution(200000,10000));
		System.out.println(solution(3,7));
	}
	public static long solution(int w, int h) {
		long answer = 0;
        for(int i = 0; i < w; i++) 
            answer += (Long.valueOf(h) * i) / Long.valueOf(w);
         
        return answer * 2;
    }
}
