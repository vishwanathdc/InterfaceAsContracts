# InterfaceAsContracts
This project is to understand using Interfaces as contracts.
Here the developer of machine class and person class agree on the common interface and functions to use.

1. The Coinable interface has checkgummys method
2. The machine class implements the Coinable interface and defines the checkgummys method. It returns true if there are gummys to be delivered,
   returns false if there are no gummys.
3. The person class has delivergummy method which takes machine object as an interface object.
4. The important aspect here is the person class doesnot need to know the implementation of checkgummys method, it only has to use it 
   and check the status.
5. Finally in main method, we create objects of person and machine, we pass machine object to person delivergummy method as an interface object


