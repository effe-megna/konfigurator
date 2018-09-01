package modelss.rows.abstractions

import modelss.columns.KeyColumn
import modelss.columns.abstractions.IColumn

interface IEntityRow : IRow {
    val columns: List<IColumn>
    val isSelected: Boolean
    val keyColumn: KeyColumn
}