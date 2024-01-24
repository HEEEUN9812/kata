// 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int[][] sizes) {
        // [?][2]
        int answer = 0;
        int wMax = 0;
        int hMax = 0;
        for(int i = 0 ;i < sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                if(sizes[i][0] > wMax){
                    wMax = sizes[i][0];
                }
                if(sizes[i][1] > hMax){
                    hMax = sizes[i][1];
                }
            }else{
                if(sizes[i][0] > hMax){
                    hMax = sizes[i][0];
                }
                if(sizes[i][1] > wMax){
                    wMax = sizes[i][1];
                }
            }
        }
        answer = wMax * hMax;
        return answer;
    }
}