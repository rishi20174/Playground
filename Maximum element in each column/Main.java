#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int arr[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>arr[i][j];
  for(int i=0;i<c;i++){
    int max=0;
    for(int j=0;j<r;j++){
      if(arr[j][i]>max)
        max=arr[j][i];}
    cout<<max<<"\n";}
}
