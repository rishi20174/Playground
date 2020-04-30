#include<iostream>
using namespace std;
int main()
{
  int n,loc,val;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int arr[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>loc;
  if(loc>n){
    cout<<"\nInvalid Input";
    return 0;}
  cout<<"\nEnter the value to insert";
  cin>>val;
  cout<<"\nArray after insertion is"<<endl;
  for(int i=0;i<n;i++){
    if(loc-1==i)
      cout<<val<<endl<<arr[i]<<endl;
    else
      cout<<arr[i]<<endl;}}
