#include<iostream>
int main()
{
  int n,i,f=11,k;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    std::cout<<f*f<<" ";
    f=f+4;
  }
}
  