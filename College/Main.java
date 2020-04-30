#include<iostream>
#include<string.h>
using namespace std; 
struct College
{
  char name[100];
  char city[100];
  int establishmentyear;
  float passpercentage;
 }s1[20],temp;
int main()
{
  int n,i,j;
  std::cout<<"Enter the number of colleges"<<"\n";
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    std::cin>>s1[i].name;
    std::cin>>s1[i].city;
    std::cin>>s1[i].establishmentyear;
    std::cin>>s1[i].passpercentage;
  }
   for (i = 1; i < n; i++)
      for (j = 0; j < n - i; j++) {
         if (strcmp(s1[j].name, s1[j + 1].name) > 0) {
            temp = s1[j];
            s1[j] = s1[j + 1];
            s1[j + 1] = temp;
         }
      }
 
   for (i = 0; i < n; i++) 
   {
     std::cout<<"Enter the details of college "<<i+1<<"\n";
   std::cout<<"Enter name"<<"\n";
  std::cout<<"Enter city"<<"\n";
  std::cout<<"Enter year of establishment"<<"\n";
   std::cout<<"Enter pass percentage"<<"\n";
   }
  std::cout<<"Details of colleges"<<"\n";
  for(i=0;i<n;i++)
  {
    std::cout<<"College:"<<i+1<<"\n";
    std::cout<<"Name:"<<s1[i].name<<"\n";
     std::cout<<"City:"<<s1[i].city<<"\n";
     std::cout<<"Year of establishment:"<<s1[i].establishmentyear<<"\n";
     std::cout<<"Pass percentage:"<<s1[i].passpercentage<<"\n";
}
}