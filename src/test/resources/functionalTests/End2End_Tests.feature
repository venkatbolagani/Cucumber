Feature: CVS End2End Tests
Description: The purpose of few questions to get matched with the right product for your needs.
 
Scenario Outline: Person <age> and Symptom is <symptom>
	Given user is on HomePage
	When user is on person "<age>"
	And user on "<symptom>" Page
	And user is on "<strength>" strength Page
	And user is on type of "<relief>" page
	And user is on "<product>" form page
	Then verify the selected preferences Page
	
Examples:
|	age													  |	symptom		 |	strength																	|	relief													|	product					|
|Adult, child ages 12 and older |Sore Throat |Maximum Strength / Extra Strength / Severe	|Day Time / Any Time / Non Drowsy	|	Drops / Lozenges|	
|Children ages 6+								|Cough			 |Regular Strength / Unspecified			      	|Day Time / Any Time / Non Drowsy	|	Liquid / Syrup  |
|Children ages 4+	|Sneezing / Runny Nose |Regular Strength / Unspecified	|Day and Night Combo	|	Liquid / Syrup|
|Adult, child ages 12 and older |Nasal Congestion / Sinus Pressure |Maximum Strength / Extra Strength / Severe	|Day and Night Combo	|	Pills / Tablets / Caplets / Capsules|

Scenario Outline: Person <age> and Symptom is <symptom>
	Given user is on HomePage
	When user is on person "<age>"
	And user on "<symptom>" Page
	And user is on "<strength>" strength Page
	And user is on type of "<relief>" page
	And user is on "<product>" form page
	Then verify the selected preferences Page
	
Examples:
|	age													  |	symptom		 |	strength																	|	relief													|	product					|
|Adult, child ages 12 and older |Sore Throat |Maximum Strength / Extra Strength / Severe	|Day Time / Any Time / Non Drowsy	|	Drops / Lozenges|	