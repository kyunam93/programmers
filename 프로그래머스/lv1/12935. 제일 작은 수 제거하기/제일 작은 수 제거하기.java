class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length==1) {
        	answer=new int[] {-1};
        }else if(arr.length>1) {
        	int min=arr[0];
        	for(int a:arr) {
        		min=Math.min(a, min);
        	}
        	answer=new int[arr.length-1];
        	int idx=0;
        	for(int i=0;i<arr.length;i++) {
        		if(arr[i]==min) continue;
        		answer[idx++]=arr[i];
        	}
        }
        
        return answer;
    }
}