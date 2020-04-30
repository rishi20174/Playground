#include<iostream>
using namespace std;
int gcd(int a,int b,int c){
    int small,g;
    if(a<b && a<c)
        small=a;
    else if(b<a && b<c)
        small=b;
    else
        small=c;
    while(small!=0){
        if(a%small==0 && b%small==0 && c%small==0){
            g=small;
            break;
        }
        small--;
    }
    return g;
}
int main(){
    int a,b,c,d;
    cin>>a>>b>>c>>d;
    if(gcd(a,b,c)==d)
        cout<<"Answer is correct.";
    else
        cout<<"Answer is wrong.";
}