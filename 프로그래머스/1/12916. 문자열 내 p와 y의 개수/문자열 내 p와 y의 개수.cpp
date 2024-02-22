#include <string>
#include <iostream>
#include <algorithm>

using namespace std;

bool solution(string s)
{//
    bool answer = true;
    int pcount = 0;
    int ycount = 0;
    for(int i = 0; s[i] != '\0'; i++) {
        if(tolower(s[i]) == 'p') {
            pcount++;
        }
        if(tolower(s[i]) == 'y') {
            ycount++;
        }
    }
    
    if(pcount==ycount){
        answer = true;
    }
    else{
        answer = false;
    }
    return answer;
}