package modelss.rows.abstractions

import modelss.columns.KeyColumn

interface IRuleRow : IRow {
    val columns: List<KeyColumn>
    var isActive: Boolean
}