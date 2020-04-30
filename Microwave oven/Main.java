#include<iostream>
using namespace std;
int main()
{
  int n;
  float s,heat,time;
  cin>>n>>s;
  if(n<=2)
  {
    heat=(s*50)/100;
    time=(s+heat);
    cout<<time;
  }
  else if (n==3)
  {
    heat=s*2;
    cout<<heat;
  }
  else
  {
    cout<<"Number of items is more";
  }
}
    