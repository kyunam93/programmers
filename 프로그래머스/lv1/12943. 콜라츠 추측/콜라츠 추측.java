class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = (long)num;
        while(n!=1){
            if(n==1){
                break;
            }else if(answer>=500) {
                answer = -1;
                break;
            }
            if(n%2==0){ // 1-1. 입력된 수가 짝수라면 2로 나눕니다. 
                n/=2;
            }else{  // 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
                n = (n*3)+1;
            }
            ++answer;
        }
        return answer;
    }
}