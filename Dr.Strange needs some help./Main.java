#include<iostream>
#include<math.h>
using namespace std;
int mult(int , int);
int main(){
  int a,b,c,ans;
  cin>>a>>b>>c;
  ans=mult(a,b);
  if(ans>=c)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";}
  int mult(int a,int b){
    int n = pow(a,b);
    return n;}