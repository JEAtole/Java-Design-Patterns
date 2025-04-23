# Factory Pattern

## Problem 

Pet Clinic System

In a pet clinic system, there is a need to manage and display information about different types of pets.
The system should be able to handle dogs and cats, each with unique attributes and behaviors.
The goal is to design a system that adheres to the principles of the factory design pattern to create instances of pets and display relevant information.

**Requirements:**

- Implement a factory design pattern using Pet as the factory interface.  The interface implements two methods: makeSound() and play().
- Dog and Cat are concrete objects that implement the Pet interface.
- PetRecord holds attributes such as petId, petName, and Pet.
- Implement two concrete classes, Dog and Cat, that extend the Pet interface. The Dog should have a breed attribute (String) while the Cat should have a noOfLives attribute (int).
- Clinic would be the client object.

## Class Diagram

![Design Patterns - factoryPattern](https://github.com/JEAtole/Design-Patterns/assets/126703958/10f3a071-9648-4d55-abe3-58c4df7d5857)

