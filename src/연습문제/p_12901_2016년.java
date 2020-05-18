package 연습문제;

public class p_12901_2016년 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(1,1));
		System.out.println(solution(8,22));
	}
	public static String solution(int a, int b) {
		String[] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int index = 4;
        for(int i=1;i<a;i++){
        	switch(i){
        		case 2 : index +=1; break;
        		case 4 : index += 2; break;
        		case 6 : index += 2; break;
        		case 9 : index += 2; break;
        		case 11 : index += 2; break;
        		default: index += 3; break;
        	}
        }
        index += b;
        
		String answer = arr[index%7];
        
        return answer;
    }

}
