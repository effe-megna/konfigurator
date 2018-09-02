package modelss.rules.abstractions

import modelss.entities.abstractions.IEntity
import modelss.rows.abstractions.IRuleRow

abstract class AbstractRule : IRule {
    override fun executeWithStrategy(strategy: (row: IRuleRow, entities: List<IEntity>) -> Unit) {
        rows.forEach { row ->
            row.cells.forEach { cell ->
                entities.map { entity ->
                    entity.rowSelected?.run {
                        if (cell.value == this.getKeyCell().value)
                            strategy(row, entities)
                    }
                }
            }
        }
    }
}