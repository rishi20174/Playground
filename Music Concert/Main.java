#include<iostream>
int main()
{
  int total,ec=0,oc=0;
  std::cin>>total;
  int a[total];
  for(int i=0;i<total;i++)
    std::cin>>a[i];
  for(int i=0;i<total;i++)
  {
    if(a[i]%2==0)
    {
      ec++;
    }
    else
    {
      oc++;
    }
  }
  std::cout<<oc<<"\n";
  std::cout<<ec;
    return 0;
}