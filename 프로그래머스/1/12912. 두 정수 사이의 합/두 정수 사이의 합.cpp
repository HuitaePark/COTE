#include <string>
#include <vector>

using namespace std;

long long solution(int a, int b) {
    long long answer = 0;
    long long tmp = 0;
    long long sum = 0;
    if(b>a){
        tmp = a;
        a = b;
        b = tmp;
    }
    for(int i = b;i<=a;i++){
        sum = sum + i;    
    }
        
    return sum;
}