#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r>>c>>n;
  if((n>=1)&&(n<=r)||n%c==0||n%r==1)
    cout<<"Yes";
  else
    cout<<"No";
}