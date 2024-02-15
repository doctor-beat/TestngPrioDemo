The tests in this project works ok if:

- one uses testng 6.11
- or run 'mvn clean test'



but it fails when:

- one uses testng 7.5.1
- AND runs 'mvn clean test  -Dtest=*Test'



That feels like a bug to me and surely breaks with the 6.11 version.

java version used is 1.8.