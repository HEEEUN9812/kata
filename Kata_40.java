// 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n % 3);
            n /= 3;
        }
          int j = 1;
        for(int i = list.size()-1; i > -1; i--){
            answer += list.get(i) * j;
            j *= 3;
        }
        return answer;
    }
}

