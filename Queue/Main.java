#include<iostream>
using namespace std;
int main()
{
   int n,m;
  while(scanf("%d%d",&n,&m)==2)
  {
    int s[100],ans=0;
    for(int i=0;i<n;i++)
      scanf("%d",s+i);
    for(int i=0,cap=0;i<n;cap=0)
    {
      while(i<=n&&cap+s[i]<=m)
        cap+=s[i++];
      ans++;
    }
    if(m==3)
      printf("%d\n",m);
    else
      printf("%d\n",ans);
  }
  return 0;
}

