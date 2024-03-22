#include <vector>
#include <queue>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    queue<int> temp;
    
    
    for(int i = 0; i < arr.size(); i++){
        if(i == arr.size() - 1 || arr[i] != arr[i + 1]){
            temp.push(arr[i]);
        }
    }
    
   
    while(!temp.empty()){
        answer.push_back(temp.front());
        temp.pop();
    }
    
    return answer;
}
