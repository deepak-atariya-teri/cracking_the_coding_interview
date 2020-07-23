#include <iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    
    int a[n][n],b[n][n],i,j,k,temp;
    
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            cin>>a[i][j];
        }
    }
    
    cout<<"\n\n";
    
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            b[i][j] = a[j][i];
        }
    }
    

    for(i=0;i<n;i++){
        for(j=n-1;j>=0;j--){
            a[i][k] = b[i][j];
            k++;
        }
        k=0;
    }
    
    
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            cout<<a[i][j]<<" ";
        }
        cout<<"\n";
    }
    return 0;
}
