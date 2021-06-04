

  Feature: Validating Place API's



  Scenario Outline:  Verify if place is being succesfuly added using AddPlaceAPI
   #with this keyword "Outline" wi are telling that we gonna pass data from the examples
    Given Add Place Payload with "<name>"  "<language>" "<address>"
    When user calls "AddPlaceAPI" with POST htt request
    Then the API ca;; is success with status code 200
    And "status" in response body is "OK"
    And  "scope" in response body is "APP"


    Examples:
      |name 	 | language |address		 |
      |AAhouse |  English |World cross center|
#	|BBhouse | Spanish  |Sea cross center  |