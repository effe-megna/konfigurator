package modelss.cells

import modelss.cells.abstractions.ICell

data class Cell(
        override val rowIndex: Int,
        override val columnName: String,
        override var value: Any
) : ICell {

    override fun toString(): String {
        return "Cell(rowIndex=$rowIndex, columnName='$columnName', value=$value)"
    }
}