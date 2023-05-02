#include <stdio.h>
#include <limits.h>

int main() {
	//code
	int a[5];
	int first=INT_MIN,second=INT_MIN;
	for(int i=0;i<5;i++){
	    scanf("%d",&a[i]);
	    int x=a[i];
	    if(x>first){
	        second=first;
	        first=x;
	    }
	    else if(x>second && x!=first){
	        second=x;
	    }
	}
	printf("%d",second);
	return 0;
}
