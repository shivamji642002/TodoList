# TodoList
spring themelive 
# Core Java Interview Questions (Hinglish Me)**
```java

---

### 🔹 **Q1: OOPs kya hota hai?**

➡ **Ans:**
OOP ka full form hai **Object-Oriented Programming**.
Iska matlab hota hai – hum apne program ko **objects** ke form me likhte hain.

🧠 **Real life:**
Soch – Car ek object hai. Uske paas data hai (color, speed) aur behavior hai (drive, brake).

---

### 🔹 **Q2: OOPs ke 4 main features kya hai?**

➡ **Ans:**

1. **Encapsulation** – Data ko chipka ke rakhna (wrap karna)
2. **Abstraction** – Sirf jarurat ka part dikhana, baki hide
3. **Inheritance** – Bache ko parent ke features milte hain
4. **Polymorphism** – Ek cheez kai tareeko se kaam kare

---

### 🔹 **Q3: Encapsulation kya hota hai?**

➡ **Ans:**
Jab hum data (variables) aur methods ko **ek hi class me rakhte hain** aur private banate hain — usko kehte hain **encapsulation**.

🔐 Matlab: direct access nahi milega, sirf methods se access hoga.

🧠 *Example:* ATM machine – andar ka logic nahi dikhata, sirf buttons dikhte hain.

---

### 🔹 **Q4: Abstraction kya hota hai?**

➡ **Ans:**
Abstraction matlab — **sirf important cheez dikhana, details chhupana**.

🧠 *Example:* Tu car drive karta hai — but tujhe engine ke andar kya ho raha, nahi pata. Bas steering, brake use karta hai.

---

### 🔹 **Q5: Inheritance kya hota hai?**

➡ **Ans:**
Ek class dusri class ke features use kar le — usko inheritance bolte hain.

📌 Java me `extends` keyword se hota hai.

🧠 *Example:*
Papa ki car beta bhi use kare — same kaam.

---

### 🔹 **Q6: Polymorphism kya hota hai?**

➡ **Ans:**
Jab **ek hi method alag alag tareeko se kaam kare** — usko polymorphism bolte hain.

**2 Types:**

* **Compile Time** – Method Overloading
* **Runtime** – Method Overriding

---

### 🔹 **Q7: Class aur Object me kya farak hai?**

➡ **Ans:**

* **Class** = Design / Blueprint (jaise ghar ka naksha)
* **Object** = Real cheez (jo naksha se banayi gayi)

🧠 *Example:* Car ka design = class, real car = object

---

### 🔹 **Q8: Kya bina class ke object ban sakta hai?**

➡ **Ans:**
Nahi! Java me **har object ko kisi class se banaya jata hai**.

---

### 🔹 **Q9: Constructor kya hota hai?**

➡ **Ans:**
Constructor ek special method hota hai **jo object bante time auto call hota hai**. Iska naam class ke naam jaisa hota hai, aur koi return type nahi hota.

---

### 🔹 **Q10: Kya constructor overload kar sakte hain?**

➡ **Ans:**
Haan! Tum **alag alag parameters** de ke multiple constructor bana sakte ho.

🧠 *Example:*

* `Student(String name)`
* `Student(String name, int age)`

========================================================================


### 🔹 **Q1: Java platform independent kyun kehlata hai?**

➡ **Ans:**
Java me likha gaya code **.class file** banne ke baad kisi bhi OS pe chal sakta hai.
Kyuki JVM (Java Virtual Machine) har OS ke liye alag hoti hai.

🧠 *Example:* Ek movie ka CD har DVD player me chale — bas player (JVM) chahiye.

---

### 🔹 **Q2: Java compiled language hai ya interpreted?**

➡ **Ans:**
Java **dono hai**:

* Pehle `.java` file compile hoti hai -> `.class` (Bytecode)
* Phir JVM us bytecode ko interpret karta hai

---

### 🔹 **Q3: Constructor aur method me kya difference hai?**

| Feature         | Constructor         | Method        |
| --------------- | ------------------- | ------------- |
| Naam            | Class ke naam jaisa | Koi bhi naam  |
| Return Type     | Nahi hota           | Hota hai      |
| Kab chalta hai? | Object bante hi     | Jab call karo |

---

### 🔹 **Q4: Default constructor kya hota hai?**

➡ **Ans:**
Agar tum **koi constructor nahi likhte**, to Java **khud ek constructor bana deta hai** — jisme koi parameter nahi hota.

```java
class Demo {
   // yeh khud banega:
   Demo() { }
}
```

---

### 🔹 **Q5: Static keyword kya karta hai?**

➡ **Ans:**
`static` ka matlab hota hai — **class level pe belong karna**.
Object banane ki zarurat nahi hoti.

🧠 *Example:*
College ka naam sab students ke liye same hota hai.

---

### 🔹 **Q6: Static variable vs instance variable?**

| Feature    | Static        | Instance           |
| ---------- | ------------- | ------------------ |
| Belongs to | Class         | Object             |
| Memory     | Ek hi copy    | Har object me alag |
| Access     | ClassName.var | obj.var            |

---

### 🔹 **Q7: Static method kya hoti hai?**

➡ **Ans:**
Jise bina object ke call kar sakte hain.

```java
class A {
   static void show() {
      System.out.println("Hello");
   }
}
A.show(); // Bina object ke
```

---

### 🔹 **Q8: Static block kya hota hai?**

➡ **Ans:**
`static {}` block Java me tab chalta hai **jab class load hoti hai**, sirf ek baar.

```java
static {
   System.out.println("Static block chal gaya");
}
```

---

### 🔹 **Q9: Final keyword kya karta hai?**

➡ **Ans:**

* **final variable** → Value change nahi hoti
* **final method** → Override nahi hoti
* **final class** → Inherit nahi hoti

```java
final int x = 10; // can't change x
```

---

### 🔹 **Q10: Java me main() method kyun static hota hai?**

➡ **Ans:**
Kyuki JVM ko program run karne ke liye **object nahi banana hota**.
Static hone ki wajah se JVM direct `main()` call kar sakta hai.

---

---

### 🔹 **Q1: `this` keyword kya hota hai Java me?**

➡ **Ans:**
`this` ek **reference hota hai current object ka**.

🧠 *Real Life:* Agar main bolun "Main Aditya hoon", to `main` = `this`.

```java
class Student {
  int id;
  Student(int id) {
    this.id = id; // left wala class ka, right wala parameter
  }
}
```

---

### 🔹 **Q2: Kab `this` keyword ka use karte hain?**

➡ **5 main use-cases:**

1. Current class ke instance variable ko refer karne ke liye
2. Current object ko return karne ke liye
3. Current class ke constructor ko call karne ke liye (`this()`)
4. Method ko call karne ke liye
5. As argument method me bhejne ke liye

---

### 🔹 **Q3: Constructor chaining kya hoti hai?**

➡ **Ans:**
Jab ek constructor dusre constructor ko call karta hai **same class me**, `this()` ka use karke — to use bolte hain constructor chaining.

```java
class A {
  A() {
    this(10); // call to another constructor
    System.out.println("Default constructor");
  }

