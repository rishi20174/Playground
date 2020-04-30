#include<iostream>
using namespace std; 
int dig(int x) 
{ 
   
  int r,s=0; 
  while(x>0) 
  { 
    r=x%10; 
    s=s+r; 
    x=x/10; 
  } 
  if(s<10){ 
    return s; 
  } 
  else{ 
    dig(s); 
  } 
} 
   
   
int main() 
{ 
  int a,s; 
  cin>>a; 
  s=dig(a); 
  cout<<s; 
} 