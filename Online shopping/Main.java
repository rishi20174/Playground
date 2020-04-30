#include<iostream>
using namespace std;
int main()
{
   int fa,fd,fs,sa,sd,ss,aa,ad,as;
  int f,ft,fship,a,at,aship,s,st,sship;
  std::cin>>fa>>fd>>fs;
  std::cin>>sa>>sd>>ss;
  std::cin>>aa>>ad>>as;
  f=(fa*fd)/100;
  ft=fa-f;
  fship=ft+fs;
  std::cout<<"In Flipkart Rs."<<fship<<"\n";
  s=(sa*sd)/100;
  st=sa-s;
  sship=st+ss;
  std::cout<<"In Snapdeal Rs."<<sship<<"\n";
  a=(aa*ad)/100;
  at=aa-a;
  aship=at+as;
  std::cout<<"In Amazon Rs."<<aship<<"\n";
if((fship>sship)&&(sship<aship))
{
  std::cout<<"He will prefer Snapdeal";
}
 else if((fship<=sship)&&(sship<aship))
 {
   std::cout<<"He will prefer Flipkart";
 }
  else if((fship==sship)&&(sship>aship))
  {
    std::cout<<"He will prefer Amazon";
  }
}