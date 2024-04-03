2 seperate test cases executing in parallel with the help of TestNG (suite testing.xml) framework in Java.

Every test case has:
a main file called TestCase that includes all tests
a setup file called TestSetup that launches the Chrome browser and collapses it after the tests are done
three page objects classes and
one business object class

Test Case 1:
   1st test step: visit http://www.amazon.com
   2nd test step: search for product "lg tv 65" and hit search
   3rd test step: from the results, select the 3rd product
   4th test step: from the selected product page, a. assert that the screen size is 65 inches and b. assert that the brand is LG

Test Case 2:
  1st test step: visit http://www.kotsovolos.gr
  2nd test step: search for product "iphone 13"
  3rd test step: select from left side filters "Screen size: over 6 inches"
  4th test step: from the results, select the product with title "Apple IPhone 13 5G 128GB Midnight"
  5th test step: from the selected product page, a. assert that the title of the phone is "Apple IPhone 13 5G 128GB Midnight" and b. that its feature is "5G"
