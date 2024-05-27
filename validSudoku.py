class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:

        # converting board to a board with only numbers
        onlyNumbers = []
        subBoxes = []

        for row in board:
            onlyNumbers.append([])
            subBoxes.append([])

        for i in range (len(board)):
            for j in range (len(board[i])):
                if (board[i][j].isnumeric()):
                    onlyNumbers[i].append(board[i][j])

        # duplicate numbers in row check
        for row in onlyNumbers:
            if (len(set(row)) != len(row)):
                return False
        
        # duplicate numbers in column check
        for i in range (len(board)):
            if (i + 1 == len(board)):
                break

            for j in range (len(board[i])):
                for k in range (i + 1, len(board)):
                    if (board[i][j].isnumeric() and board[k][j].isnumeric() and board[i][j] == board[k][j]):
                        return False

        
        # duplicate numbers in sub-box check
        counter = 0
        for i in range (0, len(board), 3):
            for j in range (0, len(board[i]), 3):
                subBoxes[counter].append(board[i][j:j+3])
                subBoxes[counter].append(board[i+1][j:j+3])
                subBoxes[counter].append(board[i+2][j:j+3])
                counter += 1

        newBoard = []

        for i in range(len(subBoxes)):
            for j in range(len(subBoxes[i])):
                newList = subBoxes[i][j] + subBoxes[i][j + 1] + subBoxes[i][j+2]
                newBoard.append(newList)
                break

        finalResult = []

        for i in newBoard:
            finalResult.append([])
        
        for i in range(len(newBoard)):
            for j in range(len(newBoard[i])):
                if (newBoard[i][j].isnumeric()):
                    finalResult[i].append(newBoard[i][j])
        
        for i in finalResult:
            if (len(set(i)) != len(i)):
                return False
        
        print(finalResult)
            
            
        return True