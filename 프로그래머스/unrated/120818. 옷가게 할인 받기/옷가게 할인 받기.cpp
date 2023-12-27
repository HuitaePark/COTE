#include <string>
#include <vector>

using namespace std;

int solution(int price) {
    double discount = 0.0;
    if(price>=100000 && price < 300000){
        discount = 0.05;
    }
    else if(price>=300000 && price < 500000){
         discount = 0.1;
    }
    else if(price>=500000){
         discount = 0.2;
    }
    double answer = price - (price * discount);
    return (int)answer;
}