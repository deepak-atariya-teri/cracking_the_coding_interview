#include<bits/stdc++.h>
using namespace std;

stack<int> insert(stack<int>s, int temp){
    if(s.size()==0 || s.top()<=temp){
        s.push(temp);
        return s;
    }

    int val = s.top();
    s.pop();
    s = insert(s,temp);
    s.push(val);
    return s;
}

stack<int> sort(stack<int>s){

    if(s.size()==1){
        return s;
    }

    int temp = s.top();
    s.pop();
    s = sort(s);
    return insert(s,temp);
}

int main(){
    stack<int> s,s1;
    int n,i,x;

    cin>>n;

    for(i=0;i<n;i++){
        cin>>x;
        s.push(x);
    }

    s1 = sort(s);
    while(!s1.empty()){
        cout<<s1.top()<<" ";
        s1.pop();
    }

    return 0;
}