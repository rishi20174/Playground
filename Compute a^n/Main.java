#include<iostream>
#include<math.h>
using namespace std;
int power(int,int);
int main()
{
  int a,n;
  std::cin>>a>>n;
  std::cout<<"Enter the value of a "<<"\n";
  std::cout<<"Enter the value of n"<<"\n";
  int p=power(a,n);
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<p;
}
int power(int x,int y)
{
  int c;
  c=pow(x,y);
  return c;
}