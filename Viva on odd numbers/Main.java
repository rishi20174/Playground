#include<iostream>
using namespace std;
int main()
{
//Type your code here.
int a,i,c=0;
float f=0;
for(i=0;c<=2;i++)
{
cin>>a;
if(a%2==1)
{
f=f+1;
c=c+1;
}
if(a<0){
f=f-1;
break;}
if(a%2==0)
{
f=f-0.5;
}
}
cout<<f;
}