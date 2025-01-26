#include "Header.h"
void setting() {
    gameOver = 0;
    direction = RIGHT;
    x = WIDTH / 2;
    y = HEIGHT / 2;
    fX = rand()%WIDTH;//to get random integer from from 1 to WIDTH
    fY = rand()%HEIGHT;//to get random integer from from 1 to HEIGHT
    score = 0;
}
