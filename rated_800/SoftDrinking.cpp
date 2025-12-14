#include<bits/stdc++.h>
#include<algorithm>
using namespace std;
 
int main(){
    int n, k, l, c, d, p, nl, np;
    
    if (!(cin >> n >> k >> l >> c >> d >> p >> nl >> np))
        return 0;
 
    int a = (k * l) / nl;
    int b = c * d;
    int e = p / np;
 
    int m = min(a, min(b, e)); 
 
    int ans = m / n;
 
    cout << ans << endl;
 
    return 0;
}