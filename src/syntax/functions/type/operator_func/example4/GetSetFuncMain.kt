package syntax.functions.type.operator_func.example4

fun main(args: Array<String>) {
    val board = ChessBoard()

    // operator fun set()
    board[0, 4] = Piece.Queen

    // operator fun get()
    println(board[0, 4])
}

enum class Piece {
    Empty, Pawn, Bishop, Knight, Rook, Queen, King
}

class ChessBoard {
    private val board = Array<Piece>(64, { Piece.Empty })
    operator fun get(rank: Int, file: Int): Piece = board[file * 8 + rank]
    operator fun set(rank: Int, file: Int, value: Piece): Unit {
        board[file * 8 + rank] = value
    }
}