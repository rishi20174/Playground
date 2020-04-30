#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  student s1,s2;
  std::cout<<"\n";
 std::cout<<"Student Details"<<"\n";
  std::cin>>s1.name>>s2.name;
  std::cout<<"Name: "<<s1.name<<" "<<s2.name<<"\n";
  std::cin>>s1.roll;
  std::cout<<"Roll: "<<s1.roll<<"\n";
  std::cin>>s1.marks;
  std::cout<<"Marks: "<<s1.marks;
}