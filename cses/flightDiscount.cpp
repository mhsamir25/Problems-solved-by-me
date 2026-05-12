#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll INF=1e18;

void dijkstra(int start, vector<vector<pair<int, ll>>> &graph, vector<ll>&dist){
    int n=graph.size()-1;
    dist.assign(n+1, INF);
    dist[start]=0;

    priority_queue<
        pair<ll,int>,
        vector<pair<ll,int>>,
        greater<pair<ll,int>>
    >pq;

    pq.push({0, start});

    while(!pq.empty()){
        auto [d, u]=pq.top();
        pq.pop();

        if(d>dist[u])continue;
        for(auto[v,w]:graph[u]){
            if(dist[u]+w<dist[v]){
                dist[v]=dist[u]+w;
                pq.push({dist[v],v});
            }
        }
    }
}

int main(){
    int n,m;
    cin>>n>>m;
    vector<tuple<int,int,ll>>edges;

    vector<vector<pair<int,ll>>>graph(n+1);
    vector<vector<pair<int,ll>>>revGraph(n+1);

    for(int i=0;i<m;i++){
        int u,v;
        ll w;
        cin>>u>>v>>w;

        edges.push_back({u,v,w});
        graph[u].push_back({v,w});
        revGraph[v].push_back({u,w});
    }

    vector<ll>distFromStart;
    dijkstra(1,graph,distFromStart);

    vector<ll>distToEnd;
    dijkstra(n, revGraph, distToEnd);

    ll ans=INF;

    for(auto [u,v,w]:edges){
        if(distFromStart[u]<INF && distToEnd[v]<INF){
            ll candidate=distFromStart[u]+(w/2)+distToEnd[v];
            ans=min(ans,candidate);
        }
    }

    cout<<ans<<endl;

    return 0;
}

/*
Your task is to find a minimum-price flight route from Syrjälä to Metsälä. You have one discount coupon, using which you can halve the price of any single flight during the route. However, you can only use the coupon once.
When you use the discount coupon for a flight whose price is x, its price becomes \lfloor x/2 \rfloor (it is rounded down to an integer).
Input
The first input line has two integers n and m: the number of cities and flight connections. The cities are numbered 1,2,\ldots,n. City 1 is Syrjälä, and city n is Metsälä.
After this there are m lines describing the flights. Each line has three integers a, b, and c: a flight begins at city a, ends at city b, and its price is c. Each flight is unidirectional.
You can assume that it is always possible to get from Syrjälä to Metsälä.
Output
Print one integer: the price of the cheapest route from Syrjälä to Metsälä.
Constraints

2 \le n \le 10^5
1 \le m \le 2 \cdot 10^5
1 \le a,b \le n
1 \le c \le 10^9

Example
Input:
3 4
1 2 3
2 3 1
1 3 7
2 1 5

Output:
2
*/