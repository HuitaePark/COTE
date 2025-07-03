import java.util.*;
import java.io.*;

public class Main {
    private static int[] tmp;
    private static int count = 0; // static으로 변경
    private static int k;
    private static int result = -1;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken()); // k를 static 변수에 저장

        int[] array = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        // 1. tmp 배열 초기화
        tmp = new int[n];

        // 2. merge_sort 함수 호출
        merge_sort(array, 0, n - 1);

        // 3. 결과 출력
        System.out.println(result);
        
        br.close();
    }

    // 반환 타입을 void로 변경
    private static void merge_sort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(arr, p, q);
            merge_sort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    // 매개변수 이름을 p -> left, r -> right로 통일하여 명확하게 함
    private static void merge(int[] arr, int left, int mid, int right) {
        // 이미 k번째 수를 찾았다면 더 이상 진행할 필요 없음
        if (result != -1) return;

        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) { // 'a' -> 'arr'로 수정
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= mid) {
            tmp[t++] = arr[i++];
        }

        while (j <= right) {
            tmp[t++] = arr[j++];
        }

        i = left; // 'p' -> 'left'로 수정
        t = 0;
        while (i <= right) {
            // 원본 배열에 복사할 때마다 count를 증가시키고 k와 비교
            count++;
            if (count == k) {
                result = tmp[t];
            }
            arr[i++] = tmp[t++];
        }
    }
}