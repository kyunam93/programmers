import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer=0;
        int cnt=String.valueOf(n).length();
        for(int i=0; i<cnt; i++){
            answer+=(n%10);
            n/=10;
        } 
        
        System.out.println(answer);

        return answer;
    }
}