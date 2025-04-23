# Strategy Pattern

## Problem

Building an online food ordering system where users can place an order and choose from multiple payment methods: GCash, Maya, or Cash.

Each payment method may require a different way of processing the payment.

- You gain 10 energy points when paying with Gcash
- You have 1% additional interest in Savings when paying with Maya
- You get no incentives when paying with Cash

Design a system where the order amount remains the same, but the payment logic can be swapped easily based on the selected payment type.

Make sure that adding a new payment method in the future (like PayPal or credit card) won’t require rewriting the whole system.

## Class Diagram

![Strategy](https://github.com/JEAtole/Workspace/assets/126703958/53245514-0cbb-432a-bf3a-6a69b874976f)
