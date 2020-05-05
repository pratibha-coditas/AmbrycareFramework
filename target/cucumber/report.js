$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Application Login",
  "description": "",
  "id": "application-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8587601265,
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
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Logged in successfully message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_is_on_landing_Page()"
});
formatter.result({
  "duration": 15320095500,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cCARE Provider[]\u003e but was:\u003cCARE Provider[ Portal]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat objectRepository.LoginPage.validateLoginPageTitle(LoginPage.java:30)\r\n\tat actions.LoginSteps.user_is_on_landing_Page(LoginSteps.java:14)\r\n\tat ✽.Given User is on landing Page(src/test/java/features/Login.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.user_login_into_application_with_valid_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.home_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.validate_home_page_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.logged_in_successfully_message_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2082427560,
  "status": "passed"
});
formatter.after({
  "duration": 1442482889,
  "status": "passed"
});
});