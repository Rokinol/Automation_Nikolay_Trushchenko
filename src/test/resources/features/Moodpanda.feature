Feature: Mood panda test

  Scenario: Navigation in application
    Given open home page
    When i click on menu item "What?"
    Then i check that uri is "information/monitor-your-mood"
    When i click on menu item "How?"
    Then i check that uri is "information/how-to-use-a-mood-diary"

 Scenario: open home page
   When i click on menu item "Login"
   Then i check that uri is "login"
   When i enter email "test@test.ru", password "123456"
   And i click login button
   Then i check error message "Your email or password is wrong"
