#include<bits/stdc++.h>
using namespace std;
 
int main(){
    int t;
    cin>>t;
    while(t--){
 
        int n;
        cin>>n;
 
        int count=0;
 
        for(int w=0;w*4<=n;w++){
            int r = n-w*4;
 
            if(r%2==0){
                count++;
            }
        }
 
        cout<<count<<endl;
    }
}