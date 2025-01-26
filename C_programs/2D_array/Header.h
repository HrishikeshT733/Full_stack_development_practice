#include<stdio.h>
#include<conio.h>
#define ROW 3
#define COL 3
void acceptptr(int (*arrr)[COL]);
void accept(int arrr[][COL]);
void display(int arrr[][COL]);
void displayptr(int (*arrr)[COL]);
int transpose(int arrr[][COL], int temp[][COL]);