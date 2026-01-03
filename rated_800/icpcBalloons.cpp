#include<bits/stdc++.h>

using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        bool visited[26]={false};
        int balloon=0;
        queue<char>q;

        for(int i=0;i<n;i++){
            char ip;
            cin>>ip;
            ip = toupper(ip);
            q.push(ip);
        }

        while(!q.empty()){
            char temp = q.front();
            q.pop();

            if(visited[temp-'A']==false){
                visited[temp-'A']=true;
                balloon+=2;
            }
            else{
                balloon++;
            }

        }
        
        cout<<balloon<<endl;

    }
}