package modelss.rows

import modelss.columns.KeyColumn
import modelss.cells.abstractions.ICell
import modelss.columns.abstractions.IColumn
import modelss.rows.abstractions.IEntityRow

data class EntityRow(
        override val index: Int,
        override val cells: List<ICell>,
        override val columns: List<IColumn>
) : IEntityRow {
    override val key: String = getKeyCell().value as String

    override var isSelected: Boolean = false
        set(value) {
            if (field != value)
                field = value
        }

    override val keyColumn: KeyColumn = columns.single { it.type == IColumn.ColumnType.Key } as KeyColumn

    override fun getKeyCell(): ICell = cells.single { it.isKey }

    override fun toString(): String {
        return "EntityRow(index=$index, cells=$cells, columns=$columns, isSelected=$isSelected, key='$key', keyColumn=$keyColumn)"
    }
}

