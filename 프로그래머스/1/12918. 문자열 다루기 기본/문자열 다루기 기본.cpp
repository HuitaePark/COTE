#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = false;
    int size = s.size();
    if(size== 4 || size == 6){
    for(int i = 0;i<=size;i++){
        if(s[i]>=48 && s[i]<=57){
            answer = true;
        }
        else if (s[i]>57){
            answer = false;
            break;
        }
    }
}
    
    return answer;
}