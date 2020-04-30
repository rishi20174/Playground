#include<iostream>
using namespace std;
int main()
{
//Type your code here.
int c,s=0,u,a,l,p;
cin>>a;
l=a;
c=a*a;
if(c<100)
p=10;
else
p=100;
while(c>0)
{
u=c%p;
s=s+u;
c=c/p;
}
if(a==s)
cout<<"Kaprekar Number";
else
cout<<"Not a Kaprekar Number";
}