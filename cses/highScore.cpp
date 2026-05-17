#include<bits/stdc++.h>
using namespace std;

const long long INF=1e18;
typedef long long ll;
class BellmanFord{
    private:
        int n,m;
        vector<tuple<int,int, ll>>edges;

        vector<ll>dist;
        vector<vector<int>>graph;
        vector<vector<int>>revGraph;

        vector<bool>from1;
        vector<bool>toN;

    public:
        BellmanFord(int vertices, int edges_count){
            n=vertices;
            m=edges_count;

            dist.assign(n+1,INF);
            graph.resize(n+1);
            revGraph.resize(n+1);

            from1.assign(n+1, false);
            toN.assign(n+1, false);
        }

        void addEdge(int u, int v, ll w){
            edges.push_back({u,v,-w});
            graph[u].push_back(v);
            revGraph[v].push_back(u);
        }

        void dfs1(int node){
            from1[node]=true;
            
            for(int next:graph[node]){
                if(!from1[next]){
                    dfs1(next);
                }
            }
        }

        void dfs2(int node){
            toN[node]=true;

            for(int prev:revGraph[node]){
                if(!toN[prev]){
                    dfs2(prev);
                }
            }
        }

        bool run(int source, int destination){
            dfs1(source);
            dfs2(destination);

            dist[source]=0;

            for(int i=1;i<=n-1;i++){
                bool updated=false;

                for(auto &edge:edges){
                    int u,v;
                    ll w;
                    tie(u,v,w)=edge;

                    if(dist[u]<INF && dist[u]+w<dist[v]){
                        dist[v]=dist[u]+w;
                        updated=true;
                    }
                }
                if(!updated) break;
            }

            for(auto &edge:edges){
                int u,v;
                ll w;
                tie(u,v,w)=edge;
                if(dist[u]<INF && dist[u]+w<dist[v]){
                    if(from1[v] && toN[v]){
                        return false;
                    }
                }
            }
            return true;
        }

        ll getAnswer(int destination){
            return -dist[destination];
        }
};

int main(){
    int n,m;
    cin>>n>>m;

    BellmanFord bf(n,m);

    for(int i=0;i<m;i++){
        int u,v;
        ll w;
        cin>>u>>v>>w;
        bf.addEdge(u,v,w);
    }

    bool possible = bf.run(1,n);
    if(!possible){
        cout<<-1<<endl;
    }
    else{
        cout<<bf.getAnswer(n)<<endl;
    }

    return 0;
}

/*
You play a game consisting of n rooms and m tunnels. Your initial score is 0, and each tunnel increases your score by x where x may be both positive or negative. You may go through a tunnel several times.
Your task is to walk from room 1 to room n. What is the maximum score you can get?
Input
The first input line has two integers n and m: the number of rooms and tunnels. The rooms are numbered 1,2,\dots,n.
Then, there are m lines describing the tunnels. Each line has three integers a, b and x: the tunnel starts at room a, ends at room b, and it increases your score by x. All tunnels are one-way tunnels.
You can assume that it is possible to get from room 1 to room n.
Output
Print one integer: the maximum score you can get. However, if you can get an arbitrarily large score, print -1.
Constraints

1 \le n \le 2500
1 \le m \le 5000
1 \le a,b \le n
-10^9 \le x \le 10^9

Example
Input:
4 5
1 2 3
2 4 -1
1 3 -2
3 4 7
1 4 4

Output:
5
*/