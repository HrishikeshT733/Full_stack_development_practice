#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Function to search for a name in the list
int searchName(char** students, int count, const char* name) {
    for (int i = 0; i < count; i++) {
        if (strcmp(students[i], name) == 0) {
            return 1; // Found
        }
    }
    return 0; // Not found
}

int main() {
    int numStudents;
    char** students; // Pointer to a pointer for a 2D array
    char searchNameInput[100];

    // Get the number of students
    printf("Enter the number of students: ");
    scanf("%d", &numStudents);

    // Allocate memory for the array of pointers
    students = (char**)malloc(numStudents * sizeof(char*));
    if (students == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }

    // Get the names of students and display memory consumed
    printf("Enter the names of the students:\n");
    for (int i = 0; i < numStudents; i++) {
        char temp[100]; // Temporary array to store the input name
        printf("Student %d: ", i + 1);
        scanf("%s", temp);

        // Allocate memory for each name based on its length
        students[i] = (char*)malloc((strlen(temp) + 1) * sizeof(char));
        if (students[i] == NULL) {
            printf("Memory allocation failed.\n");
            return 1;
        }

        // Copy the name into the allocated memory
        strcpy(students[i], temp);

        // Display the memory consumed by the current string
        printf("Memory consumed by '%s': %zu bytes\n", students[i], sizeof(students[i]));
    }

    // Get the name to search
    printf("Enter the name to search: ");
    scanf("%s", searchNameInput);

    // Search for the name
    if (searchName(students, numStudents, searchNameInput)) {
        printf("Found\n");
    }
    else {
        printf("Not Found\n");
    }

    // Free allocated memory
    for (int i = 0; i < numStudents; i++) {
        free(students[i]); // Free each student's name
    }
    free(students); // Free the array of pointers

    return 0;
}
