package models.abstractions

import modelss.properties.abstractions.Property

interface Entity {
    val name: String
    val type: EntityType
    val description: String?
    val properties: List<Property>
    val columns: List<Column>
    val rows: List<Row>
    val rowSelected: Row?

    fun containColumn(name: String): Boolean
    fun getColumnByName(name: String): Column

    enum class EntityType {
        List,
        String,
        Numeric,
        Boolean
    }
}

abstract class AbstractEntity : Entity {

    override fun containColumn(name: String): Boolean {
        var isContained = false

        columns.forEach {
            if (it.name == name)
                isContained = true
        }

        return isContained
    }

    override fun getColumnByName(name: String): Column {
        return columns.single { it.name == name }
    }

//    override val rowSelected: Row?
//        get() = rows.singleOrNull { it.isSelected }
//
//    fun selectRowByKey(name: String): Row {
//        val row = rows.singleOrNull { row ->
//            row.columns.single {
//                type == Column.ColumnType.Key
//            }.name == name
//        } ?: throw IllegalStateException("The row: $name does not exist")
//
//        return row.apply {
//            isSelected = true
//        }
//    }
}
