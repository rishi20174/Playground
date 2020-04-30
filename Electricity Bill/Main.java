#include<iostream>
using namespace std;
int main()
{
  int u;
  std::cin>>u;
  if(u<=200)
  {
    u=u*0.5;
    std::cout<<"Rs."<<u;
  }
  else if(u<=400)
  {
    u=(u*0.65)+100;
    std::cout<<"Rs."<<u;
  }
  else if(u<=600)
  {
    u=(u*0.80)+200;
    std::cout<<"Rs."<<u;
  }
  else
  {
    u=u*1.25+425;
    std::cout<<"Rs."<<u;
   }
}
      
    
