# Lab: AI Pathfinding for a Maze (Using ArrayLists)

## Objective

In this lab, students will implement an AI to navigate a text-based maze using ArrayLists to store and optimize paths. The goal is to use algorithmic thinking to develop an efficient pathfinding solution.

## Learning Outcomes
- Utilize ArrayLists to store and manipulate paths.
- Implement basic pathfinding using depth-first search (DFS) or breadth-first search (BFS).
- Develop an algorithm to find the shortest path.
- Gain experience with nested loops and conditionals.

## Scenario: AI Maze Solver

You are developing an AI system for a simple text-based maze game. The AI must navigate through the maze from start to finish using an optimized path.

### Rules:
- The maze is a 2D grid stored as a 2D int array.
- 0 represents an open path, and 1 represents a wall.
- The AI starts at (0,0) and must reach (rows-1, cols-1).
- The AI can move up, down, left, or right (no diagonals).
- The path must be stored in an ArrayList of coordinates.
- The AI should print the sequence of moves it takes to reach the exit.

## Example Maze (5x5 Grid)

> 0 1 0 0 0  
0 1 0 1 0  
0 0 0 1 0  
1 1 0 1 0  
0 0 0 0 0 

## Example AI Output

> Start: (0,0)  
Move to: (1,0)  
Move to: (2,0)  
Move to: (2,1)  
Move to: (2,2)  
Move to: (3,2)  
Move to: (4,2)  
Move to: (4,3)  
Move to: (4,4)  
Reached exit!

## Lab Tasks
### ✅ Task 1: Understand the Starter Code
- What does the solveMaze function do?
- How does the ArrayList store the path?

### ✅ Task 2: Modify the Algorithm
- Right now, the AI follows the first path it finds (DFS). Modify the algorithm to use BFS (breadth-first search) to find the shortest path.

              DFS                     BFS
               A                       A
              / \                     / \
             B   C                   B   C
            /   / \                 /   / \
           D   E   F               D   E   F
        A, B, D, C, E, F  -vs-  A, B, C, D, E, F

### ✅ Task 3: Count the Steps
- Modify the program to display the total number of steps taken by the AI.

### ✅ Task 4: Find the Nearest Exit (Challenge Task)
- Instead of a single exit, place multiple exits and modify the AI to find the closest one.

### ✅ Bonus: Make It Interactive!
- Modify the program so the user can input a custom maze at runtime.

## Wrap-Up Questions
- How does an ArrayList help with tracking the AI’s movement?
- What are the advantages of BFS over DFS in this scenario?
- What challenges did you face when modifying the algorithm?