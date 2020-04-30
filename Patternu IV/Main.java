#include <iostream>
using namespace std;
int main() 
{
  int a,i,j,u;
  cin>>a;
  for(i=1;i<=a;i++)
  {
    if(i%2!=0)
    {
      for(j=0;j<a;j++)
      {
        if(j==(a-1))
          cout<<i+1;
        else
          cout<<i;
      }
      cout<<"\n";
    }
    else
    {
      for(u=0;u<a;u++)
      {
        if(u==0)
          cout<<i+1;
        else
          cout<<i;
      }
      cout<<"\n";
    }
  }
}
    