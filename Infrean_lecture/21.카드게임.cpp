#include <stdio.h>

int main(){
    int a[11],b[11];
    int ascore = 0,bscore = 0;
    for (int i = 0; i < 10; i++)
    {
       scanf("%d",&a[i]);
    }
    for (int i = 0; i < 10; i++)
    {
        scanf("%d",&b[i]);
    }
    for (int i = 0;i< 10 ; i++)
    {
        if(a[i]>b[i]){
            ascore += 3;
        }
        else if(b[i]>a[i]){
            bscore += 3;
        }
        else if (a[i] == b[i]){
            ascore++;
            bscore++;
        }
    }
    if(ascore>bscore){
        printf("A");
    }
    else if(bscore>ascore){
        printf("B");
    }
    else if(ascore == bscore){
        if(a[9]>b[9]){
            printf("A");
            }
         else if(a[9]<b[9]){
            printf("B");
            }
         else if(a[9]==b[9]){
            printf("D");
            }
        }
    

    return 0;
}