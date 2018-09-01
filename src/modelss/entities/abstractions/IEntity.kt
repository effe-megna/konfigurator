package modelss.entities.abstractions

import modelss.columns.abstractions.IColumn
import modelss.rows.abstractions.IEntityRow

interface IEntity {
    val name: String
    val type: EntityType
    val description: String
    val columns: List<IColumn>
    val rowSelected: IEntityRow?
/*
    fun containColumn(key: String): Boolean
    fun getColumnByName(key: String): IColumn
    fun getColumnKey(): IColumn
*/
    fun selectRowByKey(key: String)

    enum class EntityType {
        List,
        String,
        Numeric,
        Boolean
    }
}