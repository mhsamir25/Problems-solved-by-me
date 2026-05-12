#include<bits/stdc++.h>
using namespace std;
 
int main(){
    int t;
    cin>>t;
    while(t--){
        int a,b;
        cin>>a>>b;
 
        int count=0;
        int diff=abs(a-b);
        if(diff%10!=0){
            count=(diff/10)+1;
        }
        else{
            count=diff/10;
        }
 
        cout<<count<<endl;
    }
}