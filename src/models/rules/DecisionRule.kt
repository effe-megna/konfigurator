package models.rules

import models.abstractions.*

data class DecisionRule(
        override val name: String,
        override val description: String,
        override val entities: List<Entity>,
        override val rows: List<RuleRow>
) : AbstractRule() {

    override fun execute() {

    }

    override val type: Rule.RuleType = Rule.RuleType.Decision
}