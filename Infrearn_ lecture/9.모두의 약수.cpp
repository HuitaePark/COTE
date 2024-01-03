#include<stdio.h>
using namespace std;

/* nt main() {
    int a = 0;
    scanf("%d", &a);
    for (int i = 0; i <= a; i++)
    {
        for (int j = 0; j <= i; j++) {
            if (i % j == 0) {
                int count = 0;
                count++;
                printf("%d ", count);
            }
        }
   
    }

    return 0;

}
이런건 시간 오래걸림*/
int cnt[50001];
int main(){
    int n,i,j;
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        for(j=i;j<=n;j=j+1){
        cnt[j]++;
        }
    }
for(i=1;i<=n;i++){
    printf("%d",cnt[i]);
}
return 0;
}
