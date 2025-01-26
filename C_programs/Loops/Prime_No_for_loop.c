#include<stdio.h>
#include<conio.h>
int main() {
	//printing prime numbers from 1 to 100
	for (int i = 2;i <= 100;i++) {
		int cnt = 1;
		for (int j = 2;j <=i-1;j++) {
			if (i%j== 0){
				cnt++;
				break;
			}
		}
		if (cnt==1) {
			printf("%d ", i);
		}
	}
	_getch();
	return 0;
}