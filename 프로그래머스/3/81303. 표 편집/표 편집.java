import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        // 삭제된 행의 인덱스를 저장하는 스택 (복구용)
        Stack<Integer> stack = new Stack<>();

        // 각 행을 기준으로 위/아래 행의 인덱스를 저장할 배열 (가상 연결리스트)
        // index 0은 dummy 영역 (편하게 인덱싱 하기 위해 n+2 사용)
        int[] up = new int[n + 2];
        int[] down = new int[n + 2];

        // 연결 초기화: 각 행은 처음에 자기 앞/뒤 인덱스와 연결됨
        for (int i = 0; i < n + 2; i++) {
            up[i] = i - 1;
            down[i] = i + 1;
        }

        // 실제 표 인덱스는 1부터 시작 (0은 dummy 영역)
        k++; // 입력으로 받은 커서 위치도 1 증가시켜줌

        // 명령어 순차 처리
        for (String c : cmd) {
            if (c.startsWith("C")) { // 삭제 명령
                stack.push(k); // 현재 위치 저장 (복구를 위해)
                up[down[k]] = up[k];   // 현재 행의 아래쪽 위 포인터를 위쪽으로 연결
                down[up[k]] = down[k]; // 현재 행의 위쪽 아래 포인터를 아래쪽으로 연결

                // 커서를 아래 행으로 이동하되, 맨 끝이라면 위로 이동
                k = (down[k] > n) ? up[k] : down[k];
            }

            else if (c.startsWith("Z")) { // 복구 명령
                int restore = stack.pop(); // 마지막 삭제된 행

                // 위/아래 인덱스를 통해 다시 연결해줌
                down[up[restore]] = restore;
                up[down[restore]] = restore;
            }

            else { // 이동 명령 (U 또는 D)
                String[] s = c.split(" ");
                int x = Integer.parseInt(s[1]);

                // U: 위로 x칸 / D: 아래로 x칸
                for (int i = 0; i < x; i++) {
                    k = s[0].equals("U") ? up[k] : down[k];
                }
            }
        }

        // 결과 문자열 초기화 (모두 'O'로 시작)
        char[] answer = new char[n];
        Arrays.fill(answer, 'O');

        // 스택에 남아 있는 삭제된 인덱스를 'X'로 표시
        for (int i : stack) {
            answer[i - 1] = 'X'; // 실제 표 인덱스는 1부터 시작했으므로 -1 보정
        }

        return new String(answer);
    }
}
