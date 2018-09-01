package models.columns

import models.abstractions.Column

data class NumericColumn(
        override val name: String,
        override val description: String
) : Column {
    override val type: Column.ColumnType = Column.ColumnType.Numeric
}