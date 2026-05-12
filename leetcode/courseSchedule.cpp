#include<bits/stdc++.h>
using namespace std;

bool canFinish(int numCourses, vector<vector<int>>& prerequisites) {
    vector<vector<int>> adj(numCourses);
    vector<int> indegree(numCourses, 0);
    
    // Build graph and indegree count
    for (auto& pre : prerequisites) {
        adj[pre[1]].push_back(pre[0]);
        indegree[pre[0]]++;
    }
    
    queue<int> q;
    // Start with courses having 0 prerequisites
    for (int i = 0; i < numCourses; i++) {
        if (indegree[i] == 0) {
            q.push(i);
        }
    }
    
    int coursesTaken = 0;
    
    while (!q.empty()) {
        int course = q.front();
        q.pop();
        coursesTaken++;
        
        for (int neighbor : adj[course]) {
            indegree[neighbor]--;
            if (indegree[neighbor] == 0) {
                q.push(neighbor);
            }
        }
    }
    
    return coursesTaken == numCourses;
}

int main() {
    int numCourses, numPrerequisites;
    
    // Read number of courses
    cout << "Enter number of courses: ";
    cin >> numCourses;
    
    // Read prerequisites
    cout << "Enter number of prerequisites: ";
    cin >> numPrerequisites;
    
    vector<vector<int>> prerequisites(numPrerequisites, vector<int>(2));
    
    cout << "Enter prerequisites (ai bi) where bi must be taken before ai:\n";
    for (int i = 0; i < numPrerequisites; i++) {
        cin >> prerequisites[i][0] >> prerequisites[i][1];
    }
    
    // Check if all courses can be finished
    if (canFinish(numCourses, prerequisites)) {
        cout << "true" << endl;
        cout << "Explanation: It is possible to finish all " << numCourses << " courses." << endl;
    } else {
        cout << "false" << endl;
        cout << "Explanation: There is a cycle in prerequisites, so it's impossible." << endl;
    }
    
    return 0;
}

/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.

 

Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0. So it is possible.
Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 

Constraints:

1 <= numCourses <= 2000
0 <= prerequisites.length <= 5000
prerequisites[i].length == 2
0 <= ai, bi < numCourses
All the pairs prerequisites[i] are unique.
*/