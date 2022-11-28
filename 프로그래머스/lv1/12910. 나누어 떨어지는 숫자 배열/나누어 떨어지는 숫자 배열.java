import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt=0;
        
        for(int a:arr) {
        	if(a%divisor==0)	cnt++;
        }
    	if(cnt>0) {
    		answer=new int[cnt];
    		int idx=0;
    		for(int a:arr) {
            	if(a%divisor==0) answer[idx++]=a;
    		}
    	}else if(cnt==0)	answer=new int[] {-1};
    	
    	Arrays.sort(answer);
    	
        return answer;
    }
}