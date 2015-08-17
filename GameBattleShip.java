
public class GameBattleShip {

	board = []

			for x in range(0, 5):
			    board.append(["O"] * 5)

			def print_board(board):
			    for row in board:
			        print " ".join(row)

			def random_row(board):
			    return randint(0, len(board) - 1)

			def random_col(board):
			    return randint(0, len(board[0]) - 1)


			ship_row = random_row(board)
			ship_col = random_col(board)



			running = True
			while running:
			    print_board(board)
			    guess_row = int(raw_input("Guess Row:")) - 1 #-1 in order to make rows numbered from 1 to 5 for the user
			    guess_col = int(raw_input("Guess Col:")) - 1 #-1 in order to make cols numbered from 1 to 5 for the user



			    if (guess_row < 0 or guess_row > 4) or (guess_col < 0 or guess_col > 4):
			        print "Error: index out of bounds"

			    elif guess_row == ship_row and guess_col == ship_col:
			        print "Congratulations! You sank my battleship!"
			        running = False
			    else:
			        print "You missed my battleship!"
			        board[guess_row][guess_col] = "X"`