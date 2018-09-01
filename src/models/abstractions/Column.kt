package models.abstractions

interface Column {
    val name: String
    val type: ColumnType
    val description: String

    enum class ColumnType {
        Key,
        String,
        Numeric,
        Bool
    }
}