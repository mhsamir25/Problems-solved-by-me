#include<stdio.h>
int main(){
    int n, k;
    scanf("%d%d", &n, &k);
    
    if(k>=1 && k<=50){
        while(k!=0){
            if(n%10 == 0){
            n = n/10;
        }
        else n = n-1; 
        k--;
    }
    printf("%d", n); 
    return 0;
}
}

//Problem link: https://codeforces.com/contest/977/problem/A