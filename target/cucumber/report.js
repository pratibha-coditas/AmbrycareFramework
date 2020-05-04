$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Application Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to application with valid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on landing Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.loginSteps.user_is_on_landing_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login into application with valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.loginSteps.user_login_into_application_with_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.loginSteps.home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.loginSteps.validate_home_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logged in successfully message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.loginSteps.logged_in_successfully_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});