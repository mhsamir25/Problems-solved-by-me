#include<bits/stdc++.h>
using namespace std;

int main(){
    string s;
    cin>>s;

    string result="";
    int i=0;
    while(s.size()>0){
        if(s[i]=='.'){
            result.push_back('0');
            s.erase(i,1);
        }
        else if(s[i]=='-'&&s[i+1]=='.'){
            result.push_back('1');
            s.erase(i,2);
        }
        else if(s[i]=='-'&&s[i+1]=='-'){
            result.push_back('2');
            s.erase(i,2);
        }
    }

    cout<<result<<endl;
}