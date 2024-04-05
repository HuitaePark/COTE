#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    if (s[0]>='a'&&s[0]<='z'){
        s[0]-=' ';
    }
    for(int i= 1;i<s.size();i++){
        if(s[i]>='A'&&s[i]<='Z'){
            s[i]+=' ';
        }
    }
    for(int i= 1;i<s.size();i++){
        if(s[i-1]==' '&&(s[i]>=97&s[i]<=122)){
            s[i]-=' ';
        }
        
    }
     answer = s;   
    
    return answer;
}
