#include<bits/stdc++.h>
using namespace std;

int n,m;
vector<string>grid;
vector<vector<bool>>visited;

//up,down,left,right
int dx[]={-1,1,0,0};
int dy[]={0,0,-1,1};

void dfs(int x, int y){
    visited[x][y]=true;
    for(int i=0;i<4;i++){
        int nx=x+dx[i];
        int ny=y+dy[i];

        if(nx>=0 && nx<n && ny>=0 && ny<m){
            if(grid[nx][ny]=='.' && !visited[nx][ny]){
                dfs(nx, ny);
            }
        }
    }
}

int main(){
    cin>>n>>m;
    grid.resize(n);

    for(int i=0;i<n;i++){
        cin>>grid[i];
    }

    visited=vector<vector<bool>>(n, vector<bool>(m, false));

    int rooms=0;

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]=='.' && !visited[i][j]){
                dfs(i,j);
                rooms++;
            }
        }
    }

    cout<<rooms<<endl;
    return 0;
}

/*
You are given a map of a building, and your task is to count the number of its rooms. The size of the map is n \times m squares, and each square is either floor or wall. You can walk left, right, up, and down through the floor squares.
Input
The first input line has two integers n and m: the height and width of the map.
Then there are n lines of m characters describing the map. Each character is either . (floor) or # (wall).
Output
Print one integer: the number of rooms.
Constraints

1 \le n,m \le 1000

Example
Input:
5 8
########
#..#...#
####.#.#
#..#...#
########

Output:
3
*/

/*
#include<bits/stdc++.h>
using namespace std;

int n, m;
vector<string> grid;
vector<vector<bool>> visited;

// up, down, left, right
int dx[] = {-1, 1, 0, 0};
int dy[] = {0, 0, -1, 1};

void bfs(int startX, int startY) {
    queue<pair<int, int>> q;
    q.push({startX, startY});
    visited[startX][startY] = true;
    
    while (!q.empty()) {
        auto [x, y] = q.front();
        q.pop();
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (grid[nx][ny] == '.' && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.push({nx, ny});
                }
            }
        }
    }
}

int main() {
    cin >> n >> m;
    grid.resize(n);
    
    for (int i = 0; i < n; i++) {
        cin >> grid[i];
    }
    
    visited = vector<vector<bool>>(n, vector<bool>(m, false));
    
    int rooms = 0;
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (grid[i][j] == '.' && !visited[i][j]) {
                bfs(i, j);
                rooms++;
            }
        }
    }
    
    cout << rooms << endl;
    return 0;
}
*/