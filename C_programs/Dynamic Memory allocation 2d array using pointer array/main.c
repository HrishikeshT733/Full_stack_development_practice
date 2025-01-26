#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int main() {
//no of students and no of subjects are dynamic
	int**ptr, nsub,nstu;
	printf("Enter no of subjects: ");
	scanf("%d", &nsub);
	printf("Enter no of students: ");
	scanf("%d", &nstu);
	ptr = (int**)malloc(nstu * sizeof(int*));
	for (int i = 0;i < nstu;i++) {
		ptr[i] = (int*)malloc(nsub* sizeof(int));
	}
	for (int i = 0;i < nstu;i++) {
		printf("\nEnter data for students%d\n", i + 1);
		for (int j = 0;j < nsub;j++) {
			scanf("%d", &ptr[i][j]);
			//scanf("%d",(*(ptr+i)+j)); //method2
		}
	}
	printf("\n data for students\n");
	for (int i = 0;i < nstu;i++) {
		
		for (int j = 0;j < nsub;j++) {
			printf("%d\t", ptr[i][j]);
			//scanf("%d",*(*(ptr+i)+j)); //method2
		}
		printf("\n");
	}
	for (int i = 0;i < nstu;i++) {
		free(ptr[i]);
	}
	free(ptr);//to free allocated dynamic memory which is created in heap 
	_getch();
	return 0;
}