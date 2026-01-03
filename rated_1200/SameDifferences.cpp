#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;

    while(t--){
        int n;
        cin>>n;

        vector<int>v;

        for(int i=0;i<n;i++){
            int ip;
            cin>>ip;
            v.push_back(ip);
        }

        unordered_map<int, long long> freq;
        long long count = 0;

        for (int i = 0; i < n; i++) {
            int key = v[i] - i;   

            if (freq.find(key) != freq.end()) {
                count += freq[key];
            }

            freq[key]++;
        }


        cout<<count<<endl;
    }
}