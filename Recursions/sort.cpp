#include<bits/stdc++.h>
using namespace std;

vector<int> insert(vector<int>a, int temp){
    if(a.size()==0 || a[a.size()-1]<=temp){
        a.push_back(temp);
        return a;
    }

    int val = a[a.size()-1];
    a.pop_back();
    a = insert(a,temp);
    a.push_back(val);
    return a;
}

vector<int> sort(vector<int>a){

    if(a.size()==1){
        return a;
    }

    int temp = a[a.size()-1];
    a.pop_back();
    a = sort(a);
    return insert(a,temp);
}

int main(){
    int n,i,x;
    vector<int>a,b;
    cin>>n;

    for(i=0;i<n;i++){
        cin>>x;
        a.push_back(x);
    }

    b = sort(a);

    for(i=0;i<n;i++){
        cout<<b[i]<<" ";
    }
    return 0;
}