## Compilation
### Building LLVM IR module
### Optimization
(Of course, you can also use LLVM's own optimization tools)
### Generating assembly code

## The ultimate goal of Mindustack is to generate a blueprint
### This blueprint will include
* Main program processor
* Stack
* Heap
* Port
* Data area (which may be merged into the heap area)
### Multi-processor
The current idea is that the main program specifies a subroutine at the output port, that is, the processor executes the function to modify the stack and return results or serve as an input and output device.
Subroutines can also be processors with stacks.
