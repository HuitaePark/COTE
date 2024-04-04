#include <iostream>
#include <string>
#include <sstream>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    string max = "", min = "";
    
    vector<string> number;    
    string input = s;
    stringstream ss(input);
    string num;
    while (getline(ss, num, ' ')){
        number.push_back(num);
    }
    max = number[0];
    min = number[0];
    for(int i = 0; i < number.size(); i++) {
        if(stoi(number[i]) < stoi(min)){
            min = number[i];
        }
        if(stoi(number[i]) > stoi(max)){
            max = number[i];
        }
    }
    answer = min + " " + max;
                    
    return answer;
}