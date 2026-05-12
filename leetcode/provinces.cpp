#include<bits/stdc++.h>
using namespace std;

void dfs(int city, vector<vector<int>>& isConnected, vector<bool>& visited, int n) {
    visited[city] = true;
    
    // Check all other cities
    for (int other = 0; other < n; other++) {
        // If connected and not visited, explore
        if (isConnected[city][other] == 1 && !visited[other]) {
            dfs(other, isConnected, visited, n);
        }
    }
}

int findCircleNum(vector<vector<int>>& isConnected) {
    int n = isConnected.size();
    vector<bool> visited(n, false);
    int provinces = 0;
    
    for (int i = 0; i < n; i++) {
        if (!visited[i]) {
            // Found a new province
            dfs(i, isConnected, visited, n);
            provinces++;
        }
    }
    
    return provinces;
}

int main() {
    int n;
    cin >> n;
    
    vector<vector<int>> isConnected(n, vector<int>(n));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> isConnected[i][j];
        }
    }
    
    int result = findCircleNum(isConnected);
    cout << result << endl;
    
    return 0;
}

/*
There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.

 

Example 1:


Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2
Example 2:


Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
 

Constraints:

1 <= n <= 200
n == isConnected.length
n == isConnected[i].length
isConnected[i][j] is 1 or 0.
isConnected[i][i] == 1
isConnected[i][j] == isConnected[j][i]

*/