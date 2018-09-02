package modelss.rows.abstractions

import modelss.cells.abstractions.ICell
import modelss.columns.KeyColumn
import modelss.columns.abstractions.IColumn

interface IEntityRow : IRow {
    val key: String
    val columns: List<IColumn>
    var isSelected: Boolean
    val keyColumn: KeyColumn

    fun getKeyCell(): ICell
}