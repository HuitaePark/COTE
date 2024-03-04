#include <stdio.h>

int main(){
    int s=0,n,m,cnt=0;
    int second[1001];
    scanf("%d",&n);
    scanf("%d",&m);
    for(int i = 0;i<n;i++){
        scanf("%d",&second[i]);
    }
    for (int i = 0; i!='\0'; i++)
    {
        if(second[i-1]>m && second[i]>m){
            cnt++;
        }
    }
    
    
    printf("%d",cnt);
    
    
    
    return 0;
}
