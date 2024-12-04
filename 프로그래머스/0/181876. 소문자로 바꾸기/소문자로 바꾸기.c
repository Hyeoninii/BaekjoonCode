#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* myString) {
    size_t length = strlen(myString);
    
    char* answer = (char*)malloc((length+1)*sizeof(char));
    
     for(size_t i=0; i<length; i++) {
        answer[i] = tolower(myString[i]);
    }
    answer[length] = '\0';
    
    return answer;
}