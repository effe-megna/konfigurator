package modelss.rows

import modelss.cells.abstractions.ICell
import modelss.columns.KeyColumn
import modelss.rows.abstractions.IRuleRow

data class RuleRow(
        override val index: Int,
        override val cells: List<ICell>,
        override val columns: List<KeyColumn>,
        override var isActive: Boolean
) : IRuleRow {

    override fun toString(): String {
        return "RuleRow(index=$index, cells=$cells, columns=$columns, isActive=$isActive)"
    }
}