#include<iostream>

using namespace std;

/* int solution(int num1,int num2) {
    int sum = 0;
    for (int i = 1; i <= num1; i++)
    {
        if((3<=num1) && (i % num2 == 0)){
            sum += i;
        }
    }
    
    return sum;
}

int main()
{
  cout << solution(15,3);
  return 0;
} */

int main(){
    int n, m, i, sum=0;
    cin >> n >> m;
    
    for ( i = 1; i <= n; i++)
    {
        if(i%m == 0){
            sum+=i;
        }
    }
    cout << sum;
    return 0;
}


