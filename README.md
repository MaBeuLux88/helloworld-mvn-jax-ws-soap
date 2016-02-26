# helloworld-mvn-jax-ws-soap

Hello World with a SOAP WebService using JAX-WS.

# Build 
- `mvn clean package`

The resulting war file is in the "target" folder.

# Deploy on Glassfish in Docker

This need to be double checked but it's something like this : 

- `docker run -d -p 8080:8080 -p 8181:8181 -p 4848:4848 --name glassfish-sandbox glassfish:latest`
- `docker cp /path/to/foo.war <ID>:/foo.war`
- `docker exec -it <ID> /bin/bash`

Inside the container : 

- `asadmin change-admin-password --user admin` => leave empty / admin / admin
- `asadmin -u admin enable-secure-admin` => gives access to http://localhost:4848
- `asadmin -u admin deploy /foo.war`

Check in the application that everything is working correctly.
