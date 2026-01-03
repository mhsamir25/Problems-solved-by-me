#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    long long r1, r2;
    vector<int>v1;
    vector<int>v2;
    vector<int>v3;

    for(int i=0;i<n;i++){
        int ip;
        cin>>ip;
        v1.push_back(ip);
    }

    for(int i=0;i<n-1;i++){
        int ip;
        cin>>ip;
        v2.push_back(ip);
    }

    for(int i=0;i<n-2;i++){
        int ip;
        cin>>ip;
        v3.push_back(ip);
    }

    unordered_map<int, int>umap;

    for(int i=0;i<n;i++){
        umap[v1[i]]++;
    }

    for(int i=0;i<n-1;i++){
        umap[v2[i]]--;
    }

    for(auto &p:umap){
        if(p.second==1){
            r1=p.first;
            break;
        }
    }
    umap.clear();

    for(int i=0;i<n-1;i++){
        umap[v2[i]]++;
    }

    for(int i=0;i<n-2;i++){
        umap[v3[i]]--;
    }

    for(auto &p:umap){
        if(p.second==1){
            r2=p.first;
            break;
        }
    }


    cout<<r1<<endl;
    cout<<r2<<endl;

}