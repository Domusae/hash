import java.util.*;

class Solution {
    public int solution(String[][] clothes) {

        Map<String, Integer> map = new HashMap<>();

        // 1. 종류별 개수 세기
        for (String[] c : clothes) {
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 조합 계산
        int answer = 1;

        for (int count : map.values()) {
            answer *= (count + 1);
        }

        // 3. 아무것도 안 입는 경우 제외
        return answer - 1;
    }
}