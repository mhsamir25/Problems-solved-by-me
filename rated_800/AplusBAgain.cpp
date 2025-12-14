#include<bits/stdc++.h>
using namespace std;
 
int main(){
    int t;
    cin>>t;
 
    while(t--){
        int a;
        cin>>a;
 
        int b = a/10;
        int c = a%10;
 
        int sum = b+c;
 
        cout<<sum<<endl;
    }
}