package modelss

import modelss.entities.abstractions.IEntity
import modelss.rules.DecisionRule
import modelss.rules.abstractions.IRule

interface Engine {
    val entities: List<IEntity>
    val rules: List<IRule>

    fun getEntity(name: String): IEntity?
    fun getRule(name: String): IRule?
    fun executeDecisionRule(rule: DecisionRule)
}

class Kengine(
        override val entities: List<IEntity>,
        override val rules: List<IRule>
) : Engine {

    override fun getEntity(name: String): IEntity? = entities.singleOrNull{ it.name == name }

    override fun getRule(name: String): IRule? = rules.singleOrNull { it.name == name }

    override fun executeDecisionRule(rule: DecisionRule) {

    }
}