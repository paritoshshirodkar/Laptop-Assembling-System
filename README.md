# Builder Pattern Implementation

## Use Case Scenario Description

Simulate the working of a shop where the clients can request different types of laptops like - Gaming laptop, Personal laptop and Developer laptop.


The application constraints are:

The process involved in creating the different types of laptops should be similar.

The client should be unaware of the different parts/components that are used to assemble the laptop.

Based on the type of laptop requested an appropriate shop technician instance should be created who would follow a process to pick the right parts and assemble the laptop.

Only after all the components have been set properly and the laptop is ready the laptop should be given to the client.



## Flexibility
This implementation is flexible to support new types of Laptops without a lot of code modification. 
I have used Builder pattern in my implementation.Whenever a new type of Laptop is to be added, 
we just have to make a new class corresponding to it and make sure that this new class implements all the methods specified in the LaptopBuilder interface.

This makes the design very flexible to changes.


## Simplicity and Understability
I have implemented logging to demonstrate the working of my implementation.
In case if something goes wrong we can refer to the logs.
This is useful to simulate the order in which the parts were selected to assemble the laptop.
This was especially helpful while testing the logic of the system.
Overall the implemenntation of any method can also be understood from the comments.


## Avoiding code duplication

The director instances can use the different concrete builders to obtain different representation from the similar components.
Most instance variables have well defined Getters and Setters hence they can be accessed once the class is instantiated.
Hence a lot of code duplication was avoided by using the Builder Pattern.




# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Shop" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project. 

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies. 

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Shop
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see 

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see 
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin 

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


