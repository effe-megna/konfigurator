package modelss.rules

import modelss.entities.abstractions.IEntity
import modelss.rows.abstractions.IRuleRow
import modelss.rules.abstractions.IRule

data class DecisionRule(
        override val name: String,
        override val entities: List<IEntity>,
        override val rows: List<IRuleRow>
) : IRule {
    override val type: IRule.RuleType = IRule.RuleType.Decision

    override fun toString(): String {
        return "DecisionRule(name='$name', entities=$entities, rows=$rows, type=$type)"
    }
}