int main(){
    int x,cnt=0, tmp;
    scanf("%d",&x);    
    for (int i = 1; i <= x; i++)
    {
        tmp =i;
        while(tmp>0){
            tmp=tmp/10;
            cnt++;
        }
    }
    printf("%d",cnt);
    return 0;
}    
