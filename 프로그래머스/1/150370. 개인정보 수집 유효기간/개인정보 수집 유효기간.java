import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 오늘 날짜를 '총 일수'로 변환
        int todayDays = getDays(today);
        
        // 약관 정보를 Map에 저장 (유효기간 달 수를 '일수'로 변환하여 저장)
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] split = term.split(" ");
            termMap.put(split[0], Integer.parseInt(split[1]) * 28);
        }
        
        // 파기해야 할 개인정보 인덱스 수집
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            int privacyDays = getDays(privacy[0]); // 개인정보 수집 일자
            int termDays = termMap.get(privacy[1]); // 해당 약관의 유효기간 
            
            //오늘 날짜 이상이면 파기 대상
            if (privacyDays + termDays <= todayDays) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // 날짜 문자열을 받아서 총 일수로 반환
    private int getDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        return (year * 12 * 28) + (month * 28) + day;
    }
}