#include<bits/stdc++.h>
using namespace std;
 
const long long INF=1e18;
int main(){
    long long n,m;
    cin>>n>>m;
 
    vector<pair<long long, long long>>adj[n+1];
    for(int i=0;i<m;i++){
        long long u,v,w;
        cin>>u>>v>>w;
 
        adj[u].push_back({v,w});
        adj[v].push_back({u,w});
    }
 
    int source=1;
 
    vector<long long>dist(n+1, INF);
    vector<long long>parent(n+1, -1);
 
    priority_queue<
        pair<long long, long long>,
        vector<pair<long long,long long>>,
        greater<pair<long long, long long>>
    > pq;
 
    dist[source]=0;
    pq.push({0,source});
 
    while(!pq.empty()){
        long long current_dist = pq.top().first;
        long long u=pq.top().second;
        pq.pop();
 
        if(current_dist > dist[u]) continue;
 
 
        for(auto edge:adj[u]){
            long long v=edge.first;
            long long w=edge.second;
 
            if(dist[u]+w<dist[v]){
                dist[v]=dist[u]+w;
                parent[v]=u;
                pq.push({dist[v],v});
            }
        }
 
    }
 
    if(dist[n] == INF){
        cout << "-1" << endl;
        return 0;
    }
 
 
    vector<long long>path;
 
    long long node=n;
 
    while(node!=-1){
        path.push_back(node);
        node=parent[node];
    }
 
    reverse(path.begin(),path.end());
 
    for(long long x : path){
        cout << x << " ";
    }
    cout << endl;
 
    return 0;
}