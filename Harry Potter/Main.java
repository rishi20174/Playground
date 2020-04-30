#include<iostream>
using namespace std;
int main()
{
  int n,x,y;
  std::cin>>n;
  x=(n/10)>10;
  y=n%10;
  std::cout<<x+y;
 }