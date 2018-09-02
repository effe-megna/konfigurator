package modelss.entities

import modelss.columns.abstractions.IColumn
import modelss.entities.abstractions.IEntity
import modelss.entities.abstractions.IListEntity
import modelss.rows.abstractions.IEntityRow

data class ListEntity(
        override val name: String,
        override val description: String,
        override val columns: List<IColumn>,
        override val rows: List<IEntityRow>
) : IListEntity {

    override val type: IEntity.EntityType = IEntity.EntityType.List

    override val rowSelected: IEntityRow?
        get() = rows.singleOrNull { it.isSelected }

    override fun getRowByKey(key: String): IEntityRow? = rows.singleOrNull { it.key == key }

    override fun deselectRows() {
       rows.forEach {
           if (it.isSelected)
               it.isSelected = false
       }
    }

    override fun selectRowByKey(row: IEntityRow) {

    }
}