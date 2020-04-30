#include<iostream>
using namespace std;
int main()
{
  int r,c,max=0;
  cin>>r>>c;
  int arr[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>arr[i][j];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++){
      if(max<arr[i][j])
        max=arr[i][j];}
  cout<<"The maximum element is "<<max;
}