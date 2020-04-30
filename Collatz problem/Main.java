#include<iostream>
using namespace std;
int main()
{
//Type your code here.
int a,i;
cin>>a;
cout<<a<<"\n";
for(i=0;a!=1;i++)
{
if(a%2==0)
a=a/2;
else
a=3*a+1;
cout<<a<<"\n";
}
cout<<i;
}