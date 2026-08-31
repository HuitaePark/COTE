def solution(n):
    answer = 1
    for i in range(1,3628801) :
        if(answer>n) :
            return i-2
        answer =  answer * i