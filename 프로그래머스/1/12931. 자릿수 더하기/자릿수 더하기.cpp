#include <iostream>

using namespace std;
int solution(int n)
{
    int answer = 0;
    int tmp, sum = 0;
    while(n>0){
        tmp=n%10;
        sum+=tmp;
        n=n/10;
    }
    return sum;
}