package modelss.entities

import modelss.columns.abstractions.IColumn
import modelss.entities.abstractions.IEntity
import modelss.entities.abstractions.IStringEntity
import modelss.rows.abstractions.IEntityRow

data class StringEntity(
        override val row: IEntityRow,
        override val name: String,
        override val description: String,
        override val columns: List<IColumn>
) : IStringEntity {
    override fun deselectRows() {
        if (row.isSelected)
            row.isSelected = false
    }

    override fun getRowByKey(key: String): IEntityRow? = if (row.key == key) row else null

    override fun selectRowByKey(row: IEntityRow) {
        row.isSelected = true
    }

    override val type: IEntity.EntityType = IEntity.EntityType.String

    override val rowSelected: IEntityRow?
        get() = if (row.isSelected) row else null
}

