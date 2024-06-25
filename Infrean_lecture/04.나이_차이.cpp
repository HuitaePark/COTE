#include<iostream>
using namespace std;

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int i,n,input,old = 0,young = 0;

     cin>>n;     
     for (i = 1; i < n; i++)
     {
        
        cin>>input;
       
        if (input>old)
        {
           old = input;
        }
        if(input<young){
            young = input;
        }
     }
     cout<<old - young;
}
