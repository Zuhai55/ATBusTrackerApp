# Auckland Transport Bus Tracking System

A Java Swing desktop application simulating a real-time bus tracking system for Auckland Transport. Built as part of a software engineering assignment at the University of Auckland.

## Screenshots

> Add a screenshot of the running GUI here

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

1. Clone the repository
```bash
git clone https://github.com/Zuhai55/AT-BusTracker.git
```
2. Open the project in IntelliJ IDEA
3. Run `MainFrame.java` — the GUI will launch automatically with demo data

## Author

Hairi — University of Auckland, BSc Computer Science & Information Technology Management
