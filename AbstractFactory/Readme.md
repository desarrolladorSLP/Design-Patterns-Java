# Abstract Factory (Creational)
>Creates an instance of several families of classes

## Problem
If an application is to be portable, it needs to encapsulate platform dependencies. 
These "platforms" might include: windowing system, operating system, database, etc. 
Too often, this encapsulation is not engineered in advance, and lots of #ifdef case 
statements with options for all currently supported platforms begin to procreate like 
rabbits throughout the code.

## Solution
1. Create interfaces for each platform object required (e.g. screen, keyboard)
2. Create an interface (The abstract factory) to return the instances of the implementations of step 1
3. Each implementation of step 2 will be a factory for the specific platform
   
## Notes
- Clients never create platform objects
- Can be bad idea when adding new products or changing existing ones, since it would affect all 
created families.

## Example
![Abstract factory Sample Diagram](abstract%20factory.png)


## References

https://sourcemaking.com/design_patterns/abstract_factory
https://es.wikipedia.org/wiki/Abstract_Factory


