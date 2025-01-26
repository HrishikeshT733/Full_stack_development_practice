#include<stdio.h>
#include<conio.h>
//#include<string.h>
int main() {
	int iemp, idep;
	char cdesc;
	
	printf("Enter DesigCode,EmpID and DeptCode respectively: ");
	scanf_s("%c", &cdesc);
	scanf_s("%d%d", &iemp, &idep);
	char str1[5];
	char str2[10];
	switch(idep){
	case 10:
		str1= "Purchase" ;
		break;
	case 20:
		str1== "Sales";
		break;
	case 30:
		str1== "Production";
		break;
	case 40:
		str1== "Marketing";
		break;
	case 50:
		str1== "Accounts";
		break;
	}
	switch(cdesc){
	case'M': 
		str2== "Manager";
		break;
	case'A':
		str2== "Analyst";
		break;
	case'W':
		str2== "Worker";
		break;
	case'S':
		str2== "Sales-person";
		break;
	case'C':
		str2== "Clerk";
		break;
	}

printf("Employee with EmpID %d works in %s", iemp,str1);
printf("department as %s",str2);
	//printf("%s %s", str1, str2);



_getch();
	return 0;
}