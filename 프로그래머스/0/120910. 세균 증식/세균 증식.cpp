#include <string>
#include <vector>

using namespace std;

int solution(int n, int t) {
    int num = n;
    int answer = num;
    for(int i = 0;i<t;i++){
        answer = answer * 2;
    }
    return answer;
}