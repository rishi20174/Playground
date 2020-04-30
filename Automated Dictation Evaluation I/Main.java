#include<iostream>
#include<string.h>

int main()
{
    char a[100], b[100];    
    std::cin>>a>>b;
    if( strcmp(a,b) == 0 )
        std::cout<<"It is correct";
   else
     std::cout<<"It is wrong";
}