extern "C" void print(int n);
int fib(int n) {
    if (n < 2) {
        return n;
    }
    return fib(n-1) + fib(n-2);
}

int main(){
print(fib(8));
return 0;
}