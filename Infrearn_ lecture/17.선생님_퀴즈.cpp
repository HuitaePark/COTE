#include <stdio.h>

int main(){
   int cnt = 0;

   
   scanf("%d",&cnt);
   
   for (int i = 0; i < cnt; i++)
   {
    int num, solve, sum = 0;
        
        scanf("%d",&num);
        scanf("%d",&solve);
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
