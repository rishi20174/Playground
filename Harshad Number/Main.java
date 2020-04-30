#include<iostream>
using namespace std;
int main()
{
//Type your code here.
int a,t,n,s=0;
cin>>a;
t=a;
while(a>0)
{
n=a%10;
s=s+n;
a=a/10;
}
if(t%s==0)
cout<<"Harshad Number";
else
cout<<"Not Harshad Number";
}
