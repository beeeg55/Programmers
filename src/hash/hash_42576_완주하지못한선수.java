package hash;

import java.util.HashMap;

public class hash_42576_완주하지못한선수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String player: participant){
            if(map.containsKey(player)==true){
                int result = map.get(player);
                map.put(player, result+1);
            } else {
                map.put(player,1);
            }
        }
        for(String player: completion){
            int result = map.get(player);
            map.put(player,result-1);
        }
        for(String player: participant){
            if(map.get(player)!=0){
                answer=player;
            }
        }
        return answer;
    }
}
