package models.abstractions

interface Cell {
    val columnName: String
    val value: Any
}

abstract class AbstractCell : Cell {
    override fun toString(): String {
        return "NumericCell(columnName='$columnName', value=$value)"
    }
}
