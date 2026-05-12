#include<bits/stdc++.h>
using namespace std;
int n,m;
vector<string>grid;
vector<vector<bool>>visited;
vector<vector<pair<int,int>>> parent;
vector<vector<char>> move_dir;

bool isValid(int x, int y){
    return x>=0 && x<n && y>=0 && y<m;
}

int dx[]={-1,1,0,0};
int dy[]={0,0,-1,1};
char dir[]={'U', 'D', 'L', 'R'};

void bfs(int startX,int startY,int endX, int endY){
    queue<pair<int, int>>q;
    q.push({startX, startY});
    visited[startX][startY]=true;

    while(!q.empty()){
        int x=q.front().first;
        int y=q.front().second;

        q.pop();

        if(x==endX && y==endY){
            return;
        }

        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];

            if(isValid(nx, ny) && !visited[nx][ny] && grid[nx][ny]!='#'){
                visited[nx][ny]=true;
                parent[nx][ny]={x,y};
                move_dir[nx][ny]=dir[i];
                q.push({nx, ny});
            }
        }
    }
}

string reconstructPath(int endX, int endY, int startX, int startY){
    string path;
    int x=endX, y=endY;
    while(x!=startX || y!= startY){
        path.push_back(move_dir[x][y]);
        auto prev=parent[x][y];
        x=prev.first;
        y=prev.second;
    }

    reverse(path.begin(),path.end());
    return path;
}
int main(){
    cin>>n>>m;
    grid.resize(n);

    int startX, startY, endX, endY;

    for(int i=0;i<n;i++){
        cin>>grid[i];
        for(int j=0;j<m;j++){
            if(grid[i][j]=='A'){
                startX=i;
                startY=j;
            }
            else if(grid[i][j]=='B'){
                endX=i;
                endY=j;
            }
        }

    }

    visited=vector<vector<bool>>(n, vector<bool>(m, false));
    parent=vector<vector<pair<int, int>>>(n, vector<pair<int,int>>(m, {-1,-1}));

    move_dir=vector<vector<char>>(n, vector<char>(m,' '));

    bfs(startX,startY,endX,endY);

    if(!visited[endX][endY]){
        cout<<"NO"<<endl;
    }
    else{
        string path=reconstructPath(endX,endY,startX,startY);
        cout<<"YES"<<endl;
        cout<<path.length()<<endl;
        cout<<path<<endl;
    }
}

/*
You are given a map of a labyrinth, and your task is to find a path from start to end. You can walk left, right, up and down.
Input
The first input line has two integers n and m: the height and width of the map.
Then there are n lines of m characters describing the labyrinth. Each character is . (floor), # (wall), A (start), or B (end). There is exactly one A and one B in the input.
Output
First print "YES", if there is a path, and "NO" otherwise.
If there is a path, print the length of the shortest such path and its description as a string consisting of characters L (left), R (right), U (up), and D (down). You can print any valid solution.
Constraints

1 \le n,m \le 1000

Example
Input:
5 8
########
#.A#...#
#.##.#B#
#......#
########

Output:
YES
9
LDDRRRRRU
*/