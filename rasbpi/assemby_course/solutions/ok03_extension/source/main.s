/******************************************************************************
*	main.s
*	 by Alex Chadwick
*
*	A sample assembly code implementation of the ok03 operating system, that 
*	simply turns the OK LED on and off repeatedly, but now using the EABI 
*   standard, and procedure calls. Also new is an appreciation of the IVT.
*	Sections changed since ok02.s are marked with NEW.
*
*	main.s contains the main operating system, and IVT code.
******************************************************************************/

/*
* .globl is a directive to our assembler, that tells it to export this symbol
* to the elf file. Convention dictates that the symbol _start is used for the 
* entry point, so this all has the net effect of setting the entry point here.
* Ultimately, this is useless as the elf itself is not used in the final 
* result, and so the entry point really doesn't matter, but it aids clarity,
* allows simulators to run the elf, and also stops us getting a linker warning
* about having no entry point. 
*/
.section .init
.globl _start
_start:

/* NEW
* Branch to the actual main code.
*/
b main

/* NEW
* This command tells the assembler to put this code with the rest.
*/
.section .text

/* NEW
* main is what we shall call our main operating system method. It never 
* returns, and takes no parameters.
* C++ Signature: void main(void)
*/
main:

/* NEW
* Set the stack point to 0x8000.
*/
mov sp,#0x8000

/* NEW
* Use our new SetGpioFunction function to set the function of GPIO port 16 (OK 
* LED) to 001 (binary)
*/
pinNum .req r0
pinFunc .req r1
mov pinNum,#16
mov pinFunc,#1
bl SetGpioFunction
.unreq pinNum
.unreq pinFunc

/* NEW
* Use our new SetGpio function to set GPIO 16 to low, causing the LED to turn 
* on.
*/
loop$:
pinNum .req r0
pinVal .req r1
mov pinNum,#16
mov pinVal,#0
bl SetGpio
.unreq pinNum
.unreq pinVal

/*
* Now, to create a delay, we busy the processor on a pointless quest to 
* decrement the number 0x3F0000 to 0!
*/
decr .req r0
mov decr,#0x3F0000
wait1$: 
	sub decr,#1
	teq decr,#0
	bne wait1$
.unreq decr

/* NEW
* Use our new SetGpio function to set GPIO 16 to high, causing the LED to turn 
* on.
*/
pinNum .req r0
pinVal .req r1
mov pinNum,#16
mov pinVal,#1
bl SetGpio
.unreq pinNum
.unreq pinVal

/*
* Wait once more.
*/
decr .req r0
mov decr,#0x3F0000
wait2$:
	sub decr,#1
	teq decr,#0
	bne wait2$
.unreq decr

/*
* Loop over this process forevermore
*/
b loop$
