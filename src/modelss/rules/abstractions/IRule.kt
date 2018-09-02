package modelss.rules.abstractions

import modelss.entities.abstractions.IEntity
import modelss.rows.abstractions.IRuleRow

interface IRule {
    val name: String
    val type: RuleType
    val entities: List<IEntity>
    val rows: List<IRuleRow>
    val activeRow: IRuleRow?

    fun executeWithStrategy(strategy: (row: IRuleRow, entities: List<IEntity>) -> Unit)
    fun execute()

    enum class RuleType {
        Decision,
        Validity
    }
}

