#include <string>
#include <vector>
#include <algorithm>
using namespace std;

double solution(vector<int> arr) {
    double answer = 0;
    for(int num : arr){
        answer += num;
    }
    answer = answer/arr.size(); 
    return answer;
}