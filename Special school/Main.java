#include<iostream>
#include <bits/stdc++.h> 
#include<string.h>
using namespace std;
int main()
{
  string s1,s2;
  cin>>s1>>s2;
  reverse(s2.begin(),s2.end());
  if(s1==s2)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}
