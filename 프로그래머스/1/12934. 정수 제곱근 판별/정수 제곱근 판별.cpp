#include <string>
#include <vector>

using namespace std;

long long solution(long long n) {
    long long answer = 0;

    long long i;
    for(i=1; i*i<=n; i++);
    if((i-1)*(i-1)==n)
    {
        answer = i*i;
    }

    else{
        answer = -1;
    }



    return answer;
}
