# ✅ Hands-on 4: Difference between JPA, Hibernate and Spring Data JPA

## 💡 Overview

In this hands-on, we compare **JPA**, **Hibernate**, and **Spring Data JPA** concepts with practical implementation examples.

## ⚡ JPA (Java Persistence API)

* JPA is a **specification** for accessing, persisting, and managing data between Java objects and a relational database.
* It provides standard APIs and guidelines for Object-Relational Mapping (ORM) in Java.
* JPA itself does not perform persistence; it needs an implementation like Hibernate.

## ⚙️ Hibernate

* Hibernate is an **implementation** of the JPA specification and a full-fledged ORM framework.
* Provides advanced features like caching, lazy loading, and customized SQL generation.
* Simplifies database interactions by allowing you to operate on Java objects.

## 🌟 Spring Data JPA

* Spring Data JPA is an **abstraction layer** built on top of JPA and Hibernate.
* Reduces boilerplate code significantly with ready-to-use repository interfaces.
* Supports derived queries, pagination, and integrates smoothly with the entire Spring ecosystem.

## 🔎 Key Differences

| Feature            | JPA           | Hibernate      | Spring Data JPA        |
| ------------------ | ------------- | -------------- | ---------------------- |
| Type               | Specification | Implementation | Abstraction Layer      |
| Caching            | No            | Yes            | Yes                    |
| Query Language     | JPQL          | HQL            | Derived Queries & JPQL |
| Boilerplate Code   | More          | Less           | Minimal                |
| Spring Integration | No            | Yes            | Yes                    |


## 🔗 Practical References

### 🟢 Hibernate Hands-on Example

Check out the full Hibernate implementation, configuration, and outputs:
👉 [Hibernate Example README](./Code/01_Hibernate/)

### 🔵 Spring Data JPA Hands-on Example

Check out the Spring Data JPA implementation with repository abstraction and outputs:
👉 [Spring Data JPA Example README](./Code/02_spring_data_jpa/)

## ✅ Conclusion

* **JPA** provides standards.
* **Hibernate** implements JPA and offers extra features.
* **Spring Data JPA** builds on top of both, making development faster and simpler with reduced code.
