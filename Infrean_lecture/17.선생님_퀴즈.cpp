#include <stdio.h>

int main(){
    int num,sum=0,solve,cnt = 0;
   
   scanf("%d",&cnt);
   
   for (int i = 0; i < cnt; i++)
   {
        
        scanf("%d",&num);
        scanf("%d",&solve);
        sum=0;
        for (int j = 1; j <= num; j++)
        {
            
            sum+=j;
        }
        if (sum==solve)
        {
            printf("YES\n");
        }
        else
        {
            printf("NO\n");
        }
    }
        
    return 0;
}
