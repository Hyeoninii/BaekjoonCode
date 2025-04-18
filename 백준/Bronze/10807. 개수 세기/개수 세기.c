#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d", &n);
    
    int* arr = malloc(sizeof(int)*n);
    
    for(int i=0; i<n; i++) {
        scanf("%d", arr + i);
    }
    
    int v;
    int count = 0;
    scanf("%d", &v);
    
    for(int i=0; i<n; i++) {
        if(*(arr+i) == v) count++;
    }
    
    printf("%d", count);
}