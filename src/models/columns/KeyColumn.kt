package models.columns

import models.abstractions.Column

data class KeyColumn(
        override val name: String,
        override val description: String
) : Column {
    override val type: Column.ColumnType = Column.ColumnType.Key

    override fun toString(): String {
        return "KeyColumn(name='$name', description='$description', type=$type)"
    }
}