Feature: Check calculator operations

  Scenario: Add two positive numbers 
   Given url 'http://localhost:8088/calculator/add'
    And request { firstInput : 10, secondInput : 20 }
    And header Accept = 'application/json'
    When method post
    Then status 200
     And match response == {result:  30, message: 'Addition of 10 and 20 is 30'}
