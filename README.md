# ⚖️ LegalAid - Legal Support Management System

LegalAid is a web-based platform designed to streamline legal assistance services by connecting **citizens**, **lawyers**, and **admins** through a centralized system. Built using **Spring MVC**, **Hibernate**, and **JSP/HTML/CSS**, it offers an intuitive interface for managing legal cases, appointments, and users.

---

## 🚀 Features

### 👨‍💼 Admin Panel
- Register and manage lawyers
- View all citizens and their case requests
- Monitor appointments between lawyers and citizens

### 👩‍⚖️ Lawyer Panel
- View case requests submitted by citizens
- Accept/reject cases and schedule appointments
- Track assigned cases and manage appointments

### 👥 Citizen Panel
- Submit new case requests
- Track status of legal requests
- View scheduled appointments with lawyers

---

## 🛠️ Tech Stack

| Layer               | Technology/Component                   |
| ------------------- | -------------------------------------- |
| Backend             | Java, Spring MVC, Hibernate            |
| Frontend            | JSP, HTML, CSS                         |
| Database            | MySQL                                  |
| ORM Framework       | Hibernate                              |
| Dispatcher Servlet  | `spring-servlet.xml` (Spring MVC Core) |
| Configuration Files | `web.xml`, `config.xml`                |
| Architecture        | MVC (Model-View-Controller)            |
| Build Tool          | Maven                                  |
| Server              | Apache Tomcat                          |


---

## 📸 Screenshots

> *(You can add actual screenshots here once uploaded to `/screenshots` or use markdown image links)*

- Citizen case request form  
- Lawyer appointment dashboard  
- Admin panel for managing users

---

## 📁 Project Structure

LegalAid/
├── src/
│   ├── controller/            
│   ├── model/                 
│   ├── dao/                   
│   ├── service/               
│   ├── config/
│   │   ├── spring-servlet.xml  
│   │   └── config.xml          
├── WebContent/
│   ├── jsp/                   
│   ├── css/                    
│   └── WEB-INF/
│       └── web.xml             
├── pom.xml                    
└── README.md                 

