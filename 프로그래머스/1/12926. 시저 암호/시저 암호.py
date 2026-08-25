def solution(s, n):
    answer = list(s)
    for i in range(0,len(answer)) :
        if answer[i]==' ' :
            continue
        
        current = ord(answer[i]) + n
        
        if ord(answer[i]) >= 65 and ord(answer[i]) <= 90 :
            if current>90:
                    current = current - 26
            answer[i] = chr(current)        
        else :
            if current>122:
                    current = current - 26
            answer[i] = chr(current)
    return ''.join(answer)
