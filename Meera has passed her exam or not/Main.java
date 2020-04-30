#include<iostream>
int main()
{
  int n,i,r,a[100];
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    std::cin>>r;
  }
  for(i=0;i<n;i++)
  {
    if(a[i]==r)
    {
      std::cout<<"She passed her exam";
      return 0;
    }
}
 std::cout<<"She failed";
}