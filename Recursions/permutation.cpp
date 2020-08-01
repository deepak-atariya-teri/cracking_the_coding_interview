#include<bits/stdc++.h>
using namespace std;

void permutation(string n,int l, int r){
    if(l==r){
        cout<<n<<"\n";
    }

    else{
        for(int i=l;i<=r;i++){
            swap(n[l],n[i]);
            permutation(n,l+1,r);
            swap(n[l],n[i]);
        }
    }
}

int main(){

    string n;
    cin>>n;

    permutation(n,0,n.length()-1);
    
    return 0;
}