#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;

    vector<string>v;

    for(int i=0;i<n;i++){
        string ip;
        cin>>ip;
        v.push_back(ip);
    }

    unordered_map<string, int> umap;
    vector<string>result;

    for(int i=0;i<n;i++){
        if(umap[v[i]]==0){
            result.push_back("OK");
            umap[v[i]]++;
        }

        else if(umap[v[i]]){
            string s = v[i]+to_string(umap[v[i]]);
            result.push_back(s);
            umap[v[i]]++;
        }

    }

    for(int i=0;i<n;i++){
        cout<<result[i]<<endl;
    }
}