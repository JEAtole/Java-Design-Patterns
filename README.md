# Design Patterns (In Progress)

Welcome to my repository dedicated to exploring and implementing Design Patterns using Java as part of our Software Engineering 1 and 2.
This repository serves as a comprehensive resource for understanding various design patterns and their practical applications in Java programming.
Below, you'll find a brief overview of the contents of this repository:

## Introduction to Design Patterns
Design patterns are reusable solutions to commonly occurring problems in software design.
They provide a structured approach to solving design problems and promote code reusability, flexibility, and maintainability.
Understanding and applying design patterns is essential for developing robust, scalable, and maintainable software systems.

## Contents
This repository contains implementations of popular design patterns categorized into three main categories: Creational, Structural, and Behavioral design patterns.
Each category includes multiple design patterns with example implementations.

### 1. Creational Design Patterns
Creational design patterns focus on the creation of objects, providing flexibility in object creation mechanisms while hiding the creation logic from the client.

- **Singleton Pattern:** Ensures that a class has only one instance and provides a global point of access to it.
- **Factory Method Pattern:** Defines an interface for creating an object but allows subclasses to alter the type of objects that will be created.
- **Abstract Factory Pattern:** Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### 2. Structural Design Patterns
Structural design patterns deal with the composition of classes or objects to form larger structures and provide new functionality through object composition.

- **Adapter Pattern:** Allows incompatible interfaces to work together by converting the interface of one class into another interface that clients expect.
- **Decorator Pattern:** Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.
- **Facade Pattern:** Provides a unified interface to a set of interfaces in a subsystem, simplifying the usage and interaction with complex systems.

### 3. Behavioral Design Patterns
Behavioral design patterns focus on the interaction and communication between objects, defining how they communicate with each other and how they encapsulate behavior.

- **Observer Pattern:** Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- **Strategy Pattern:** Defines a family of algorithms, encapsulates each algorithm and makes them interchangeable. It allows the algorithm to vary independently from clients that use it.
- **Command Pattern:** Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
- **State Pattern:** Allows an object to change its behavior when its internal state changes, making it appear as if the object has changed its class.
- **Visitor Pattern:** Lets you add new operations to existing object structures without modifying their classes. It works by letting a "visitor" object perform operations on elements of an object structure, promoting separation of concerns and easier maintenance.