#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[10][10],b[10][10],sum[10][10];
  std::cin>>r>>c;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
  {
    std::cin>>a[i][j];
  }
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
  {
    std::cin>>b[i][j];
    }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      sum[i][j]=a[i][j]+b[i][j];
      std::cout<<sum[i][j]<<" ";
    }
    std::cout<< "\n";
  }
}
      
  