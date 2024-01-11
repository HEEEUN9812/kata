// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.


import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                arrList.add(arr[i]);
            }
        }
        if(arrList.size() == 0){
            int[] result1 = {-1};
            answer = result1;
        }else{Collections.sort(arrList);
        int[] result = new int [arrList.size()];
            for(int i = 0 ; i < arrList.size(); i++){
                result[i] = arrList.get(i).intValue();
                answer = result;
            }
        }
        return answer;
    }
}