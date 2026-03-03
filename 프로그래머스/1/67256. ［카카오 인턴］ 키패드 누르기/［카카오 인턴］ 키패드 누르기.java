class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftPos = 10;  
        int rightPos = 12; 
        
        for (int num : numbers) {
            // 0은 11로 치환
            if (num == 0) num = 11;
            
            if (num == 1 || num == 4 || num == 7) {
                sb.append("L");
                leftPos = num;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                rightPos = num;
            } else {
                // 가운데 열 (2, 5, 8, 11) 누를 때 거리 계산
                int leftDist = getDistance(leftPos, num);
                int rightDist = getDistance(rightPos, num);
                
                if (leftDist < rightDist) {
                    sb.append("L");
                    leftPos = num;
                } else if (rightDist < leftDist) {
                    sb.append("R");
                    rightPos = num;
                } else { // 거리가 같을 때
                    if (hand.equals("left")) {
                        sb.append("L");
                        leftPos = num;
                    } else {
                        sb.append("R");
                        rightPos = num;
                    }
                }
            }
        }
        
        return sb.toString();
    }

    private int getDistance(int pos, int target) {
        int posRow = (pos - 1) / 3;
        int posCol = (pos - 1) % 3;
        
        int targetRow = (target - 1) / 3;
        int targetCol = (target - 1) % 3;

        return Math.abs(posRow - targetRow) + Math.abs(posCol - targetCol);
    }
}