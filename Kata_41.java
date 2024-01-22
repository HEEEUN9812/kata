// 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

import java.util.ArrayList;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Character> charArr = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            charArr.add(s.charAt(i));
        }
        int j = 0;
        for(int i = 0; i < charArr.size(); i++){
             if(charArr.get(i) == ' '){
                j = 0;
                 continue;
            }
            if((j+2) % 2 == 0){
                charArr.set(i, Character.toUpperCase(charArr.get(i)));
                    j++;
            }else if((j+2) % 2 == 1){
                charArr.set(i, Character.toLowerCase(charArr.get(i)));
                    j++;
            }    
        }
        for(int i = 0; i < charArr.size(); i++){
            answer += charArr.get(i);
        }
        return answer;
    }
}