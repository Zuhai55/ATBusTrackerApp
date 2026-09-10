# Auckland Transport Bus Tracking System

A Java Swing desktop application simulating a real-time bus tracking system for Auckland Transport. Built as part of an Object Oriented Software Development assignment at the University of Auckland.

## Screenshots

<img width="981" height="586" alt="atproject" src="https://github.com/user-attachments/assets/142327b3-ebb5-4d97-a9dd-1a6f75f9f1aa" />


## Features

- Real-time bus arrival notifications via the **Observer pattern**
- Hierarchical bus stop and hub structure using the **Composite pattern**
- Swing `JList` integration via the **Adapter pattern** (`BusStop` wraps `BusStopLeaf`)
- Three live-updating tables showing bus details, ETA messages, and hub dwell times
- Stop list panel that updates based on the selected bus
- Driver assignment validation (maximum 3 buses per driver)

## Design Patterns

| Pattern | Where Used |
|---|---|
| Observer | `BusTracker` (Observable) notifies `Passenger` and `MainFrame` (Observers) of arrival updates |
| Composite | `RouteComponent` → `BusStopLeaf` (leaf) and `StopGroupComposite` (composite) form a stop hierarchy |
| Adapter | `BusStop` adapts `BusStopLeaf` for use in the Swing `JList` |
| Dependency Inversion | `TransportManager` depends on the `Assignable` interface, not a concrete class |

## Tech Stack

- **Language:** Java
- **GUI:** Java Swing (`JTable`, `JList`, `AbstractTableModel`, `AbstractListModel`)
- **Patterns:** Observer, Composite, Adapter, Dependency Inversion Principle

## Project Structure

```
src/bustracker/
├── Assignable.java          # Interface for driver assignment (DIP)
├── Bus.java                 # Core bus entity
├── BusAssignable.java       # Implements Assignable for Bus
├── BusStop.java             # Adapter wrapping BusStopLeaf for Swing
├── BusStopLeaf.java         # Leaf node in the Composite hierarchy
├── BusTracker.java          # Observable — fires arrival notifications
├── Driver.java              # Driver entity (max 3 buses)
├── EtaTableModel.java       # Custom AbstractTableModel for ETA table
├── MainFrame.java           # Main Swing GUI — also an Observer
├── Passenger.java           # Observer — receives arrival updates
├── RouteComponent.java      # Abstract base for Composite hierarchy
├── StopGroupComposite.java  # Composite node — groups stops/hubs
├── StopListModel.java       # Custom AbstractListModel for JList
└── TransportManager.java    # Uses Assignable interface (DIP example)
```

## OOP Principles Applied

- **Encapsulation** — all fields are private with controlled access via getters/setters
- **Inheritance** — `Bus`, `BusStopLeaf`, `StopGroupComposite` extend abstract base classes
- **Polymorphism** — `RouteComponent` references used for both leaves and composites
- **Abstraction** — interfaces and abstract classes define contracts without implementation detail

## How to Run

**Prerequisites:** Java 11 or higher installed on your machine.

### Option 1 — Terminal
```bash
# Clone the repo
git clone https://github.com/Zuhai55/AT-BusTracker.git
cd AT-BusTracker

# Compile
javac -d out src/bustracker/*.java

# Run
java -cp out bustracker.MainFrame
```

### Option 2 — IntelliJ IDEA
1. Open IntelliJ → **File → Open** → select the project folder
2. Right click `MainFrame.java` → **Run 'MainFrame.main()'**

### Option 3 — Eclipse
1. Open Eclipse → **File → Import → Existing Projects into Workspace** → select the project folder
2. Right click `MainFrame.java` → **Run As → Java Application**

### Option 4 — VS Code
1. Install the [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
2. Open the project folder in VS Code
3. Open `MainFrame.java` and click **Run** above the `main` method

## Author

Hairi — University of Auckland, BSc Computer Science & Information Technology Management
