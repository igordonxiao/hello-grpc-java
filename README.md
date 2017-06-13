### steps
1. do configurations as `pom.xml`    
2. create `proto` file under `src/main/proto`        
3. generate java source file with command `mvn clean:clean protobuf:compile`                 
4. copy generated source files under `target/generated-sources/protobuf/java` to source file directory
5. delete directory `target`
6. coding in `HelloWorldServer.java`
7. coding in `HelloWorldClient.java`
8. start server with `HelloWorldServer.java`
9. start client with `HelloWorldClient.java`
