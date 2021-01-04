# Maven
> Central repo for dependencies  
> Structure management  
> Integration with CI tools  
> Support for test frameworks  

#maven compile and run steps
> mvn clean  
> mvn compile  
> mvn test  

#maven - run testng.xml
> Add configuration section under surefire nodes  
> Visit - https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html

#maven - run a single file
> mvn -Dtest=AppiumTest test #AppiumTest should be replaced by file name to be run  
> Visit - https://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html

#maven - run specific profile from pom.xml
> mvn test -P smoke, where 'smoke' is any profile if in pom file