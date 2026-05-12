#include<bits/stdc++.h>
using namespace std;

int n,m;
vector<vector<char>> grid;
vector<vector<bool>> visited;

// up, down, left, right
int dx[] = {-1, 1, 0, 0};
int dy[] = {0, 0, -1, 1};

void dfs(int x, int y) {
    visited[x][y] = true;
    for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        
        if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
            if (grid[nx][ny] == '1' && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }
    }
}

int main() {
    cin >> n >> m;
    grid.resize(n, vector<char>(m));
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> grid[i][j];
        }
    }
    
    visited = vector<vector<bool>>(n, vector<bool>(m, false));
    
    int islands = 0;
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (grid[i][j] == '1' && !visited[i][j]) {
                dfs(i, j);
                islands++;
            }
        }
    }
    
    cout << islands << endl;
    return 0;
}