#include<iostream>
using namespace std;
int main()
{
//Type your code here.
int d1,c1,d2,c2,e,f,g;
cin>>d1>>c1>>d2>>c2;
e=c1+c2;
f=(d1+d2)+(e/100);
g=e%100;
cout<<f<<"\n"<<g;
}