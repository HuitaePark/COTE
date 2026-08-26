def solution(array):
    mx = 0
    max_idx = 0
    for i in range(0,len(array)) :
        if array[i] > mx :
            mx = array[i]
            mx_idx = i
            
    return [mx,mx_idx]