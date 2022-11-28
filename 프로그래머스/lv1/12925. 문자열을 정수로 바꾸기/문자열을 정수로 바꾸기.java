/*
[문제 설명]
문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

[제한 조건]
s의 길이는 1 이상 5이하입니다.
s의 맨앞에는 부호(+, -)가 올 수 있습니다.
s는 부호와 숫자로만 이루어져있습니다.
s는 "0"으로 시작하지 않습니다.

[입출력 예]
예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
*/

class Solution {
    public int solution(String str) {
        int answer = 0;
        
        // s의 길이는 1 이상 5이하입니다.
        if(str.length() >= 1 && str.length() <= 5) {
        	// s의 맨앞에는 부호(+, -)가 올 수 있습니다.
        	if(str.charAt(0)-'0' >=1 && str.charAt(0)-'0' <=9) {
        		answer = Integer.parseInt(str);
        	}else if(str.charAt(0) == '+') {	// s의 맨 앞 부호가 +라면 실행
        		String s = str.substring(1,str.length());
        		answer = Integer.parseInt(str);
        		
        	}else if(str.charAt(0) == '-') {	// s의 맨 앞 부호가 -라면 실행
        		String s = str.substring(1,str.length());
        		answer = Integer.parseInt(s)*-1;
        	}else {	// s의 맨 앞 부호가 +,- 둘다 아니라면 실행
        		System.out.println("맨앞에는 부호(+, -)가 올 수 있습니다.");
        	}
        }else {
        	System.out.println("1 이상 5이하의 길이로 입력핫에ㅛ");
        }
        
        return answer;
    }
}