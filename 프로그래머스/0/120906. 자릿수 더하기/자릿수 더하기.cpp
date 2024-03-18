#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int result = 0;
    while(n>0){
        result = n%10;
        answer += result;
        n = n/10;
        result = 0;
    }
    return answer;
}