#include <bits/stdc++.h>
using namespace std;

int max(int a, int b){
    if(a>b){
        return a;
    }
    
    else{
        return b;
    }
}

int knapsack(int wt[], int val[], int W, int n){
    int t[n+1][W+1];
    int i,j;
    
    for(i=0;i<n+1;i++){
        for(j=0;j<W+1;j++){
            if(i==0 || j==0){
                t[i][j] = 0;
            }
            
            else if(wt[i-1]<=j){
                t[i][j] = max(val[i-1] + t[i][j-wt[i-1]], t[i-1][j]);
            }
            
            else{
                t[i][j] = t[i-1][j];
            }
        }
    }
    
    return t[n][W];
}



int main()
{
    int n;
    cin>>n;
    
    int wt[n],val[n],W,i,profit;
    
    for(i=0;i<n;i++){
        cin>>wt[i];
    }
    
    for(i=0;i<n;i++){
        cin>>val[i];
    }
    
    cin>>W;
    
    profit = knapsack(wt,val,W,n);
    
    cout<<"Maximum Profit : "<<profit;
    return 0;
}
