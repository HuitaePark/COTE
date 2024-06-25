#include <stdio.h>

int main(){
    int n,i,high,cnt = 0;
    int height[101];

    scanf("%d",&n);
    for (i = 1; i < n; i++)
    {
        scanf("%d",&height[i]);
    }
    high = height[i];
    for (i = n-1; i >= 1; i--)
    {
       if(height[i]>high){
        high = height[i];
        cnt++;
       }
    }
    printf("%d",cnt);

    return 0;
}
