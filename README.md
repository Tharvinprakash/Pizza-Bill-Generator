# Pizza Order Application

This is a simple Java console application that simulates a pizza ordering system. It allows users to choose between a normal pizza and a deluxe pizza, customize their orders by adding extra ingredients, and calculates the total price based on the selected options.

## Features

- Normal Pizza: Option to choose between veg and non-veg pizzas. Users can add extra cheese, toppings, onion, or choose a takeaway option.
- Deluxe Pizza: Comes with extra cheese, toppings, and onion for veg pizzas; or extra spice, chicken, and onion for non-veg pizzas. Users can also opt for takeaway.
- Bill Calculation: The total price is calculated based on the type of pizza, added extras, and the number of pizzas ordered.

## Classes

- Pizza: The base class that handles the price calculation, pizza type, and additional ingredients.
- DeluxePizza: A subclass of Pizza that adds extra ingredients automatically based on whether the pizza is veg or non-veg.
- Main: The main class that handles user input and interactions with the pizza ordering system.
  
## How to Run

Clone the repository:

bash
Copy code
git clone https://github.com/your-username/pizza-order-app.git
Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse).

Compile and run the Main class.

Follow the instructions on the console to order your pizza.

## Sample User Flow

Choose between normal pizza or deluxe pizza.
For normal pizza, choose between veg or non-veg options.
Add extra ingredients as per your choice (e.g., extra cheese, toppings, onion, or spice).
Choose if you want the pizza for takeaway.
Specify the number of pizzas you want.
Get the final bill with a breakdown of the costs.

## Example Usage

bash
Copy code
Do You Want Normal Pizza or Deluxe pizza
 a. Pizza
 b. Deluxe Pizza
After making selections, the application will display the bill with the base price, additional charges for extras, and the total amount based on the number of pizzas ordered.

## Future Improvements

Implement GUI for better user interaction.
Add more customization options, such as pizza size and crust type.
Store orders in a database for historical records.
