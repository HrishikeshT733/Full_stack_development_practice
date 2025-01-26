#include "Header.h"
int main(int argc, char* argv[]) {
	int i; //go to properties in configuration properties>debugging>commmand arguments ,there write string input
	for (i = 0;i < argc;i++) {//first element is always path of program and after that string will print from 2nd position
		printf("%s %d\n", argv[i],argc);
	}
}