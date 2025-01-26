#include "Header.h"
int main() {
    setting();
   while (!gameOver) {
       
        print(); 
        input();
        working();
        Sleep(200); // Control game speed
    }

    printf("Game Over! Final Score: %d\n", score);
    
    return 0;
}
