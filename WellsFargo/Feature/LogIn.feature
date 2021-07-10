Feature: Shopin Mens watch

Scenario: User want to Navigage to ebay online store and succesfully add Mens watch to the cart

Given User Navigate to "https://www.ebay.com/"

When User type mens watch on search bar and click on search button

When Mens watch list succesfully pop up 

And User click on the first watch from the list 

And User click on Add to cart Button 

When Another window pop up Asking if the User wants to add protection plan to the item

When User decide not add any plan and click on NO Thanks

Then User should be successfully navigate to Payment Process page 





