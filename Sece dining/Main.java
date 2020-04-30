#include<iostream>
using namespace std;
int main()
{
  string door;
  int n;
  std::cin>>door>>n;
  if(door=="front")
  {
     if(n==1)
     std::cout<<"Left Handed";
    else
      std::cout<<"Right Handed";
  }
  else
  {
    if(n==1)
     std::cout<<"Right Handed";
    else
      std::cout<<"Left Handed";
  }
}
    
          
  
