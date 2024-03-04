#include <stdio.h>

int main(){
    int s=0,n,m,cnt=0;
    scanf("%d",&n);
    scanf("%d",&m);
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&s);
        if(s>m){
            cnt++;
        }
        s = 0;
    }
    
    
    printf("%d",cnt);
    
    
    
    return 0;
}
