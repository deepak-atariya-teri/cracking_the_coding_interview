#include <iostream>
#include <cstring>
using namespace std;

// 0-1 Knapsack Problem (Using Recursion) ............

int max(int a, int b){
    if(a>b){
        return a;
    }
    
    else{
        return b;
    }
}


int knapsack(int wt[], int val[], int W, int n){
    if(n==0 || W==0){
        return 0;
    }
    
    else if(wt[n-1]<=W){
        return max((val[n-1]+ knapsack(wt,val,W-wt[n-1],n-1)),(knapsack(wt,val,W,n-1)));
    }
    
    else if(wt[n-1]>W){
        return knapsack(wt,val,W,n-1);
    }
}


int main(){
    int n;
    cin>>n;
    
    int wt[n], val[n], W, i, profit;
    
    for(i=0;i<n;i++){
        cin>>wt[i];
    }
    
    for(i=0;i<n;i++){
        cin>>val[i];
    }
    
    cin>>W;
    
    profit = knapsack(wt,val,W,n);
    
    cout<<"Profit : "<<profit;
    return 0;
}
