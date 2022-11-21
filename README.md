Prerequisites -
Please ensure you have the basic software installation ready-
IDE - Intellij Idea community version
JAVA/JDK - Java 12+
Maven - 3.6+
Git - 2.38
Download Plugins within IDE from marketplace - Gherkin, Cucumber for Java, Lombok

Clone the Repo-
git clone https://github.com/preshapasin/Selenium_Java.git

Tools added-
ChromeDriver is added in the location src/Drivers.

Run within IDE-
Run the class LumaRunnerTest in the  location src/test/java/cucumber/LumaRunnerTest.java

Introduction-
The project can be used to run selenium tests for a test website Luma (https://magento.softwaretestingboard.com/) which can be scaled to 
add more scenarios along with existing scenarios under the Luma.feature file.
The project is structured and alligned as a Java and cucumber-BDD framework and utilises extent reports to generate test output report.

Project Requirements - 
Design the test scenario in gherkin to perform the below activity-
Test Case# - 1. Login using Registered user 
2. Buy 2 Men Tops → Jackets, 1 Men Bottoms → Pants 
3. Go to the cart page (Proceed to checkout) 
4. Verify the order summary (Product and Price) 
5. Provide a valid address for delivery 
6. Select Delivery method 
7. Place an order 
8. Verify the submitted order under My Orders

Test Reports-
Test reports can be found in the path after running the project from IDE (LumaRunnerTest.java). The report can be viewed in the browser after
running locally by exploring to the path - test-output/SparkReport/Spark.html
Please find below result of the extent report here after running our LumaRunnerTest -

![image](https://user-images.githubusercontent.com/118708370/202992990-b4a7ceaf-a20b-47e0-85dd-2a6ef6a16b70.png)




