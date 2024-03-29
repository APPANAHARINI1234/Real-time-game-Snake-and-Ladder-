# Snake and Ladder Game

This is a simple Snake and Ladder game implementation in Java.

## Project Requirements

1. Static board of size 10X10
2. Players (players can be in any number)

### Rules:

1. The game starts at position 0, and the player reaching the 100th position first wins.
2. The board contains snakes and ladders:
   - Ladders allow players to climb higher.
   - Snakes cause players to lose points and descend.
3. Each player takes turns rolling a dice. If a player rolls a 6, they get another chance.

## Classes Involved:

1. **Board Class (board package):**
   - Creates a static board of size 10X10.
   - Utilizes a map for mapping the locations of snakes and ladders.
   - Marks the snakes and ladders on the board.
   - `getBoardConfig()` method retrieves the current board configuration.

2. **Player Class (player package):**
   - Manages player details.
   - Tracks player position (`pos` variable).
   - `getDetails()` method provides player details.

3. **Logic Class (logic package):**
   - Implements the game logic.
   - Contains methods for moving players, handling snakes and ladders, and determining game outcomes.
   - Further details about the game logic can be found in the comments/documentation within the code.


