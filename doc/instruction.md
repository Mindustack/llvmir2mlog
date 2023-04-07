1. mov ...
2. add sub ...
3. load store, all data are stored and read in the memory element space.
4. alloca - in entry block will be solved by compiler, dynamic one will make a difference too
5. call 
6. phi - actually treated as syntax sugar, it generates calculation code for alloca + jmp to midblock where the value is stored + load at phi.   by llvm optimizer ,so it will fail  without optimizing 
7. getelementptr - generates computation code for data types during the compilation phase.
8. insertvalue - treated as syntax sugar and generates calculation code for adding offset and reading storage. 
