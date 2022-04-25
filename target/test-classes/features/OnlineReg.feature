Feature: Online Registration

  Scenario: Verify that user can register
    Given user launch the browser
    And patient clicked continue button
    When patient fill in secutity questions
    And click verify details to get started
    And patient select who is completing the form patient details page
    And patient click next button
    And patient confirmed receipt of appointment information
    And patient fill in about the patient page
    And patient click about the patient page next button
    And patient fill in Patient permanent home address and contact details
    And patient click Patient permanent home address and contact details page next button
    And patient fill in Emergency contact details
    And patient click Emergency contact details next button
    And patient fill in Doctor details
    And patient click Doctor details next button
    And patient fill in funding treatment page
    And patient click funding treatment page next button
    And patient click skip button
    Then patient click submit registration button
    And Thanks for registering page is displayed
