#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int main() {
	//no of students (3) is fixed and no of subjects are dynamic
	int* ptr[3], nsub;
	printf("Enter no of subjects: ");
	scanf("%d", &nsub);
	for (int i = 0;i < 3;i++) {
		ptr[i] = (int*)malloc(nsub * sizeof(int));
	}
	for (int i = 0;i < 3;i++) {
		printf("\nEnter data for students%d\n", i + 1);
		for (int j = 0;j < nsub;j++) {
			scanf("%d", &ptr[i][j]);
			//scanf("%d",(*(ptr+i)+j)); //method2
		}
	}
	printf("\n data for students\n");
	for (int i = 0;i < 3;i++) {

		for (int j = 0;j < nsub;j++) {
			printf("%d\t", ptr[i][j]);
			//scanf("%d",*(*(ptr+i)+j)); //method2
		}
		printf("\n");
	}
	for (int i = 0;i < 3;i++) {
		free(ptr[i]);
	}//to free allocated dynamic memory which is created in heap 
	_getch();
	return 0;
}