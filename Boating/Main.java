#include<iostream>
using namespace std;
int main()
{
   int w,a,c,ta,tc,total;
  std::cin>>w>>a>>c;
  ta=(a*75);
  tc=(c*30);
  total=ta+tc;
  if(total<=w)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}