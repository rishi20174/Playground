#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[10][10];
  int row=0,column=0,diagonal=0;
  std::cin>>r>>c;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  for(i=0;i<=0;i++)
  {
    for(j=0;j<c-1;j++)
    {
      row=row+a[i][j];
    }
  }
  for(j=c-1;j==c-1;j--)
  {
    for(i=0;i<r;i++)
    {
      column=column+a[j][i];
    }
  }
 for(i=0;i<r;i++)
 {
   for(j=0;j<c;j++)
   {
     if((i+j)==(r-1))
        {
          diagonal+=a[i][j];
        }
        if(j==0&&i==r-1)
        {
          column=column-a[i][j];
        }
        }
}
  std::cout<<"Sum of Zig-Zag pattern is "<<diagonal+row+column;
}