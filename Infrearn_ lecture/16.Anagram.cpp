#include <stdio.h>
int main(){
    int sum1,sum2;
    int a[101];
    int b[101];
    scanf("%d", &a);
    scanf("%d", &b);   
    
    for (int i = 0; i !='\0'; i++)
    {
        sum1+=a[i];       
    }
    
    for (int i = 0; i !='\0'; i++)
    {
        sum2+=b[i];       
    }
    
    if(sum1==sum2){
        printf("YES");
    }
    else{
        printf("NO");
    }
    
    return 0;
}
