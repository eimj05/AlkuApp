Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is on Login Page
	And User enters "<username>" and "<password>"
	Then Message displayed login Successfully
	When User Logout from the Application
	Then Message displayed Logout Succesfully
	
	Examples:
	|username          |password  |
	|eimj05@icloud.com |jordan23  |
	
	
	Scenario Outline: Not Successful Login with Valid Credentials
	Given User is on Login Page
	And User enters "<username>" and "<password>"
	Then Message displayed login Failed
	
	
	Examples:
	|username        |password  |
	|eimj05@mail.com |jordan23  |
	
	