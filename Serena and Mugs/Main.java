#include<iostream>
using namespace std;
int main()
{
  int mug,cup,sum=0;
  cin>>mug>>cup;
  int vol[mug];
  for(int i=0;i<mug;i++)
    cin>>vol[i];
  for(int i=0;i<mug;i++)
    sum+=vol[i];
  if(sum>cup)
    cout<<"NO";
  else
    cout<<"YES";
}