#include<iostream>
using namespace std;
int main()
{
  int tball,trun,crun,cball,tovers;
  float cover,crr,trr,co,c;
  cin>>tball>>trun>>crun>>cball;
  tovers=tball/6;
  co=cball/6;
  c=(cball%6)*0.1;
  cover=co+c;
  crr=crun/cover;
  trr=trun/50.0;
  cout<<tovers<<"\n"<<cover;
  printf("\n%.1f",crr);
  printf("\n%.1f",trr);
  if(crr>trr)
    cout<<"\nEligible to Win";
  else
    cout<<"\nNot Eligible to Win";  
}