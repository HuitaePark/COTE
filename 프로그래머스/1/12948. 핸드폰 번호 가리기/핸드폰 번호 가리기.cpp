#include <string>
#include <iostream>

using namespace std;

string solution(string phone_number) {
    int length = phone_number.length();
    
    // 전화번호 뒷 4자리를 제외한 나머지를 '*'로 가림
    string answer = string(length - 4, '*') + phone_number.substr(length - 4);
    
    return answer;
}
