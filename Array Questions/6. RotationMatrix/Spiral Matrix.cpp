#include <iostream>
using namespace std;


int main()
{
    // Spiral Matrix .....
    
    int n;
    cin>>n;
    
    int a[n][n],i,j,top,down,left,right,dir=0,x=1;
    
    top = 0;
    down = n-1;
    left = 0;
    right = n-1;
    
    
    while(top<=down && left<=right){
        if(dir == 0){
            for(i=left;i<=right;i++){
                a[top][i]= x;
                x++;
            }
            top = top+1;
        }
        
        else if(dir == 1){
            for(i=top;i<=down;i++){
                a[i][right] = x;
                x++;
            }
            right = right-1;
        }
        
        else if(dir == 2){
            for(i=right;i>=left;i--){
                a[down][i] = x;
                x++;
            }
            down = down-1;
        }
        
        else{
            for(i=down;i>=top;i--){
                a[i][left] = x;
                x++;
            }
            left = left+1;
        }
        
        dir = (dir+1)%4;
    }

    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            cout<<a[i][j]<<" ";
        }
        cout<<"\n";
    }
    return 0;
}
