#include<bits/stdc++.h>
using namespace std;

void toh(int n, char from_this, char to_this, char aux){
    if(n==1){
        cout<<"Move Disc 1 from "<<from_this<<" to "<<to_this<<"\n";
        return;
    }

    toh(n-1,from_this,aux,to_this);
    cout<<"Move Disc "<<n<<" from "<<from_this<<" to "<<to_this<<"\n";
    toh(n-1,aux,to_this,from_this);
}


int main(){
    int n;
    cin>>n;

    toh(n,'A','C','B');

    return 0;
}