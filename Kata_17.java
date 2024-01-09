// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

import java.util.ArrayList;

class Solution {
    public long[] solution(long n) {
        long[] answer = {};
        ArrayList<Long> intList = new ArrayList<>();
        while(n > 0){
            intList.add(n % 10);
            n /= 10;
        }
        long [] intArr= new long[intList.size()];
        for(int i =0; i < intList.size(); i++){
            intArr[i] = intList.get(i);
        }
        answer = intArr;
        return answer;
    }
}
