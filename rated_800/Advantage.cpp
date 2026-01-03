#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int max=0, max2=0;
        vector<int> v;
        
        for(int i=0;i<n;i++){
            int ip;
            cin>>ip;
            v.push_back(ip);
        }
        vector<int> v1=v;

        sort(v1.begin(),v1.end());

        for(int i=0;i<n;i++){
            if(v[i]==v1[n-1]){
                v[i]=v[i]-v1[n-2];
            }
            else{
                v[i]=v[i]-v1[n-1];
            }
        }

        for(int i=0;i<n;i++){
            cout<<v[i]<<" ";
        }

    }
}