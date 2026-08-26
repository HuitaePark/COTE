def solution(s):
    answer = 0
    first = 0
    second = 0
    fIndex = -1
    
    for i in range(0,len(s)) :
        if fIndex  == -1 :
            fIndex = i
            first = 1
            continue
        else :
            if s[i] == s[fIndex] :
                first+=1
            else :
                second+=1
        if first == second :
            answer+=1
            fIndex = -1
            first = 0
            second = 0
    if fIndex != -1:
        answer += 1    
    return answer