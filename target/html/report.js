$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Use_case2.feature");
formatter.feature({
  "line": 1,
  "name": "Testing the use case2",
  "description": "",
  "id": "testing-the-use-case2",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12949949489,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Use_case_2",
  "description": "",
  "id": "testing-the-use-case2;use-case-2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Check if the user is in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Login to Flipkart application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Search for Iphone7",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Clicking on the top3 products",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Clicking on the compare button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Take screenshot of the compare page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Logging out of flipkart application",
  "keyword": "Then "
});
formatter.match({
  "location": "Use_Case2.check_if_the_user_is_in_home_page()"
});
formatter.result({
  "duration": 536735080,
  "status": "passed"
});
formatter.match({
  "location": "Use_Case2.login_to_Flipkart_application()"
});
formatter.result({
  "duration": 8068825518,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 17
    }
  ],
  "location": "Use_Case2.search_for_Iphone(int)"
});
formatter.result({
  "duration": 8568886877,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 19
    }
  ],
  "location": "Use_Case2.clicking_on_the_top_products(int)"
});
formatter.result({
  "duration": 10625406476,
  "status": "passed"
});
formatter.match({
  "location": "Use_Case2.clicking_on_the_compare_button()"
});
formatter.result({
  "duration": 324289643,
  "status": "passed"
});
formatter.match({
  "location": "Use_Case2.take_screenshot_of_the_compare_page()"
});
formatter.result({
  "duration": 3476937542,
  "status": "passed"
});
formatter.match({
  "location": "Use_Case2.logging_out_of_flipkart_application()"
});
formatter.result({
  "duration": 2212300320,
  "status": "passed"
});
formatter.after({
  "duration": 3980618399,
  "status": "passed"
});
});