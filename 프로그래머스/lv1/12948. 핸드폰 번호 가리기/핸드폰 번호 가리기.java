class Solution {
    public String solution(String phone_number) {
        String answer = "";

        int max = phone_number.length()-4;
        
        for(int i=0; i<max;i++){
            answer+='*';
        }
        for(int i=max; i<phone_number.length(); i++){
            answer+=phone_number.charAt(i);
        }

        return answer;
    }
}