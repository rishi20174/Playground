#include<iostream>
using namespace std;
int main()
{
  char s[200];
  cin.get(s,200);
  int v=0,c=0,d=0,sy=0,w=0,i;
  for(i=0;s[i]!='\0';i++){
    if(s[i]=='A' ||s[i]=='a' ||s[i]=='e' ||s[i]=='E' ||s[i]=='I' ||s[i]=='i' ||s[i]=='O' ||s[i]=='o' ||s[i]=='U' ||s[i]=='u')
      v++;
    if(!(s[i]=='A' ||s[i]=='a' ||s[i]=='e' ||s[i]=='E' ||s[i]=='I' ||s[i]=='i' ||s[i]=='O' ||s[i]=='o' ||s[i]=='U' ||s[i]=='u')&&(s[i]>=65&&s[i]<=90||s[i]>=97&&s[i]<=122))
      c++;
    if(s[i]==32)
      w++;
    if(s[i]>=48&&s[i]<=57)
      d++;
    if(!((s[i]>=65&&s[i]<=90)||(s[i]>=97&&s[i]<=122)||(s[i]>=48&&s[i]<=57)||s[i]==32))
      sy++;}
  cout<<"Vowels:"<<v<<endl;
  cout<<"Consonants:"<<c<<endl;
  cout<<"White Spaces:"<<w<<endl;
  cout<<"Digits:"<<d<<endl;
  cout<<"Symbols:"<<sy; 
}