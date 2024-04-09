#include <string>
#include <iostream>

using namespace std;

bool solution(string s)
{
    bool answer = true;
    int left = 0, right = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s[i] == '(') {
            left++;
        } else if (s[i] == ')') {
            right++;
        }
    }
    if((left == right) && s[s.size()-1]==')'){
        answer = true;
    }
    else if (s[0]==')'||(left != right)) {
        answer = false;
    }

    return answer;
}
