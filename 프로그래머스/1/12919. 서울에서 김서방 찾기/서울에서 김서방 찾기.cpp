#include <string>
#include <vector>

using namespace std;


string solution(vector<string> seoul) {
    string answer = "";
    int pos = 0;
    for(int i = 0;i<seoul.size();i++){
        if(seoul[i]=="Kim"){
            pos = i;
            }
    }
    answer = "김서방은 "+to_string(pos)+"에 있다";
    
    return answer;
}