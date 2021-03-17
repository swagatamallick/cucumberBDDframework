Feature: Scenarios for the activities in Amazon website
  Scenario Outline: Login in amazon website
    Given Open "<website>" in "<browser>"
    When user enters the "<username>" and "<password>"
    Examples:
    |browser| website | username | password |
    |chrome |amazon| testerswagatamallick@gmail.com| Wsxedcrfv1 |
