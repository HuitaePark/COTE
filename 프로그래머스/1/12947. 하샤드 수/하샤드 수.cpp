#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
    bool answer = true;
    int tmp,sum = 0;
    int originx = x;
    
    while(x>0){
        tmp = x%10;
        sum += tmp;
        x = x/10;
    }
    if(originx%sum!=0){
        answer = false;
    }
    return answer;
}