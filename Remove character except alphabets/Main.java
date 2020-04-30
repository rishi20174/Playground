#include<iostream>
int main()
{
    int i,j;
    char str[100],str1[100];
    std::cin>>str;
    for(i=0;str[i]!='\0';i++)
    {
        if((str[i]>='A'&&str[i]<='Z')||(str[i]>='a'&&str[i]<='z'))
        {
            str1[j]=str[i];
            j++;
        }
    str1[j]='\0';
    }
    printf("%s",str1);
}