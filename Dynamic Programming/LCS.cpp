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

int LCS(string X, string Y, int m, int n){

    int i,j;
    int t[m+1][n+1];
    
    for(i=0;i<m+1;i++){
        for(j=0;j<n+1;j++){
            if(i==0 || j==0){
                t[i][j] = 0;
            }
            
            else if(X[i-1] == Y[j-1]){
                t[i][j] = t[i-1][j-1] + 1;
            }
            
            else{
                t[i][j] = max(t[i-1][j], t[i][j-1]);
            }
        }
    }
    
    return t[m][n];
}



int main()
{
    string x,y;
    int l,m,n;
    cin>>x;
    cin>>y;
    
    m = x.length();
    n = y.length();
    
    l = LCS(x,y,m,n);
    
    cout<<"LCS : "<<l;
    return 0;
}