  A(int x) {
    System.out.println("Parameterized: " + x);
  }
}
```

---

### 🔹 **Q4: `this()` and `super()` me kya fark hai?**

| `this()`                                    | `super()`                                     |
| ------------------------------------------- | --------------------------------------------- |
| Same class ke constructor ko call karta hai | Parent class ke constructor ko call karta hai |
| Ek hi class me use hota hai                 | Inheritance me use hota hai                   |
| First line me hona zaroori                  | First line me hona zaroori                    |

---

### 🔹 **Q5: Kya hum ek hi class me multiple constructors bana sakte hain?**

➡ **Ans:**
Haan! Isse kehte hain **constructor overloading**. Bas parameter alag-alag hone chahiye.

```java
class Car {
  Car() {}
  Car(String name) {}
  Car(String name, int speed) {}
}
```

---

### 🔹 **Q6: Object as parameter pass kar sakte hain method me?**

➡ **Ans:**
Haan, Java me hum **object ko method me argument ke form me pass kar sakte hain.**

```java
class A {
  int val;
  A(int val) {
    this.val = val;
  }
  void show(A obj) {
    System.out.println(obj.val);
  }
}
```

---

### 🔹 **Q7: Object return kar sakte hain method se?**

➡ **Ans:**
Bilkul! Java me hum method se object return bhi kar sakte hain.

```java
class A {
  A get() {
    return this;
  }
}
```

---

### 🔹 **Q8: Method overloading kya hota hai?**

➡ **Ans:**
Jab **ek hi method ka naam hota hai lekin parameters alag-alag hote hain**, use method overloading bolte hain.

```java
void add(int a, int b) {}
void add(float a, float b) {}
```

---

### 🔹 **Q9: Method overloading ka benefit kya hai?**

➡ **Ans:**
Code clean dikhta hai, readable hota hai, aur multiple kaam ek naam se ho sakta hai.

🧠 *Real life:* Ek mobile app me “Login” method – email se bhi, phone se bhi – dono se ho sakta hai.

---

### 🔹 **Q10: Can we overload `main()` method?**

➡ **Ans:**
Haan! Java me `main()` method overload ho sakta hai, lekin JVM **sirf `main(String[] args)`** wala hi call karta hai.

```java
public static void main(String[] args) {
   System.out.println("Main method");
}

