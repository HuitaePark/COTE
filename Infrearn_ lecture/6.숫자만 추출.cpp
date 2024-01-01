#include<stdio.h>
using namespace std;

int main() {
    char str[50];
    int num = 0, plus = 0;
    
    scanf("%s", &str);
     
    for (int i = 0;str[i]!='\0'; i++) {
        if (str[i] >=48 && str[i] <= 57) {
            num = num * 10 + str[i] - 48;
        }
    }

    for (int i = 1; i <= num; i++) {
        if (num % i == 0) plus++;
    }
    
    printf("%d\n", num);
    printf("% d\n", plus);


    return 0;
}
