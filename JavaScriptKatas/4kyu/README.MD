Description:
In a dark, deserted night, a thief entered a shop. There are some items in the room, and the items have different weight (in kg) and price (in $).

The thief is greedy, his desire is to take away all the goods. But unfortunately, his bag can only hold n kg of items. So he has to make a choice, try to take away more valuable items.

Please complete the function to help the thief to make the best choices. Two arguments will be given: items (an array that contains all items) and n (the maximum weight the package can accommodate).

The list of items is provided as an array of objects:

[
  {weight:2, price:6},
  ...
]
The result should be a list of the original items that the thief should take away and that has the maximum possible total price.

Notes:

Order of the items in the output do not matter
If more than one valid solutions exist, you should return one of them
If no valid solution should return []
You should not modify argument items or the items themselves (in languages where they are mutable).
Pay attention to performance: the thief doesn't have all night to decide what to take or not!
Examples
For a list of the following available items:

weight	price
2	6
2	3
6	5
5	4
4	6
... and with a maximum weight of n=10, the best option could be a total price of 15$, collecting the following items:

weight	price
2	6
2	3
4	6
More examples please see the example tests ;-)