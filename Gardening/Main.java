#include<iostream>
using namespace std;
int main()
{
  int r,c,n,s;
  std::cin>>r>>c>>n;
  s=r*c;
  if(n>=r+1&&n<=r+r||n>=s-(r+r)+1&&n<=s-r)
  {
    cout<<"It is a mango tree";
  }
  else
    cout<<"It is not a mango tree";
}