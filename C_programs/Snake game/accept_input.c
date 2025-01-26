#include "Header.h"
void input() {
    if (_kbhit()) {
        switch (_getch()) {
        case 'w':
            direction = UP;
            break;
        case 's':
            direction = DOWN;
            break;
        case 'a':
            direction = LEFT;
            break;
        case 'd':
            direction = RIGHT;
            break;
        case 'e':
            gameOver = 1;
            break;
        }
    }
}