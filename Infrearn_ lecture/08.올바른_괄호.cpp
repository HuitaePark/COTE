#include<stdio.h>
using namespace std;
#include<stack>

int main(){
    int a = 0;
    char s[30];
    scanf ("%s",&s);
    for (int i = 0; s[i]!='\0'; i++)
    {
        if(s[i]=='('){
            a++;
        }
        else if(s[i]==')'){
            a--;
        }
    }
    if (a == 0)
    {
        printf("YES");
    }
    else{
        printf("NO");
    }

return 0;

}
