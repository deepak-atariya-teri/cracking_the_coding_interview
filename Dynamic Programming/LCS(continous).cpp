#include <bits/stdc++.h>
using namespace std;

int LCS(string X,string Y, int m, int n){
    int t[m+1][n+1],i,j;
    
    for(i=0;i<m+1;i++){
        for(j=0;j<n+1;j++){
            
            if(i==0 || j==0){
                t[i][j] = 0;
            }
            
            else if(X[i-1] == Y[j-1]){
                t[i][j] = 1 + t[i-1][j-1];
            }
            
            else{
                t[i][j] = 0;
            }
        }
    }
    
    return t[m][n];
}



int main()
{
    string X,Y;
    int l,m,n;
    cin>>X;
    cin>>Y;
    
    m = X.length();
    n = Y.length();
    
    l = LCS(X,Y,m,n);
    cout<<"Longest Common Subsequence "<<l; 
    return 0;
}
