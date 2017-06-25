Feature: Cursos

Background: 
	Given User is on Login Page
	And User enters "eimj05@icloud.com" and "jordan23"
	Then Message displayed login Successfully

@Scenario1	
Scenario Outline: Adding a new Curso
	Given User is on Cursos Screen
	When User click to add a new Curso
	And User enters "<nombrecurso>" and "<desccorta>" and "<desclarga>" and "<fechainicio>" and "<fechafin>" and "<horainicio>" and "<horafin>" and "<costo>" and "<capacitador>" and "<cupolimite>" and "<categoria>" and "<ubicacion>"
	Then Curso is added Successfully
	When User Logout from the Application
	Then Message displayed Logout Succesfully
	
	
	Examples:
	|nombrecurso|desccorta|desclarga|fechainicio|fechafin|horainicio|horafin|costo|capacitador|cupolimite|categoria|ubicacion|
	|Testing Nombre Curso 1 |Descripcion Corta 1|Descripcion Larga 1 |2017-07-24|2017-07-30|09:00|13:00|2000|Juan Espinosa|12|Otros|UNID|
	|Testing Nombre Curso 2 |Descripcion Corta 2|Descripcion Larga 2 |2017-07-25|2017-07-30|09:00|13:00|4000|Daniel Espinosa|10|Social Media|IYEM|
	|Testing Nombre Curso 3 |Descripcion Corta 3|Descripcion Larga 3 |2017-07-26|2017-07-30|09:00|13:00|5000|Juan Espinosa|11|Otros|Centro Nacional de las Artes|
	
@Scenario2	
Scenario: Viewing a Curso	
	Given User is on Cursos Screen
	When User click to view a Curso 11
	Then Curso "Testing Nombre Curso 1" should exist
	When User Logout from the Application
	Then Message displayed Logout Succesfully
	
	
 