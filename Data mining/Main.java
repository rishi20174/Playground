#include<iostream>
using namespace std;
int main()
{
//Type your code here.
int n,a,f=0,s=0;
cin>>n;
while(n>0)
{
a=n%10;
if(a%2==0)
s=s+a;
else
f=f+a;
n=n/10;
}
if(s==f)
cout<<"Yes";
else
cout<<"No";
}