package ��������;

import java.util.Arrays;
import java.util.Comparator;

public class p_12915_���ڿ���������������ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparingInt(o1 -> o1.charAt(n)));
        return strings;
    }
}
