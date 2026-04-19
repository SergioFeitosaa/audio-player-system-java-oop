🎧 Audio Player System (Java OOP)

Backend project developed in Java to simulate an audio streaming system, applying Object-Oriented Programming concepts in a practical and structured way.

---

🚀 About the Project

This project was created as part of my transition from Law to Software Development, with the goal of strengthening my backend skills in Java.

The system simulates a simple audio platform where it is possible to:
- Play audios
- Like audios
- Track reproductions
- Automatically calculate classification based on engagement

---

🧠 Key Concepts Applied

This project focuses on applying core backend and OOP concepts in practice:

 ✅ Encapsulation
Sensitive data such as reproductions and likes are protected and can only be modified through controlled methods.

✅ Inheritance
The classes `Music` and `Podcast` extend a base class `Audio`, reusing common attributes and behaviors.

✅ Polymorphism
The `AudioPlayer` works with the generic type `Audio`, allowing it to handle both `Music` and `Podcast` without changing its implementation.

### ✅ Separation of Responsibilities
- `Audio` → Entity with business rules  
- `AudioPlayer` → Service layer responsible for controlling actions  
- `Main` → Orchestrates the application flow  

---

⚙️ Business Logic

The classification of each audio is calculated dynamically based on user engagement (likes), ensuring consistency and avoiding outdated data.

This approach avoids storing derived data and keeps the system reliable and clean.

---

💡 What I Learned

This project was a turning point in my learning process.

Instead of just studying theory or copying code, I was able to:

- Understand how OOP works in practice  
- Apply inheritance and polymorphism in a real scenario  
- Use objects as method parameters to create flexible systems  
- Separate business logic from execution flow  
- Refactor code to improve organization and readability  

One of the most important insights was learning how to centralize system behavior in a service layer (`AudioPlayer`), making the code more scalable and maintainable.

---

🏗️ Project Structure

model/
├── Audio.java
├── Music.java
└── Podcast.java

service/
└── AudioPlayer.java

main/
└── Main.java

---

 ▶️ How to Run

1. Clone the repository  
2. Open in your preferred IDE (IntelliJ recommended)  
3. Run the `Main` class  

---

📌 Future Improvements

- Add new audio types (e.g. Audiobooks)  
- Implement ranking based on reproductions + likes  
- Create a user interaction system  
- Integrate with a database (future backend evolution)  

---

## 👨‍💻 Author

Developed by Sérgio Feitosa Backend Java Developer.
