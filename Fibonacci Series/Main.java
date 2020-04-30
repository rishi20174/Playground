#include<iostream> 
using namespace std; 
int fib(int x,int y,int z,int n) 
{ 
  static int j=1; 
  z=x+y; 
  x=y; 
  y=z; 
  if(j<n) 
  { 
     j=j+1; 
     fib(x,y,z,n); 
  } 
  else 
      return z; 
} 
   
int main() 
{ 
  int n,i,f; 
  cin>>n; 
  int a=-1,c=0; 
  int b=1; 
  f=fib(a,b,c,n); 
  cout<<"The term "<<n<<" in the fibonacci series is "<<f; 
   
} 