#include<stdio.h>
#include<conio.h>
int main() {
    int length, width,i,j;
    scanf_s("%d%d", &length,&width);
    printf("%c", 218);
    for (i = 2;i <= length;i++) {
        printf("%c", 196);
    }
    printf("%c\n", 191);
    if (width >= 4) {
        for (j = 4;j <= width;j += 2) {
            printf("%c", 179);
        }
     }
    for (int k =2;k<= length;k++) {
        printf(" ");
    }
    if (width >= 4) {
        for (j = 4;j <= width;j += 2) {
            printf("%c\n", 179);
        }
    }
   // printf("\n");
    printf("%c", 192);
    for (i = 2;i <= length;i++) {
        printf("%c", 196);
    }
    printf("%c",217);
    _getch();
    return 0;
}
