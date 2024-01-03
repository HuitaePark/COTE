#include<stdio.h>
using namespace std;

int main() {
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
