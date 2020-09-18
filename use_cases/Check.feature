Feature: Checout 
i want to checkout 

Scenario: Two banans scanned separately
Given the price of a "banana" is 40
When I checkout 1 "banana"
And I checkout 1 "banana"
Then the total price should be 80
Scenario: A banana and Apple
Given the price of a "banana" is 40
And the price of a "apple" is 25
When I checkout 1 "banana"
And I checkout 1 "apple"
Then the total price should be 65

Scenario: A tomato and Botato
Given the price of a "tomato" is 74
And the price of a "Botato" is 63
When I checkout 1 "tomato"
And I checkout 2 "Botato"
Then the total price should be 200

Scenario: Two banans scanned separately
Given the price of a "banana" is 40
When I checkout 1 "banana"
Then the total price should be 40