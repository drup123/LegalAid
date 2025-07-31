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

<img width="1919" height="860" alt="Screenshot 2025-07-29 010511" src="https://github.com/user-attachments/assets/d273e56f-a05b-4485-a0d9-ccc4f089bde0" />
<img width="1919" height="868" alt="Screenshot 2025-07-29 010528" src="https://github.com/user-attachments/assets/3e6f2954-e36f-413f-af1b-b51bb95a9b01" />
<img width="1919" height="851" alt="Screenshot 2025-07-29 010755" src="https://github.com/user-attachments/assets/a26bf1e9-d821-4452-8925-99d8bb6b2edd" />
<img width="1919" height="858" alt="Screenshot 2025-07-29 011017" src="https://github.com/user-attachments/assets/ce0f4479-cad9-411f-93d4-0d2aeb4a862d" />
<img width="1919" height="816" alt="Screenshot 2025-07-29 011135" src="https://github.com/user-attachments/assets/0367cea0-4c23-4c41-818e-bb65c2ecfeb5" />

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

