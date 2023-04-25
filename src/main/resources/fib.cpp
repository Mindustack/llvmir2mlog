

int fib(int n) {
    if (n < 2) {
        return n;
    }
    return fib(n-1) + fib(n-2);
}
int OUTPUT=0;

int main(){
OUTPUT=fib(5);
return OUTPUT;
}