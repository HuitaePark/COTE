#include <string>
#include <sstream>
#include <vector>
using namespace std;

int solution(string s) {
    int sum = 0;
    vector<int> numbers;
    stringstream ss(s);
    string temp;
    
    while (ss >> temp) {
        if (temp == "Z") {
            if (!numbers.empty()) {
                sum -= numbers.back();
                numbers.pop_back();
            }
        } else {
            numbers.push_back(stoi(temp));
            sum += numbers.back();
        }
    }
    
    return sum;
}