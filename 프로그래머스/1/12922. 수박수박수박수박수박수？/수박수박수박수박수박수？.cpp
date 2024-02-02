#include <string>
#include <vector>

using namespace std;

string solution(int n) {
    string answer = "";
    if(n%2==0){
      for(int i = 0;i<(n/2);i++){
          answer = answer + "수박";
      }  
    }
    else if(n%2==1){
        for(int i = 0;i<(n/2);i++){
          answer = answer + "수박";
      } 
        answer = answer +"수";
    }
    return answer;
}