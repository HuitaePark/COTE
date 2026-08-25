def solution(s):
    if len(s) not in (4, 6):
        return False
    else :
        for i in range(0,len(s)) :
            if(s[i]<'0' or s[i]>'9') :
                return False
        
    return True
    