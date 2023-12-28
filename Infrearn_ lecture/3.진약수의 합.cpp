#include<iostream>

using namespace std;
int main(){
    
    int n , sum = 0;
    
    
    cin>>n;

    cout<< 1;
    for (int i = 2; i < n; i++)
    {
       if (n%i==0)
       {    
            sum = sum + i;

            cout<<" + ";
            cout<< i;
            
       }
       
    }
     sum = sum + 1;
     cout<<" = "<<sum;

    return 0;
}
