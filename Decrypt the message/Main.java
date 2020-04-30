#include <iostream> 
using namespace std; 

int main()
{
	int n,j,k,i=1,sum=0;

	
	cin>>j;
    cin>>k;
    n=j+k;
	while(i<n)
	{
		if(n%i==0)
			sum=sum+i;
		i++; 
	}

	if(sum==n)
		cout <<"They can read the message\n"; 
	else
		cout <<"They can't read the message";

	return 0;
}