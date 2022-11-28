class Solution {
    public String solution(String s) {
		String answer="";
		
		// abcde : 01234
		int result = s.length()%2;
		int idx = s.length()/2;
		
		answer = result==1 ? String.valueOf(s.charAt(idx)): String.valueOf(s.charAt(idx-1))+String.valueOf(s.charAt(idx));

		return answer;
    }
}