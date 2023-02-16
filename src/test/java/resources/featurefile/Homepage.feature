Feature: HomePage
  Scenario: As a user I want to verify job Search using different data set.

  Scenario Outline: User Should able to verify jobsearch using different data set.
    Given User is on HomePage
    When User accept cookies
    And User enter job title"<jobTitle>"
    And User enter Location "<location>"
    And User select distance"<distance>"
    And User click on moreSearchOptionsLink
    And User enter salaryMin"<salaryMin>"
    And User enter salaryMax"<salaryMax>"
    And User select salaryType"<salaryType>"
    And User select jobType"<jobType>"
    And User click on Find Jobs button
    Then User verify the result"<result>"
    Examples:
      | jobTitle           | location                 | distance       | salaryMin | salaryMax | salaryType | jobType   | result                                           |
      | Software Tester    | Aylesbury,Buckinhamshire | up to 15 miles | 35000     | 50000     | annum      | Permanent | Permanent Software Tester jobs in Aylesbury      |
      | Customer Assistant | East Sussex              | up to 15 miles | 900       | 1500      | month      | Part Time | Part Time Customer Assistant jobs in East Sussex |
      | Head Teacher       | Croydon,Greater London   | up to 15 miles | 10000     | 15000     | month      | Temporary | Temporary Head Teacher jobs in Croydon           |
      | Company Accountant | Reading                  | up to 35 miles | 50000     | 90000     | annum      | Permanent | Permanent Company Accountant jobs in Reading     |
      | Teaching Assistant | Edgware,London           | up to 10 miles | 20000     | 25000     | annum      | Part Time | Part Time Teaching Assistant jobs in Edgware     |
