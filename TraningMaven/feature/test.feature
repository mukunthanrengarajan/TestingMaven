Feature: Testing Application

@1
Scenario: TC 01
Given URL is launched
When i Enter value


@2
Scenario Outline: TC 02
Given Launch the "<URL>"
When i Enter value

Examples:
|URL|
|https://www.google.com|
|https://www.yahoo.com|