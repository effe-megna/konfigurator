package modelss.entities.abstractions

import modelss.columns.abstractions.IColumn
import modelss.rows.EntityRow
import modelss.rows.abstractions.IEntityRow

interface IEntity {
    val name: String
    val type: EntityType
    val description: String
    val columns: List<IColumn>
    val rowSelected: IEntityRow?

    fun getRowByKey(key: String): IEntityRow?
    fun deselectRows()

    enum class EntityType {
        List,
        String,
        Numeric,
        Boolean
    }
}