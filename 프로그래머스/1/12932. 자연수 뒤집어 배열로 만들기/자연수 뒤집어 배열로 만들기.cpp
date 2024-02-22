#include <string>
#include <vector>

using namespace std;

vector<int> solution(long long n) {
    vector<int> answer;
    int tmp = 0;
    while(n>0){
        tmp=n%10;
        answer.push_back(tmp);
        n = n/10;
    }
    return answer;
}