package modelss.rows

import modelss.columns.KeyColumn
import modelss.cells.abstractions.ICell
import modelss.columns.abstractions.IColumn
import modelss.rows.abstractions.IEntityRow

data class EntityRow(
        override val index: Int,
        override val cells: List<ICell>,
        override val columns: List<IColumn>,
        override val isSelected: Boolean
) : IEntityRow {
    override val keyColumn: KeyColumn = columns.single { it.type == IColumn.ColumnType.Key } as KeyColumn

    override fun toString(): String {
        return "EntityRow(index=$index, cells=$cells, columns=$columns, isSelected=$isSelected, keyColumn=$keyColumn)"
    }
}

