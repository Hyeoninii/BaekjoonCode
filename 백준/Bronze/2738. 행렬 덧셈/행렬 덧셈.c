#include <stdio.h>
#include <stdlib.h>

int* matrixSum(int* arr1, int* arr2, int n, int m) {
    int* result = malloc(sizeof(int) * n * m);
    
    for(int i=0; i<n*m; i++) {
        *(result+i) = *(arr1+i) + *(arr2+i);
    }
    return result;
}

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    
    int* arrA = malloc(sizeof(int) * n * m);
    int* arrB = malloc(sizeof(int) * n * m);
    
    for(int i=0; i<n*m; i++) {
    scanf("%d", arrA+i);
    }
    for(int i=0; i<n*m; i++) {
    scanf("%d", arrB+i);
    }
    
    int* t = matrixSum(arrA, arrB, n, m);
    
    for(int i=0 ;i<n; i++) {
        for(int j=0; j<m; j++) {
            printf("%d ", *(t+i*m+j));
        }
        printf("\n");
    }
    
    free(arrA);
    free(arrB);
    free(t);
    
    return 0;
}