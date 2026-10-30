# Circle Rotation Demo

A Java Swing application that demonstrates remote control of a graphical interface using TCP and UDP communication.

The application displays a circle whose rotation can be controlled by sending commands from a client. It uses a custom binary protocol and a reusable Java networking library to handle communication between the client and application.

## Features

- Graphical interface built with Java Swing
- Remote circle rotation through TCP and UDP commands
- Custom binary protocol for command processing
- Client-server communication using a reusable networking library
- Command parsing and response handling

## Technologies Used

- Java
- Java Swing
- TCP & UDP
- Socket Programming
- Apache Ant

## How to Run

**Requirements:** JDK 22 or later and Apache Ant.

The project includes `network-lib.jar` in the `lib` directory.

1. Clone the repository:

```bash
git clone https://github.com/dnzalparslan/circle-rotation-demo.git
cd circle-rotation-demo
```

2. Start the application:

```bash
ant run
```

3. In a separate terminal, start either client:

**TCP client:**
```bash
ant run-tcp-client
```

**UDP client:**
```bash
ant run-udp-client
```

4. Send commands from the client to control the circle.

For example, `goto 90` sends a rotation command.

## What I Learned

This project gave me hands-on experience integrating network communication with a graphical Java application. I explored how TCP and UDP clients exchange commands with an application, how binary messages are processed, and how different software components work together.

