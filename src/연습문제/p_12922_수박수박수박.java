package ��������;

public class p_12922_���ڼ��ڼ��� {

	public String solution(int n) {
        String answer = "";
        for(int i=0;i<n/2;i++){
        	answer += "����";
        }
        if(n%2==1){
        	answer += "��";
        }
        return answer;
    }

}
