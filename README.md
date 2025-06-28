# Pong Game (Java Swing)

Welcome to **Pong Game**, a classic two-player arcade game recreated using Java Swing. Experience fast-paced paddle action, precise collision physics, and competitive gameplay right on your desktop!

## Table of Contents

1. [Project Overview](#project-overview)
2. [Features](#features)
3. [Installation and Setup](#installation-and-setup)
4. [Running the Game](#running-the-game)
5. [Controls](#controls)
6. [Code Structure](#code-structure)
7. [Game Flow](#game-flow)
8. [Assets](#assets)
9. [Screenshots](#screenshots)
10. [Future Enhancements](#future-enhancements)
11. [License](#license)

## Project Overview

This project is a Java Swing implementation of the timeless Pong game, where two players control paddles on opposite sides of the screen and volley a ball back and forth. The game features smooth animations, scorekeeping, and a launch screen to start the action.

## Features

* **Two-Player Mode:** Competitive gameplay for two users on the same machine.
* **Accurate Collision Detection:** The ball bounces realistically off paddles and borders.
* **Score Tracking:** Points are awarded when the opponent misses the ball.
* **Launch Screen:** Intro panel with game logo before play begins.
* **Customizable Window:** Adjustable window size and background imagery.
* **Clean Code Architecture:** Separation of concerns using distinct classes for game components.

## Installation and Setup

1. **Prerequisites**

   * Java Development Kit (JDK) 8 or above installed.
   * Optional: [Visual Studio Code](https://code.visualstudio.com/) with Java extensions.

2. **Clone the Repository**

   ```bash
   git clone https://github.com/<your-username>/pong-java-swing.git
   cd pong-java-swing
   ```

3. **Project Structure**

   ```
   pong-java-swing/
   ├── src/                # Java source code and assets
   │   ├── Ball.java
   │   ├── GameFrame.java
   │   ├── GamePanel.java
   │   ├── LaunchPage.java
   │   ├── LaunchPanel.java
   │   ├── Paddle.java
   │   ├── PongGame.java   # Main class
   │   ├── Score.java
   │   └── assets/         # Images (space.jpg, logos)
   ├── bin/                # Compiled .class files
   ├── .vscode/            # VSCode settings (optional)
   └── README.md           # Project documentation
   ```

## Running the Game

1. **Compile Source Files**

   ```bash
   javac -d bin src/*.java
   ```
2. **Launch Application**

   ```bash
   java -cp bin PongGame
   ```

## Controls

| Player   | Move Up        | Move Down        |
| -------- | -------------- | ---------------- |
| Player 1 | `W` key        | `S` key          |
| Player 2 | Up Arrow (`↑`) | Down Arrow (`↓`) |

## Code Structure

* **PongGame.java**: Entry point; initializes the `LaunchPage` and starts the game loop.
* **LaunchPage.java & LaunchPanel.java**: Display the welcome screen and handle the transition to gameplay.
* **GameFrame.java**: Sets up the main application window and properties.
* **GamePanel.java**: Core game loop, painting, and event handling (key listeners).
* **Ball.java**: Manages ball position, movement, and collision logic.
* **Paddle.java**: Represents each player's paddle; handles movement constraints.
* **Score.java**: Tracks and renders score for both players.

## Game Flow

1. **Launch Screen**: User sees game logo and instructions.
2. **Start Game**: Press any key to begin; game loop in `GamePanel` activates.
3. **Gameplay**: Ball moves; players control paddles to rally.
4. **Scoring**: When the ball passes a paddle, the opposing player scores a point.
5. **Continue or Restart**: Game continues indefinitely; close window to exit.

## Assets

All images used in the game (backgrounds, logos) are located under `src/assets/`. Feel free to replace these with your own themed graphics.

## Screenshots

*Below are sample screenshots. Replace these with your own captures.*

![Launch Screen](src/assets/launchLogo.png)

![Gameplay](src/assets/space.jpg)

## Future Enhancements

* Add single-player AI opponent with adjustable difficulty.
* Implement pause menu and restart functionality.
* Sound effects and background music.
* Configurable settings (speed, paddle size).
* Score limit and win condition handling.

## License

This project is released under the MIT License. See [LICENSE](LICENSE) for details.
