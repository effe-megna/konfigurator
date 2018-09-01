package models.columns

import models.abstractions.Column

data class StringColumn(
        override val name: String,
        override val description: String
) : Column {
    override val type: Column.ColumnType = Column.ColumnType.String
}