def solution(l, r):
    answer = []

    for i in range(l, r + 1):
        valid = True

        for c in str(i):
            if c != '0' and c != '5':
                valid = False
                break

        if valid:
            answer.append(i)

    if not answer:
        return [-1]

    return answer