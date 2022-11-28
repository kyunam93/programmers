class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int total = 0;
        
        for(int num : arr){
            total +=num;
        }
        
        return answer=(double)total/arr.length;
    }
}