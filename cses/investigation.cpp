#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll INF = 1e18;
const int MOD = 1e9 + 7;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n, m;
    cin >> n >> m;
    
    vector<vector<pair<int, ll>>> graph(n + 1);
    
    for (int i = 0; i < m; i++) {
        int a, b;
        ll c;
        cin >> a >> b >> c;
        graph[a].push_back({b, c});
    }
    
    vector<ll> dist(n + 1, INF);
    vector<int> count(n + 1, 0);
    vector<int> min_edges(n + 1, INT_MAX);
    vector<int> max_edges(n + 1, 0);
    
    priority_queue<pair<ll, int>, vector<pair<ll, int>>, greater<pair<ll, int>>> pq;
    
    dist[1] = 0;
    count[1] = 1;
    min_edges[1] = 0;
    max_edges[1] = 0;
    pq.push({0, 1});
    
    while (!pq.empty()) {
        auto [d, u] = pq.top();
        pq.pop();
        
        if (d > dist[u]) continue;
        
        for (auto [v, w] : graph[u]) {
            ll new_dist = dist[u] + w;

            if (new_dist < dist[v]) {
                dist[v] = new_dist;
                count[v] = count[u];
                min_edges[v] = min_edges[u] + 1;
                max_edges[v] = max_edges[u] + 1;
                pq.push({new_dist, v});
            }
            else if (new_dist == dist[v]) {
                count[v] = (count[v] + count[u]) % MOD;
                min_edges[v] = min(min_edges[v], min_edges[u] + 1);
                max_edges[v] = max(max_edges[v], max_edges[u] + 1);
            }
        }
    }
    
    cout << dist[n] << " " 
         << count[n] << " " 
         << min_edges[n] << " " 
         << max_edges[n] << endl;
    
    return 0;
}

/*
You are going to travel from Syrjälä to Lehmälä by plane. You would like to find answers to the following questions:

what is the minimum price of such a route?
how many minimum-price routes are there? (modulo 10^9+7)
what is the minimum number of flights in a minimum-price route?
what is the maximum number of flights in a minimum-price route?

Input
The first input line contains two integers n and m: the number of cities and the number of flights. The cities are numbered 1,2,\ldots,n. City 1 is Syrjälä, and city n is Lehmälä.
After this, there are m lines describing the flights. Each line has three integers a, b, and c: there is a flight from city a to city b with price c. All flights are one-way flights.
You may assume that there is a route from Syrjälä to Lehmälä.
Output
Print four integers according to the problem statement.
Constraints

1 \le n \le 10^5
1 \le m \le 2 \cdot 10^5
1 \le a,b \le n
1 \le c \le 10^9

Example
Input:
4 5
1 4 5
1 2 4
2 4 5
1 3 2
3 4 3

Output:
5 2 1 2
*/