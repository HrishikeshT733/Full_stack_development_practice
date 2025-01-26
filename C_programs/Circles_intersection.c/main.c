#include "Header.h"
int main() {
	int x1, x2, y1, y2, r1,r2;
	printf("Circle C1(x,y) and radius: ");
	scanf_s("%d%d%d", &x1, &y1, &r1);
	printf("Circle C2(x,y) and radius: ");
	scanf_s("%d%d%d", &x2, &y2, &r2);
	if ((r1 + r2) == dist(x1, y1, x2, y2)) {
		printf("C1 and C2 are touching externally");
	}else if ((r1 + r2) < dist(x1, y1, x2, y2) || (r2 - r1) > dist(x1, y1, x2, y2)) {
		printf("C1 and C2 are not intersecting");
	}else if ((r2-r1) == dist(x1, y1, x2, y2)) {
		printf("C1 and C2 are touching internally");
	}else if((r1 + r2) > dist(x1, y1, x2, y2) && (r2-r1)<dist(x1, y1, x2, y2)) {
		printf("C1 and C2 are intersecting at 2 points");
	}
}
