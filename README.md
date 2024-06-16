# oauth2-example
Simple integration between an Authorization Server and a Resource Server using Spring technologies.

## how to run the project
Simply go to the **dockerfiles** folder and run the `docker-compose up` command. 

## pre-requisites
1) docker 
2) docker-compose
3) a mysql db with the same credentials found at dockerfiles/.env file


If you want to build the images in your computer (for the resource server or authorization server), you just need to execute a `mvn package` command inside the root folder of the target project. For example, suppose you want to build the resource server image, simply go to the resource-server folder then run a `mvn package` command from there. 

***PS**: it requires maven installed in your computer.*

<br>
For more information about the stack of technologies used, take a look on the projects folder.

