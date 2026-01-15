# Builder Pattern

The **Builder Pattern** is a way of creating objects step by step, especially when they have many properties or optional details.
Instead of making an object all at once with a long constructor, you use a builder to set each property individually and then create the object.
This keeps object creation organized, readable, and flexible — and the final object is usually immutable, so it can’t be accidentally changed later.

## Importance

✅ **Keeps code readable:**

Instead of long constructors with lots of arguments, you clearly see what properties are being set.

✅ **Handles optional details easily:**

You only set the fields you need — nothing is forced, and you can skip optional properties.

✅ **Safe and consistent:**

Once the object is built, it’s immutable, so your program avoids accidental changes or inconsistent states.

✅ **Easier to extend:**

Want to add a new property later? Just add a new builder method. Existing code doesn’t break.

## Analogy

Imagine ordering a sandwich.

You start by getting the basic sandwich: a bread and maybe meat. (required fields)

Then you ask to have extra toppings one by one: cheese, lettuce, tomato, pickles, sauces (optional fields)

You decide the order and combination and you don't have to put anything you don't want.

When you finalize your order (build), the chef gives you a perfect, complete sandwich. You can't change you order after it has been made but it's exactly how you want it.

The builder is like the chef: you give instructions step by step, and they keep track of everything for you. The final sandwich (object) is ready and consistent.
