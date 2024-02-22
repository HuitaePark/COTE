#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    int num = 0;
    for(int i = 1;i<n;i++){
        int result;
        if(n%i==1){
            num = i;
            answer = num;
            break;
        }
    }
    return answer;
}