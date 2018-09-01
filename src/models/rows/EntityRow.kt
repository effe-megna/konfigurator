package models.rows

import models.abstractions.AbstractRow
import models.abstractions.Cell
import models.abstractions.Column
import models.abstractions.EntityRow
import models.abstractions.Selectable

data class EntityRow(
        override val index: Int,
        override val columns: List<Column>,
        override val cells: List<Cell>,
        override var isSelected: Boolean = false,
        override val keyColumn: Column = columns.single { it.type == Column.ColumnType.Key }
) : AbstractRow(), EntityRow, Selectable {

    override fun toString(): String {
        return super.toString()
    }
}

