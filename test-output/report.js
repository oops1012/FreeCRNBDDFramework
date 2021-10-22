$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#"
    },
    {
      "line": 3,
      "value": "#  Scenario: Login with valid credential"
    },
    {
      "line": 4,
      "value": "#    Given User on Home page"
    },
    {
      "line": 5,
      "value": "#    When User go to login page"
    },
    {
      "line": 6,
      "value": "#    And Login with correct credentials"
    },
    {
      "line": 7,
      "value": "#   # Then My Dashboard is displayed"
    },
    {
      "line": 8,
      "value": "#    Then User logout successfully"
    },
    {
      "line": 11,
      "value": "#  Scenario Outline: Login with valid credential"
    },
    {
      "line": 12,
      "value": "#    Given User on Home page"
    },
    {
      "line": 13,
      "value": "#    When User go to login page"
    },
    {
      "line": 14,
      "value": "#    And Login with \"\u003cusername\u003e\" and \"\u003cpassoword\u003e\""
    },
    {
      "line": 15,
      "value": "#   # Then My Dashboard is displayed"
    },
    {
      "line": 16,
      "value": "#    Then User logout successfully"
    },
    {
      "line": 17,
      "value": "#    Examples:"
    },
    {
      "line": 18,
      "value": "#      | username           | passoword |"
    },
    {
      "line": 19,
      "value": "#      | test1212@gmail.com | 123456    |"
    }
  ],
  "line": 23,
  "name": "Login with valid credential",
  "description": "",
  "id": "login-action;login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User go to login page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Login with correct login credentials",
  "rows": [
    {
      "cells": [
        "test1212@gmail.com",
        "123456"
      ],
      "line": 27
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 28,
      "value": "# Then My Dashboard is displayed"
    }
  ],
  "line": 29,
  "name": "User logout successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoignStepDefs.user_on_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoignStepDefs.goTo_LoingPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "LoignStepDefs.userLogoutSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
});