#include <iostream>
using namespace std;
int main(){
  int n,num=1,l=1,k;
  cin>>n;
  k=num;
  for(int i=1;i<=n;i++){
    k=num-1;   
    for(int j=1;j<=num;j++){
      if(j%2==0)
        cout<<"*";
      else{
        if(i%2==0){            
          cout<<k+l-num+i;
          l++;
          k=k-2;}
        else
          cout<<l++;}}
      num=num+2;
      cout<<"\n";}}