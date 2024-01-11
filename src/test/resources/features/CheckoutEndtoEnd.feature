@EndToEndTest
  Feature:end to end testing

    Scenario: Login and add to cart

      #Step1 : Login Page
      Given User already on login page
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on product page

      #Step2 : User adds a Product
      When User selects a product
      Then User is already on your cart page

      #Step3: Check Out Product
      When User input "FirstName" then "LastName" and enter "12345" as zip code
      Then User finish checkout
