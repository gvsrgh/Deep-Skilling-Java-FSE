# ✅ Hands-on: Hello World RESTful Web Service

## 💡 Scenario

Create a simple REST endpoint in your existing *spring-learn* application to return **"Hello World!!"** using Spring Web.

## 🧩 Steps

### 1️⃣ Create Controller

* Create a new controller: [`HelloController.java`](./Code/spring-learn/src/main/java/com/cognizant/springlearn/controller/HelloController.java) (click to visit).

```java
@RestController
public class HelloController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.info("Start sayHello");
        String message = "Hello World!!";
        LOGGER.info("End sayHello");
        return message;
    }
}
```

### 2️⃣ Run Application

* Start [`SpringLearnApplication.java`](./Code/spring-learn/src/main/java/com/cognizant/springlearn/SpringLearnApplication.java) (click to visit).
* Access in browser or Postman:

  ```
  http://localhost:8083/hello
  ```

## 💻 Sample Response

```
Hello World!!
```

## 💬 Explanation

### 🌐 HTTP headers (Developer Tools)

* In **browser dev tools > Network tab**, you can check the headers:

  * `Content-Type: text/plain;charset=UTF-8`
  * `Status: 200 OK`
  * `Server: Apache Tomcat`

### 🛠️ Postman Headers

* When using Postman, click the **Headers** tab to see:

  * `Content-Type`
  * `Content-Length`
  * `Date`
  * `Server`

## 🗂 Logs

✅ Logs in console should show:

```
INFO  Start sayHello
INFO  End sayHello
```

## 💻 Output Screenshots

* ✅ Logs and console output:
  ![Logs](./Output/Logs.png)

* ✅ Browser / Postman output:
  ![Response](./Output/Output.png)

## ✅ Conclusion

After accessing `/hello`, the application correctly returns **"Hello World!!"**, verifying the endpoint works both in a browser and in Postman.