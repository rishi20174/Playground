#include<iostream>
using namespace std;
int main()
{
  int m,p,t,d;
  std::cin>>m>>p>>t;
  d=m*p;
  if(d>=t)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}