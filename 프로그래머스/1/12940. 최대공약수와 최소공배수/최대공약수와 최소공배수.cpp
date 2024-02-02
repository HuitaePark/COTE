#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, int m) {
    vector<int> answer;
    int r = 0 ;
    int gcd = m ;
    int x = n;
     while(x % gcd != 0) {
        r = x % gcd;
        x = gcd;
        gcd = r;
    }
    int gbd = (n*m)/gcd;
    answer.push_back(gcd);
    answer.push_back(gbd);
    return answer;
}