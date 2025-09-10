

Feature: Creating job from HRM

 Background: Re-usable steps
 Given user should launch the chrome 
 Then user open the url  as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
 Then user should enter login credentials
 
  |Admin|admin123|
 Then user should click on the login button
  
  

  
  Scenario Outline: Creating new job details from the orange hrm
    Given user should click on Admin 
    Then user should select the job
    Then user should click on job titles
    Then user should clikc on add
    
    Then user should enter job details
    
    |Hod10|Hod10 desc|Hod10 Note|
    |Hod20|Hod20 desc|Hod20 Note|
    |Hod30|Hod30 desc|Hod30 Note|
    
    Then click save btn
    Then logout
    Then close browser
    

    
    
   
 