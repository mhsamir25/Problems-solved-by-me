#include<bits/stdc++.h>
using namespace std;
 
int main(){
    int n;
    cin>>n;
    
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
 
    long long sereja=0, dima=0;
 
    int left = 0;
    int right = n-1;
    int turn =1;
    while(left<=right){
        int pick;
 
        if(arr[left]>arr[right]){
            pick = arr[left];
            left++;
        }
        else{
            pick = arr[right];
            right--;
        }
 
        if(turn%2!=0){
            sereja+=pick;
        }
 
        else{
            dima+=pick;
        }
 
        turn++;
    }
    
    cout<<sereja<<" "<<dima;
}