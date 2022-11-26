Feature: Automated CVS End2End Tests
Description: The purpose of this feature is to test End 2 End integration. 

	Scenario: Patient order the medicine	
	Given user is on HomePage
	When user is on person you are shopping
	And user on symptoms or conditions Page
	And user is on product strength Page
	And user is on type of relief page
	And user is on product form page
	Then verify the selected preferences Page
	