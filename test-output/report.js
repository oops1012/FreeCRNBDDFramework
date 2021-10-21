$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid credential",
  "description": "",
  "id": "login-action;login-with-valid-credential",
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
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "# Then My Dashboard is displayed"
    }
  ],
  "line": 8,
  "name": "User logout successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});