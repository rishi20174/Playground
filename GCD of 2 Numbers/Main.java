#include<iostream>
int gcd_of_a_num(int,int);
  int main()
{
  int n1,n2;
  std::cin>>n1>>n2;
  int g=gcd_of_a_num(n1,n2);
  std::cout<<"G.C.D of "<<n1<<" and "<<n2<< " = "<<g;
}
int gcd_of_a_num(int x,int y)
{
  int i,gcd;
  for(i=1;i <= x&& i <= y; ++i)
    {
        if(x%i==0 && y%i==0)
            gcd = i;
  }
   return gcd;
}