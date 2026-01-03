#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;

    while(t--){
        int n;
        cin>>n;
        int result=0;

        vector<int> q;

        for(int i=0;i<n;i++){
            int ip;
            cin>>ip;
            q.push_back(ip);
        }

        unordered_map<int, int> umap;

        for(int i=0;i<n;i++){
            umap[q[i]]++;
        }
        
        for(int i=0;i<n;i++){
            if(umap[q[i]]>1){
                result=i+1;
                umap[q[i]]--;
            }
            else{
                umap[q[i]]--;
            }
        }
        cout<<result<<endl;
    }
}