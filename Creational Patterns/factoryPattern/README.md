# Factory Pattern

The **Factory Pattern** is a way of creating objects in a clean and organized way.
Instead of using the new keyword to make objects directly everywhere in your code, you create them using a factory method.

This method decides what kind of object to return based on what you ask for.
It hides the details of how the object is made, so your main code stays simple and clean.

## Importance

✅ **Keeps code clean:**

All object creation happens in one place — the factory. You don’t repeat new Dog(...) or new Cat(...) everywhere.

✅ **Easier to update or add types:**

If you want to add a new type like Bird, you only update the factory — not your whole project.

✅ **Less chance of mistakes:**

You don’t have to remember the right order or number of constructor arguments everywhere. The factory handles that.

✅ **Follows good practice**

This pattern follows something called the Open/Closed Principle, meaning your code can grow without needing to change the parts that are already working.