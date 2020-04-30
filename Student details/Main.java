#include<iostream>
#include<string.h>
using namespace std;
struct student
{
  char name[30];
  char department[20];
  int yearofstudy;
  float cgpa;
}s[10];
int main()
{
  int n,i,j;
  std::cout<<"Enter the number of students"<<"\n";
  std::cin>>n;
  struct student s[n];
  for(i=0;i<n;i++)
  {
    std::cout<<"Enter the details of student "<<i+1<<"\n";
    std::cout<<"Enter name"<<"\n";
    std::cin>>s[i].name;
    std::cout<<"Enter department"<<"\n";
    std::cin>>s[i].department;
    std::cout<<"Enter year of study"<<"\n";
    std::cin>>s[i].yearofstudy;
    std::cout<<"Enter cgpa"<<"\n";
    std::cin>>s[i].cgpa;
  }
  for(i=0;i<n-1;i++)
  {
    for(j=0;j<n-i-1;j++)
    {
      if(s[j].name<s[j+1].name)
      {
        struct student temp=s[j];
        s[j]=s[j+1];
        s[j+1]=temp;}
    }
}
   std::cout<<"Details of students"<<"\n";
  for(i=0;i<n;i++)
  {
    std::cout<<"Student "<<i+1<<"\n";
    std::cout<<"Name:"<<s[i].name<<"\n";
    std::cout<<"Department:"<<s[i].department<<"\n";
    std::cout<<"Year of study:"<<s[i].yearofstudy<<"\n";
    std::cout<<"CGPA:"<<s[i].cgpa<<"\n";
}
}