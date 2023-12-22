#include<iostream>

using namespace std;

/*내풀이
int main(){
    int a , b , sum = 0;
    cin >> a >> b;

    for (int i = a; i <= b; i++)
    {
       sum += i;
       cout << sum;
    }
    return 0;
}*/
int main(){
    int a , b , i , sum =0;
    cin>>a>>b;
    for ( i = a; i < b; i++)
    {
        cout<<i<<" + ";
        sum+=i;
    }
    cout<<i<<" = " ;
    cout<<sum+i;
    
    
}
