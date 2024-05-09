Feature: Article publishing and deleting

Scenario Outline: Sign Up
Given User is on Sign Up page
When User enters details

Examples:
    | username   | email | password |
    | Aniket | aniket@gmail.com  | Test@123 |
    

Then User click on signup button


Scenario: Publish Article
Given User is on new article page
When Use enters article details and publish article
Then Article is published
