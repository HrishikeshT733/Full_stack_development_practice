#include "Header.h"
void print() {
    //    system("cls"); // Clear the screen
    system("cls");
    for (int i = 0; i < WIDTH+2; i++) printf("#");
    printf("\n");

    for (int i = 0; i < HEIGHT; i++) {
        for (int j = 0; j < WIDTH; j++) {
            if (j == 0) printf("#"); // Left wall

            if (i == y && j == x)
                printf("O"); // Snake head
            else if (i == fY &&j == fX)
                printf("F"); // Fruit
            else {
                int isTail = 0;
                for (int k = 0; k < tailLength; k++) {
                    if (tX[k] == j && tY[k] == i) {
                        printf("x");
                        isTail = 1;
                        break;
                    }
                }
                if (!isTail) printf(" ");
            }

            if (j == WIDTH-1) printf("#"); // Right wall
        }
        printf("\n");
    }

    for (int i = 0; i < WIDTH+2 ; i++) printf("#");
    printf("\n");

    printf("Score: %d\n", score);
}
