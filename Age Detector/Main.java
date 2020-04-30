#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b;
  if(b>a)
  {
    c=b-a;
    std::cout<<c;
  }
  else 
  {
    b=b+100;
    c=b-a;
    std::cout<<c;
  }
}
    