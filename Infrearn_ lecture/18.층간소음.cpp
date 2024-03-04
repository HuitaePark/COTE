#include <stdio.h>

int main(){
    int high=0,n,m,cnt=0;
    int second[1001];
    scanf("%d",&n);
    scanf("%d",&m);
    for(int i = 0;i<n;i++){
        scanf("%d",&second[i]);
    }
    for (int i = 0; second[i]!='\0'; i++)
    {
        if(second[i]>m){
            cnt++;
            if(cnt>high){
                high=cnt;
            }
        }
        else{
            cnt = 0;
        }
    }
    
    printf("%d",high);
    
    
    return 0;
}