public static void main(int x) {
   System.out.println("Overloaded main");
}
```

---

### 🔹 **Q1: Inheritance kya hota hai Java me?**

➡ **Ans:**
Inheritance ka matlab hota hai **ek class dusri class ke features use kar sakti hai**.
Java me `extends` keyword se hota hai.

🧠 *Real Life Example:*
Tumhare papa ki height tumhe mili — yahi hota hai inheritance.

```java
class Parent {
  void show() { System.out.println("Parent"); }
}
class Child extends Parent {
  void display() { System.out.println("Child"); }
}
```

---

### 🔹 **Q2: `super` keyword kya karta hai?**

➡ **Ans:**
`super` ka use hota hai **parent class ke members ya constructor** ko call karne ke liye.

```java
class A {
  A() { System.out.println("A ka constructor"); }
}
class B extends A {
  B() {
    super(); // parent constructor call
    System.out.println("B ka constructor");
  }
}
```

---

### 🔹 **Q3: `super()` aur `this()` me difference?**

| Feature        | `super()`                   | `this()`                  |
| -------------- | --------------------------- | ------------------------- |
| Call karta hai | Parent class ka constructor | Same class ka constructor |
| Use hota hai   | Inheritance me              | Constructor chaining me   |
| Line position  | Constructor ki pehli line   | Constructor ki pehli line |

---

### 🔹 **Q4: Method overriding kya hota hai?**

➡ **Ans:**
Jab **child class same method ko dobara likhti hai jo parent me bhi tha**, usse override kehte hain.

```java
class A {
  void show() { System.out.println("A"); }
}
class B extends A {
  void show() { System.out.println("B"); } // overriding
}
```

---

### 🔹 **Q5: Overloading vs Overriding?**

| Feature     | Overloading      | Overriding                             |
| ----------- | ---------------- | -------------------------------------- |
| Class       | Same class       | Parent-child classes                   |
| Method name | Same             | Same                                   |
| Parameters  | Different        | Same                                   |
| Return type | Can be different | Mostly same (Java 5+ allows covariant) |

---

### 🔹 **Q6: Overriding ke rules kya hain?**

➡ **Ans:**

* Method name + parameters same hone chahiye
* Access modifier same ya zyada public hona chahiye
* Checked exception kam ya same ho
* `private`, `final`, `static` methods override **nahi ho sakte**

---

### 🔹 **Q7: Dynamic method dispatch kya hota hai?**

➡ **Ans:**
Jab parent class ka reference child class ke object ko point karta hai **aur method run time pe decide hoti hai**, to use dynamic dispatch kehte hain.

```java
A obj = new B();
obj.show(); // B ka show() chalega, run-time pe decide hoga
```

🧠 *Real life:* Remote control se TV, AC dono chal sakte hain — but kaunsa chalega vo remote pe depend karega.

---

### 🔹 **Q8: `super.variable` kab use karte hain?**

➡ **Ans:**
Jab child class ka variable **parent ke variable ke naam ko shadow kar deta hai**, tab `super.var` se parent ka access hota hai.

```java
class A {
  int x = 10;
}
class B extends A {
  int x = 20;
  void show() {
    System.out.println(super.x); // 10
  }
}
```

---

### 🔹 **Q9: Java me multiple inheritance kyu nahi hoti (class se)?**

➡ **Ans:**
Kyuki **diamond problem** hoti hai — Java confuse ho jata hai ki kis class ka method call kare.

🧠 *Solution:* Java me **multiple inheritance interface ke through hoti hai**, na ki class ke through.

---

### 🔹 **Q10: Object creation ke time constructor call ka order kya hota hai?**

➡ **Ans:**
Jab object banta hai to **pehle parent class ka constructor** call hota hai, fir child ka.

```java
class A {
  A() { System.out.println("A"); }
}
class B extends A {
  B() { System.out.println("B"); }
}
B obj = new B();  // Output: A B
```
---

### 🔹 **Q1: Inheritance kya hota hai Java me?**

➡ **Ans:**
Inheritance ka matlab hota hai **ek class dusri class ke features use kar sakti hai**.
Java me `extends` keyword se hota hai.

🧠 *Real Life Example:*
Tumhare papa ki height tumhe mili — yahi hota hai inheritance.

```java
class Parent {
  void show() { System.out.println("Parent"); }
}
class Child extends Parent {
  void display() { System.out.println("Child"); }
}
```

---

### 🔹 **Q2: `super` keyword kya karta hai?**

➡ **Ans:**
`super` ka use hota hai **parent class ke members ya constructor** ko call karne ke liye.

```java
class A {
  A() { System.out.println("A ka constructor"); }
}
class B extends A {
  B() {
    super(); // parent constructor call
    System.out.println("B ka constructor");
  }
}
```

---

### 🔹 **Q3: `super()` aur `this()` me difference?**

| Feature        | `super()`                   | `this()`                  |
| -------------- | --------------------------- | ------------------------- |
| Call karta hai | Parent class ka constructor | Same class ka constructor |
| Use hota hai   | Inheritance me              | Constructor chaining me   |
| Line position  | Constructor ki pehli line   | Constructor ki pehli line |

---

### 🔹 **Q4: Method overriding kya hota hai?**

➡ **Ans:**
Jab **child class same method ko dobara likhti hai jo parent me bhi tha**, usse override kehte hain.

```java
class A {
  void show() { System.out.println("A"); }
}
class B extends A {
  void show() { System.out.println("B"); } // overriding
}
```

---

### 🔹 **Q5: Overloading vs Overriding?**

| Feature     | Overloading      | Overriding                             |
| ----------- | ---------------- | -------------------------------------- |
| Class       | Same class       | Parent-child classes                   |
| Method name | Same             | Same                                   |
| Parameters  | Different        | Same                                   |
| Return type | Can be different | Mostly same (Java 5+ allows covariant) |

---

### 🔹 **Q6: Overriding ke rules kya hain?**

➡ **Ans:**

* Method name + parameters same hone chahiye
* Access modifier same ya zyada public hona chahiye
* Checked exception kam ya same ho
* `private`, `final`, `static` methods override **nahi ho sakte**

---

### 🔹 **Q7: Dynamic method dispatch kya hota hai?**

➡ **Ans:**
Jab parent class ka reference child class ke object ko point karta hai **aur method run time pe decide hoti hai**, to use dynamic dispatch kehte hain.

```java
A obj = new B();
obj.show(); // B ka show() chalega, run-time pe decide hoga
```

🧠 *Real life:* Remote control se TV, AC dono chal sakte hain — but kaunsa chalega vo remote pe depend karega.

---

### 🔹 **Q8: `super.variable` kab use karte hain?**

➡ **Ans:**
Jab child class ka variable **parent ke variable ke naam ko shadow kar deta hai**, tab `super.var` se parent ka access hota hai.

```java
class A {
  int x = 10;
}
class B extends A {
  int x = 20;
  void show() {
    System.out.println(super.x); // 10
  }
}
```

---

### 🔹 **Q9: Java me multiple inheritance kyu nahi hoti (class se)?**

➡ **Ans:**
Kyuki **diamond problem** hoti hai — Java confuse ho jata hai ki kis class ka method call kare.

🧠 *Solution:* Java me **multiple inheritance interface ke through hoti hai**, na ki class ke through.

---

### 🔹 **Q10: Object creation ke time constructor call ka order kya hota hai?**

➡ **Ans:**
Jab object banta hai to **pehle parent class ka constructor** call hota hai, fir child ka.

```java
class A {
  A() { System.out.println("A"); }
}
class B extends A {
  B() { System.out.println("B"); }
}
B obj = new B();  // Output: A B
```

---

## 🧾 **Day 4 Summary Table (Quick Recap):**

| #  | Concept                   | Short Bhasha Me                        |
| -- | ------------------------- | -------------------------------------- |
| 1  | Inheritance               | Features lena                          |
| 2  | `super`                   | Parent ka pointer                      |
| 3  | Overriding                | Method dobara likhna                   |
| 4  | Overloading vs Overriding | Param change vs method replace         |
| 5  | Dynamic Dispatch          | Run-time method decision               |
| 6  | Constructor Order         | Pehle parent phir child                |
| 7  | `super.variable`          | Parent ka variable                     |
| 8  | No Multiple Inheritance   | Confusion se bachav                    |
| 9  | Overriding rules          | Signature same, access public ya zyada |
| 10 | `super()` vs `this()`     | Parent vs same class constructor call  |

---


```



























