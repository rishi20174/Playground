#include<stdio.h> 
int main() 
{ 
    int no; 
    
    scanf("%d", &no); 
    (no & 1 && printf("Odd"))|| printf("Even"); 
    return 0; 
} 