#include <stdio.h>

int main(){
    int s,n,m,cnt=0;

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
