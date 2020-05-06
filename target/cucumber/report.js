$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6446968219,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Login to application with valid username and password",
  "description": "",
  "id": "application-login;login-to-application-with-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user login into application with valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Popup is displayed as \"Logged in successfully\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Logged in successfully message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_is_on_landing_Page()"
});
formatter.result({
  "duration": 15157363538,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_login_into_application_with_valid_username_and_password()"
});
formatter.result({
  "duration": 2977951191,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Logged in successfully",
      "offset": 23
    }
  ],
  "location": "LoginSteps.popup_is_displayed_as(String)"
});
formatter.result({
  "duration": 3858351775,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.home_page_is_displayed()"
});
formatter.result({
  "duration": 14513147808,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.validate_home_page_title()"
});
formatter.result({
  "duration": 81715,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.logged_in_successfully_message_should_be_displayed()"
});
formatter.result({
  "duration": 89610,
  "status": "passed"
});
formatter.after({
  "duration": 320938,
  "status": "passed"
});
formatter.after({
  "duration": 58819,
  "status": "passed"
});
});