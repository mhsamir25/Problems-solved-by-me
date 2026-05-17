#include<bits/stdc++.h>
using namespace std;

const long long INF = 1e18;
typedef long long ll;

int main(){
    int n,m;
    cin>>n>>m;

    vector<tuple<int,int,long long>>edges;

    for(int i=0;i<m;i++){
        int u,v;
        ll w;

        cin>>u>>v>>w;

        edges.push_back({u,v,w});
    }

    vector<ll>dist(n+1, 0);
    vector<int>parent(n+1, -1);

    int last_update_node=-1;

    for(int i=1;i<=n;i++){
        last_update_node=-1;
        for(auto &edge:edges){
            int u,v;
            ll w;
            tie(u,v,w)=edge;

            if(dist[u]+w<dist[v]){
                dist[v]=dist[u]+w;
                parent[v]=u;
                last_update_node=v;
            }
        }

        if(last_update_node==-1) break;
    }

    if(last_update_node==-1){
        cout<<"NO"<<endl;
        return 0;
    }

    cout<<"YES"<<endl;

    int cycle_node=last_update_node;
    for(int i=1;i<=n;i++){
        cycle_node=parent[cycle_node];
    }

    vector<int>cycle;
    int current=cycle_node;

    do{
        cycle.push_back(current);
        current=parent[current];
    }while(current!=cycle_node);

    cycle.push_back(cycle_node);


    reverse(cycle.begin(),cycle.end());
    for(int node:cycle){
        cout<<node<<" ";
    }

    cout<<endl;
    return 0;
}

/*
You are given a directed graph, and your task is to find out if it contains a negative cycle, and also give an example of such a cycle.
Input
The first input line has two integers n and m: the number of nodes and edges. The nodes are numbered 1,2,\ldots,n.
After this, the input has m lines describing the edges. Each line has three integers a, b, and c: there is an edge from node a to node b whose length is c.
Output
If the graph contains a negative cycle, print first "YES", and then the nodes in the cycle in their correct order. If there are several negative cycles, you can print any of them. If there are no negative cycles, print "NO".
Constraints

1 \le n \le 2500
1 \le m \le 5000
1 \le a,b \le n
-10^9 \le c \le 10^9

Example
Input:
4 5
1 2 1
2 4 1
3 1 1
4 1 -3
4 3 -2

Output:
YES
1 2 4 1
*/