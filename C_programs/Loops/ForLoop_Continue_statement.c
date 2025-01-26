#include<stdio.h>
#include<conio.h>
int main() {
	//excluding number which are factors of "5" upto 100
	for (int i = 1;i <= 100;i++) {
		if (i % 5 == 0) {
			continue;
	   }
		printf("%d\t", i);
	}
	_getch();
	return 0;
}