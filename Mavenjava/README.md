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
Add configuration section under surefire nodes  
<configuration>
    <suiteXmlFiles>
		<suiteXmlFile>testng.xml</suiteXmlFile> <!-- This should be the path of the xml file -->
	</suiteXmlFiles>
</configuration>

#maven - run a single file
> mvn -Dtest=AppiumTest test #AppiumTest should be replaced by file name to be run
