package models.rows

import models.abstractions.AbstractRow
import models.abstractions.Cell
import models.abstractions.RuleRow
import models.columns.KeyColumn

data class RuleRow(
        override val index: Int,
        override val columns: List<KeyColumn>,
        override val cells: List<Cell>
) : AbstractRow(), RuleRow