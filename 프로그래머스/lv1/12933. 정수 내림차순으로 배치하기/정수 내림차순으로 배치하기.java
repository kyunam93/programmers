class Solution {
    public long solution(long n) {
		long answer = 0;
		String num = n+"";
		
		String[] list = num.split("");
		String str = "";
		for(int i=0; i<list.length; i++) {
			for(int j=list.length-1;j>0;j--) {
				if(Integer.parseInt(list[j-1])<Integer.parseInt(list[j])) {
					String temp = list[j-1];
					list[j-1] = list[j];
					list[j] = temp;
				}
			}
		}
		
		for(int i=0; i<list.length; i++) {
			str += list[i];
		}
		
		
		return answer= Long.parseLong(str);
    }
}
