# Book My Stay App

The **Book My Stay App** demonstrates the design of a simple **Hotel Booking Management System** using **Core Java and fundamental data structures**.  
The project evolves through multiple use cases, gradually introducing object-oriented programming concepts and data structures to solve real-world problems such as inventory management, fair booking handling, and prevention of double booking.

---

# UC1: Application Entry & Welcome Message

### Goal
Provide a clear entry point for the application and display basic system information.

### Actor
User

### Flow
1. Program starts.
2. JVM invokes the `main()` method.
3. Application name and version are displayed.
4. Program exits or proceeds to the next use case.

### Key Concepts
- Class
- `main()` method
- `static` keyword
- Console output (`System.out.println`)
- Java program execution flow

---

# UC2: Basic Room Types & Static Availability

### Goal
Introduce object-oriented modeling using inheritance and abstraction.

### Actor
User

### Flow
1. Program starts.
2. Room objects are created.
3. Availability is stored using simple variables.
4. Room details are printed.

### Key Concepts
- Abstract class (`Room`)
- Inheritance (`SingleRoom`, `DoubleRoom`, `SuiteRoom`)
- Polymorphism
- Encapsulation
- Static availability representation

---

# UC3: Centralized Room Inventory Management

### Goal
Store room availability in a centralized structure using a data structure.

### Actor
System

### Flow
1. Inventory is initialized.
2. Room availability is stored in a centralized structure.
3. Services retrieve availability data from the inventory.

### Key Concepts
- `HashMap`
- Centralized state management
- Encapsulation
- Separation of domain objects and system state

### Data Structure
`HashMap<String, Integer>`  
(Key → Room Type, Value → Available Rooms)

---

# UC4: Room Search & Availability Check

### Goal
Allow users to view available rooms and their details.

### Actor
User

### Flow
1. User requests room search.
2. System retrieves availability from inventory.
3. Available room types and details are displayed.

### Key Concepts
- Service layer (`RoomSearchService`)
- HashMap lookup
- Conditional checks
- Object collaboration

---

# UC5: Booking Request Queue (FIFO)

### Goal
Ensure booking requests are processed in the order they are received.

### Actor
Guest / Booking System

### Flow
1. Guest submits booking request.
2. Reservation object is created.
3. Request is added to queue.
4. Requests are processed using FIFO order.

### Key Concepts
- Queue data structure
- FIFO processing
- `LinkedList` implementation
- Reservation objects

### Data Structure
`Queue<Reservation>`

---

# UC6: Reservation Confirmation & Room Allocation

### Goal
Confirm bookings by assigning rooms safely while preventing double booking.

### Actor
Booking Service

### Flow
1. Booking request is dequeued.
2. System checks room availability.
3. Unique room ID is generated.
4. Room is allocated.
5. Inventory is updated immediately.

### Key Concepts
- `Set` for unique room IDs
- `HashMap` to track allocated rooms
- Unique room allocation
- Inventory synchronization

### Data Structures
- `Set<String>`
- `Map<String, Set<String>>`
