#include <stdio.h>

int main() {
    for (int i = 1; i <= 100; i++) {
        printf("%s%s%s\n", 
            i % 3 == 0 ? "Fizz" : "",
            i % 5 == 0 ? "Buzz" : "",
            (i % 3 != 0 && i % 5 != 0) ? printf("%d", i), "" : ""
        );
    }
    return 0;
}

