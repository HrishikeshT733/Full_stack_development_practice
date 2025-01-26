#include <stdio.h>
#include <stdlib.h>
#include <conio.h> // For _kbhit() and _getch()
#include <windows.h> // For Sleep()

#define WIDTH 50
#define HEIGHT 20

// Directions
#define UP 1
#define DOWN 2
#define LEFT 3
#define RIGHT 4
// Global variables

int tX[90], tY[90];//tX- fruit x coordinate ,tY-fruit y coordinate i.e Arrays to store the positions of the snake's tail segments.
int tailLength;
int direction;
int x, y, fX, fY, score; //fX- fruit x coordinate ,fY-fruit y coordinate,x and y current position of snake head
int gameOver;

void setting();
void print();
void input();
void working();





