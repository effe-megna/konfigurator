package models.columns

import models.abstractions.Column

data class BoolColumn(
        override val name: String,
        override val description: String
) : Column {
    override val type: Column.ColumnType = Column.ColumnType.Bool
}
