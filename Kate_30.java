// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        if(len % 2 == 1 ){
            answer = Character.toString(s.charAt(len/2));
        }
            else if(len % 2 == 0){
                answer = Character.toString(s.charAt(len/2 - 1)) + Character.toString(s.charAt(len / 2 ));
            }
        return answer;
    }
}