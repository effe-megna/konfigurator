package modelss.columns

import modelss.columns.abstractions.IColumn

data class KeyColumn(
        override val name: String,
        override val description: String
) : IColumn {
    override val type: IColumn.ColumnType = IColumn.ColumnType.Key

    override fun toString(): String {
        return "KeyColumn(name='$name', description='$description', type=$type)"
    }
}