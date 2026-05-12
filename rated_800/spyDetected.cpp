#include<bits/stdc++.h>
using namespace std;
int main(){
 
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int>a(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
 
        int pos=0;
        int *addr=&a[0];
        bool flag=false;
 
        if(a[0]!=a[1] && a[1]==a[2]){
            pos=0;
            flag=true;
        }
 
        else if(a[1]!=a[0] && a[0]==a[2]){
            pos=1;
            flag=true;
        }
 
        if(!flag){
            for(int i=1;i<n;i++){
            if(a[pos]==a[i] && addr!=&a[i]){
                pos++;
                addr=&a[i];
            }
            else{
                pos=i;
                break;
            }
            }
        }
        
        cout<<pos+1<<endl;
    }
}