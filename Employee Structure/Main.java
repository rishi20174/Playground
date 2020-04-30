#include<iostream>
using namespace std;
struct employee
{
  char name[25];
  int id;
  int age;
  char designation[50];
  int salary;
};
int main()
{
  employee e;
    std::cin>>e.name;
    std::cin>>e.id;
    std::cin>>e.age;
    std::cin>>e.designation;
    std::cin>>e.salary;
    std::cout<<"Enter name:"<<"\n";
    std::cout<<"Enter ID:"<<"\n";
    std::cout<<"Enter age:"<<"\n";
    std::cout<<"Enter designation:"<<"\n";
    std::cout<<"Enter Salary:"<<"\n";
    std::cout<<"Employee Details"<<"\n";
  std::cout<<"Name of the Employee : "<<e.name<<"\n";
  std::cout<<"ID of the Employee : "<<e.id<<"\n";
  std::cout<<"Age of the Employee : "<<e.age<<"\n";
  std::cout<<"Designation of the Employee : "<<e.designation<<"\n";
  std::cout<<"Salary of the Employee : "<<e.salary;
  }


  