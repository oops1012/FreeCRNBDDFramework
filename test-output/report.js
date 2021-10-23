$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginWithMap.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action with map",
  "description": "",
  "id": "login-action-with-map",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid credential",
  "description": "",
  "id": "login-action-with-map;login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User go to login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Login with correct credentials",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#  | test1212@gmail.com | 123456   |"
    }
  ],
  "line": 9,
  "name": "User logout successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginWithMap.user_on_Home_page()"
});
formatter.result({
  "duration": 9410211400,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithMap.goTo_LoingPage()"
});
formatter.result({
  "duration": 1817267300,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithMap.userAndPasswordValueEntered(DataTable)"
});
formatter.result({
  "duration": 3416500,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithMap.userLogoutSuccessfully()"
});
formatter.result({
  "duration": 1793004600,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
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
      "value": "#      | test1212@gmail.com | 123456 |"
    },
    {
      "line": 8,
      "value": "#   # Then My Dashboard is displayed"
    },
    {
      "line": 9,
      "value": "#    Then User logout successfully"
    }
  ],
  "line": 12,
  "name": "Login with valid credential",
  "description": "",
  "id": "login-action;login-with-valid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User go to login page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Login with \"\u003cusername\u003e\" and \"\u003cpassoword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "# Then My Dashboard is displayed"
    }
  ],
  "line": 17,
  "name": "User logout successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "login-action;login-with-valid-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "passoword"
      ],
      "line": 19,
      "id": "login-action;login-with-valid-credential;;1"
    },
    {
      "cells": [
        "test1212@gmail.com",
        "123456"
      ],
      "line": 20,
      "id": "login-action;login-with-valid-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Login with valid credential",
  "description": "",
  "id": "login-action;login-with-valid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "User on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User go to login page",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Login with \"test1212@gmail.com\" and \"123456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "# Then My Dashboard is displayed"
    }
  ],
  "line": 17,
  "name": "User logout successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginWithMap.user_on_Home_page()"
});
formatter.result({
  "duration": 21648800600,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithMap.goTo_LoingPage()"
});
formatter.result({
  "duration": 2677423600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1212@gmail.com",
      "offset": 12
    },
    {
      "val": "123456",
      "offset": 37
    }
  ],
  "location": "LoginWithMap.loginWithAnd(String,String)"
});
formatter.result({
  "duration": 396186000,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithMap.userLogoutSuccessfully()"
});
formatter.result({
  "duration": 1497724900,
  "status": "passed"
});
});