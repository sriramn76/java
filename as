#ifndef RAND_H
#define RAND_H
#include <stdlib.h>
#include <time.h>
void init_random() {
    srand(time(0));
}
int random() {
    return rand() % 100;
}
#endif

FileName: randumnumber.c

#include <stdio.h>
#include "rand.h"
int main() {
    FILE *file = fopen("random_numbers.txt", "w");    
    if (file == NULL) {
        printf("Failed to open the file.\n");
        return 1;
    }
    init_random();
    for (int i = 0; i < 10; i++) {
        int num = random(); 
        fprintf(file, "%d\n", num);
    }    
    fclose(file);
    printf("10 random numbers have been saved to random_numbers.txt");
    return 0;
}
