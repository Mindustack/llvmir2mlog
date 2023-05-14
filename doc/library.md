## Implementation

* Some optimization parts in the process of generating assembly code unavoidably require simultaneous compilation of source code libraries
* If each library's code is encapsulated in a processor, the problem of code quantity limitation can be solved by utilizing cooperation between multiple processors, making plug-and-play possible

## Writing
* If the entire processor block is used as a library, only partial modification is needed to make it conform to the
  calling rules, and there is no need to use llvm2mlog to generate the stack machine
* Existing clang llvm tools can be used to quickly generate existing code, and it is expected to write some headers for
  more convenient writing in the future

## Planning
### Standard Library
- [ ] malloc free
- [ ] helper class string
- [ ] print (to message)
- [ ] ...

### Expansion
- [ ] Drawing
- [ ] Physics (I dare to write it out)
- [ ] Character printing
- [ ] ...
