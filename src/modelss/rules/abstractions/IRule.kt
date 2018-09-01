package modelss.rules.abstractions

import modelss.entities.abstractions.IEntity
import modelss.rows.abstractions.IRuleRow

interface IRule {
    val name: String
    val type: RuleType
    val entities: List<IEntity>
    val rows: List<IRuleRow>

    enum class RuleType {
        Decision,
        Validity
    }
}