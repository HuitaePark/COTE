using namespace std;

long long solution(int price, int money, int count)
{
    long long answer = 0;
    long long won =0;
    for(int i =1;i<=count;i++){
        won+=price*i;
    }
    if(money>=won){
        answer = 0;
    }
    else{
        answer = won - money;
    }
    
    return answer;
}