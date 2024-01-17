// 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            arr.add(str.charAt(i));
        }
        Collections.sort(arr,Collections.reverseOrder());
        String result = "";
        for(int i = 0; i < arr.size();i++){
            result += arr.get(i);
        }
        answer = Long.valueOf(result);
        return answer;
    }
}
