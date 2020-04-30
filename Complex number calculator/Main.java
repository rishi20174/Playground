#include<iostream>
#include<math.h>
struct complex
{
float rel;
float img;
}s1,s2;

int main()
{
float a,b,choice;
std::cin>>choice;
std::cin>>s1.rel>>s1.img;
std::cin>>s2.rel>>s2.img;
if(choice==1)
{
if((s1.rel+s1.img)<0)
  std::cout<<s1.rel+s2.rel<<s1.img+s2.img<<"i";
  else
    std::cout<<s1.rel+s2.rel<<"+"<<s1.img+s2.img<<"i";
}
if(choice==2)
{
if((s2.rel-s2.img)<0)
  std::cout<<s1.rel-s2.rel<<s1.img-s2.img<<"i";
  else
    std::cout<<s1.rel-s2.rel<<"+"<<s1.img-s2.img<<"i";;
}
if(choice==3)
{
if(((s1.rel*s2.rel)+(s1.img*s2.img))<0)
  std::cout<<(s1.rel*s2.rel)-(s1.img*s2.img)<<(s1.rel*s2.img)+(s1.img*s2.img)<<"i";
  else
    std::cout<<(s1.rel*s2.rel)-(s1.img*s2.img)<<(s1.rel*s2.img)+(s1.img*s2.img)<<"i";
}
if(choice>3||choice<0)
std::cout<<"Invalid choice";
return 0;

}