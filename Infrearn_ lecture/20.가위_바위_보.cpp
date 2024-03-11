#include <stdio.h>

int main(){
    int n,a[101],b[101];
    scanf("%d",&n);
    for (int i = 0; i < n; i++)
    {
       scanf("%d",&a[i]);
    }
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&b[i]);
    }
    for (int i = 0; i < n; i++)
    {
        if (a[i] == b[i])
        {
            printf("D\n");
        }
        else if( (a[i]==1&&b[i]==2)||(a[i]==2&&b[i]==3)||(a[i]==3&&b[i]==1)){
            printf("B\n");
        }
        else{
            printf("A\n");
        }

    }
    
    

    return 0;
}
