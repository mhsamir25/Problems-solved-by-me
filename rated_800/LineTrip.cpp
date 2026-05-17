#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;

    while(t--){
        int n,x;
        cin>>n>>x;
        vector<int>arr(n);
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }

        vector<int>options;
        options.push_back(arr[0]-0);
        for(int i=0;i<n-1;i++){
            options.push_back(arr[i+1]-arr[i]);
        }
        options.push_back(2*(x-arr[n-1]));

        int mx=*max_element(options.begin(), options.end());
        cout<<mx<<endl;
    }
}