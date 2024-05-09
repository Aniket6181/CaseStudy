Feature: Article publishing and deleting

Scenario Outline: Sign Up
Given User is on Sign Up page
When User enters <username> and <email> and <password> 
Then User click on signup button

Examples:
    | username   | email             | password |
    | Aniket     | aniket@gmail.com  | Test@123 |
    


Scenario: Publish Article
Given User is on new article page
When Use enters article details and publish article
Then Article is published
