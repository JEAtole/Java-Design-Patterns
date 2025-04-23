# Problem

Plugging Devices into Power Outlets

You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

Adaptee Objects:

&nbsp;&nbsp;&nbsp;&nbsp;Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.
  
&nbsp;&nbsp;&nbsp;&nbsp;Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.
  
&nbsp;&nbsp;&nbsp;&nbsp;SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.

Target Object:

&nbsp;&nbsp;&nbsp;&nbsp;PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.

Adapter Objects:

&nbsp;&nbsp;&nbsp;&nbsp;LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().
  
&nbsp;&nbsp;&nbsp;&nbsp;RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().
  
&nbsp;&nbsp;&nbsp;&nbsp;SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().

# UML Class Diagram

![adapterPattern_Class Diagram](https://github.com/JEAtole/Design-Patterns/assets/126703958/32ff3e4b-e637-440d-a28c-38e0f38ce150)
