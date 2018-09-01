package models.abstractions

interface Row {
    val index: Int
    val columns: List<Column>
    val cells: List<Cell>
}

interface EntityRow {
    val keyColumn: Column
}

interface RuleRow {

}

abstract class AbstractRow : Row {
    override fun toString(): String {
        return "DefaultRow(index=$index, columns=$columns, cells=$cells)"
    }
}