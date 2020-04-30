#include<iostream>
#include<math.h>
int power(int m)
{
  int c=0;
  while(m>0){
    c+=1;
    m/=10;}
  return c;}
int arm(int n)
{
  int b=power(n);
  int l,p,s=0;
  l=n;
  while(n>0){
    p=n%10;
    s=s+pow(p,b);
    n/=10;}
  if(s==l)
    return 1;
  else
    return 0;  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}