package hash;

public class phonenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0;i<phone_book.length;i++){
			for(int j=0;j<phone_book.length;j++){
				if(i==j) continue;
				if(phone_book[i].length()<=phone_book[j].length()){
					if(phone_book[j].substring(0,phone_book[i].length()).equals(phone_book[i])){
						answer = false;
						break;
					}
				}
			}
			if(answer==false) break;
		}
        return answer;
    }
}
