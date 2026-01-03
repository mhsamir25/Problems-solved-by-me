#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;

        vector<int> v;

        for(int i=0;i<n;i++){
            int ip;
            cin>>ip;
            v.push_back(ip);
        }

        unordered_map<int, int> umap;

        for(int i=0;i<n;i++){
            umap[v[i]]++;
        }

        bool flag = false;

        for(int i=0;i<n;i++){
            if(umap[v[i]]>=2){
                flag = true;
            }
        }

        if(flag==true){
            cout<<"YES"<<endl;
        }

        else{
            cout<<"NO"<<endl;
        }
    }
}