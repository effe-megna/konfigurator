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
    override val type: IEntity.EntityType = IEntity.EntityType.String

    override val rowSelected: IEntityRow?
        get() = if (row.isSelected) row else null
}

