#include<iostream>
using namespace std;
int main()
{
  int r,c,row=0,rc=0,col=0,cc=0;
  cin>>r>>c;
  int arr[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>arr[i][j];
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++){
    int sum=0;
    for(int j=0;j<c;j++){
      sum+=arr[i][j];}
    if(sum>row){
      row=sum;
      rc=i+1;}
    cout<<sum<<" ";}
  cout<<endl;
  cout<<"Row "<<rc<<" has maximum sum\n";
  cout<<"Sum of columns is ";
  for(int i=0;i<c;i++){
    int sum=0;
    for(int j=0;j<r;j++){
      sum+=arr[j][i];}
    if(sum>col){
      col=sum;
      cc=i+1;}
    cout<<sum<<" ";}
  cout<<endl;
  cout<<"Column "<<cc<<" has maximum sum\n";
}
