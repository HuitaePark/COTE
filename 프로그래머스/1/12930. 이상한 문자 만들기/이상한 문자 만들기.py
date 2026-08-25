def solution(s):
    index = 0
    chars = list(s)
    for i in range(0,len(s)) :
        if chars[i]==' ':
            index = 0
        elif index%2==0 :
            chars[i] = chars[i].upper()
            index+=1
        else :
            chars[i] = chars[i].lower()
            index+=1
    return ''.join(chars)