#include<iostream>
int main()
{
  int n,i,a[1000];
  std::cin>>n;
  for(i=0;i<=n;i++)
  {
    std::cin>>a[i];
  }
  int max=a[0];
  for(i=0;i<n;i++)
  {
    if(a[i]>max)
      max=a[i];
  }
  std::cout<<max;
}