Feature: CVS MultiSymptoms End2End Tests
Description: The purpose of few questions to get matched with the right product for your needs.
 
Scenario Outline: Person <age> and MultiSymptoms is <symptom>
	Given user is on HomePage
	When user is on person "<age>"
	And user on multi "<symptom>" Page
	And user is on "<strength>" strength Page
	And user is on type of "<relief>" page
	And user is on "<product>" form page
	Then verify the selected preferences Page
	
Examples:
|	age													  |	symptom		 |	strength																	|	relief													|	product					|
|Children ages 6+	|Multi-Symptom Cold & Flu Solutions |Maximum Strength / Extra Strength / Severe	|Day and Night Combo	|	Liqui Caps / Liqui Gel / Soft Gel|
|Adult, child ages 12 and older |Multi-Symptom Cold & Flu Solutions |Maximum Strength / Extra Strength / Severe	|Day Time / Any Time / Non Drowsy	|	Dissolvable Powder Packet / Mix With Water / Effervescent Tablet / Granule|
