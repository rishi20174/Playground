#include <iostream>
using namespace std;
int main() 
{
  int a,n;
  cin>>a;
  cin>>n;
  int i = a, u = 1, sum = 0;
  
  while (i <= n) 
  {
    while (u <= n) 
    {
      if (u < i) 
      {
        if (i % u == 0)
          sum = sum + u;
      }
      u++;
    }
    if (sum == i) {
      cout << i << " ";
    }
    i++;
    u = 1;
    sum = 0;
  }
}