#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  for(int i=0;i<r;i++){
    int max=0;
    for(int j=0;j<c;j++){
      int n;
      cin>>n;
      max+=n;}
    cout<<max<<endl;}
}