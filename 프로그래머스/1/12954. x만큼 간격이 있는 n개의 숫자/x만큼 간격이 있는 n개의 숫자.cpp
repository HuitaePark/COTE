#include <string>
#include <vector>

using namespace std;

vector<long long> solution(int x, int n) {
    vector<long long> answer;
    long long sum = 0; 
    for(int i=0;i<n;i++){
        sum = sum + x;
        answer.push_back(sum);
    }
    return answer;
}