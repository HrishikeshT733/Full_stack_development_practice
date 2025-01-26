#include "Header.h"
void working() {
    // Update tail position
    int prevX = tX[0];
    int prevY = tY[0];
    int prev2X, prev2Y;
    tX[0] = x;
    tY[0] = y;

    for (int i = 1; i < tailLength; i++) {
        prev2X = tX[i];
        prev2Y = tY[i];
        tX[i] = prevX;
        tY[i] = prevY;
        prevX = prev2X;
        prevY = prev2Y;
    }

    // Move snake head
    switch (direction) {
    case UP:
        y--;
        break;
    case DOWN:
        y++;
        break;
    case LEFT:
        x--;
        break;
    case RIGHT:
        x++;
        break;
    }

    // Check collision with walls
    if (x < 0 || x >= WIDTH || y < 0 || y >= HEIGHT) gameOver = 1;

    // Check collision with tail
    for (int i = 0; i < tailLength; i++) {
        if (tX[i] == x && tY[i] == y) {
            gameOver = 1;
        }
    }

    // Check if fruit is eaten
    if (x == fX && y == fY) {
        score += 1;
        fX = rand() % WIDTH;
        fY = rand() % HEIGHT;
        tailLength++;
    }
}