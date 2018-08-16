Feature: test the label change of the red button

Scenario: User has to click on the red button

Given user is on HomePage
And user clicks on the challenge DOM
When user clicks red button
Then label of the red button changes 


Scenario: Login and select expensive dress and add to cart

Given user is on HomePage
And user clicks on Dynamic loading
And user clicks on Example2
When user clicks on start button
Then Hello World test appears
