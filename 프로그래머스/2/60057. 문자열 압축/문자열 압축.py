def solution(s):
    answer = len(s)

    for size in range(1, len(s) // 2 + 1):

        compressed = ""
        prev = s[:size]
        count = 1

        for i in range(size, len(s), size):
            chunk = s[i:i+size]

            if prev == chunk:
                count += 1

            else:
                if count == 1:
                    compressed += prev
                else:
                    compressed += str(count) + prev

                prev = chunk
                count = 1

        # 마지막 덩어리 처리
        if count == 1:
            compressed += prev
        else:
            compressed += str(count) + prev

        # 최소 길이 갱신
        answer = min(answer, len(compressed))

    return answer