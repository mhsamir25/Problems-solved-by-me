#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int c1=0,c2=0,c3=0;
        vector<string>v1;
        vector<string>v2;
        vector<string>v3;


        for(int i=0;i<n;i++){
            string ip;
            cin>>ip;
            v1.push_back(ip);
        }

        for(int i=0;i<n;i++){
            string ip;
            cin>>ip;
            v2.push_back(ip);
        }

        for(int i=0;i<n;i++){
            string ip;
            cin>>ip;
            v3.push_back(ip);
        }


        unordered_map<string, int> umap;

        for(int i=0;i<n;i++){
            umap[v1[i]]++;
            umap[v2[i]]++;
            umap[v3[i]]++;
        }

        vector<int> v4(n), v5(n), v6(n);

        for(int i=0;i<n;i++){
            v4[i]=umap[v1[i]];
        }

        for(int i=0;i<n;i++){
            v5[i]=umap[v2[i]];
        }

        for(int i=0;i<n;i++){
            v6[i]=umap[v3[i]];
        }

        for(int i=0;i<n;i++){
            if(v4[i]==1){
                c1+=3;
            }
            else if(v4[i]==2){
                c1+=1;
            }
        }

        for(int i=0;i<n;i++){
            if(v5[i]==1){
                c2+=3;
            }
            else if(v5[i]==2){
                c2+=1;
            }
        }

        for(int i=0;i<n;i++){
            if(v6[i]==1){
                c3+=3;
            }
            else if(v6[i]==2){
                c3+=1;
            }
        }

        cout<<c1<<" "<<c2<<" "<<c3<<endl;

    }
}