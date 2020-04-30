#include<iostream>
using namespace std;
int main()
{
  int r,l;
  std::cin>>r>>l;
  if((r%4==0)&&(l%4==0))
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
}