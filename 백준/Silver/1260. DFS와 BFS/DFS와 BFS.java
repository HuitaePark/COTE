import java.util.*;
import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            map.get(a).add(b);
            map.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(map.get(i), Collections.reverseOrder());
        }
        dfs(map, v);
        sb.append("\n");


        for (int i = 1; i <= n; i++) {
            Collections.sort(map.get(i));
        }
        bfs(map, v);

        bw.write(sb.toString());
        bw.flush();
    }


    public static void dfs(Map<Integer, ArrayList<Integer>> map, int start) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            Integer cur = stack.pop();

            if (visited.contains(cur)) {
                continue;
            }
            
            visited.add(cur);
            sb.append(cur).append(" ");

            // 내림차순으로 정렬된 리스트를 순회하며 스택에 추가
            for (Integer i : map.get(cur)) {
                if (!visited.contains(i)) {
                    stack.push(i);
                }
            }
        }
    }


    public static void bfs(Map<Integer, ArrayList<Integer>> map, int start) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            Integer cur = q.poll();
            sb.append(cur).append(" ");
            
            // 오름차순으로 정렬된 리스트를 순회하며 큐에 추가
            for (Integer i : map.get(cur)) {
                if (!visited.contains(i)) {
                    visited.add(i);
                    q.add(i);
                }
            }
        }
    }
}