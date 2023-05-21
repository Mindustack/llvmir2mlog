extern "C" void print(int n);
extern "C" int IPCall(int n);
extern "C" int IPAccept(int id);


int main(){

int ptr = IPCall(4685);


print(ptr);

return 0;
}