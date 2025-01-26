#include "Header.h"
int main() {
	int r,choice,b,arearec, perirec;
	float area, cir;
	printf("Enter your choice circle or rectangle:\n1.circle\n2.rectangle\n ");
	scanf_s("%d", &choice);
		switch (choice) {
		case 1:
			printf("Enter radius of circle: ");
			scanf_s("%d", &r);
			areacir(r, &area, &cir);
			printf("Area is %.3f and Circumference is %.3f", area, cir);
			break;
		case 2:
			printf("Enter length and breadth of rectangle: ");
			scanf_s("%d%d", &r,&b);
			areaper(r,b,&arearec,&perirec);
			printf("Area of rectangle is %d and perimeter of rectangle is %d", arearec ,perirec);
			break;
		default:
			printf("Wrong choice");
}
		_getch();
		return 0;
	

		
}