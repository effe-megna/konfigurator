package modelss.entities

import modelss.columns.abstractions.IColumn
import modelss.entities.abstractions.IEntity
import modelss.entities.abstractions.IListEntity
import modelss.rows.abstractions.IEntityRow

data class ListEntity(
        override val rows: List<IEntityRow>,
        override val name: String,
        override val description: String,
        override val columns: List<IColumn>
) : IListEntity {
    override val type: IEntity.EntityType = IEntity.EntityType.List

    override val rowSelected: IEntityRow?
        get() = rows.singleOrNull { it.isSelected }

    override fun selectRowByKey(key: String) {

    }
}