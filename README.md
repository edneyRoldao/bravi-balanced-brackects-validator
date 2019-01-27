# bravi-balanced-brackects-validator

There are two ways to startup this applicarion:

First way (JDK-8 and Maven 3.3 must be installed on your machine):

1 - clone or download this project <br>
2 - open up a terminal and go to where pom.xml is placed in.<br>
3 - run the following command: mvn clean install<br>
4 - run the following command: java -jar target/*.jar<br>
<br>

Second way will be via docker (when you don't have java and maven installed):

1 - clone or download this project <br>
2 - open up a terminal and go to where Dockerfile is placed in.<br>
3 - Create an image with the following command: docker build Dockerfile -t image-name . <br>
4 - Create a container with the following command: docker run -d -p 8088:8088 image-name-step-above <br>
<br>

This application is based on a Rest API where you can check its endpoint via swagger. Go to the following link:
<br>
http://localhost:8088/swagger-ui.html

<br>
Note: this application is running on http://localhost:8088