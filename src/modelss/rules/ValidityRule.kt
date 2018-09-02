package modelss.rules

import modelss.entities.abstractions.IEntity
import modelss.rows.abstractions.IRuleRow
import modelss.rules.abstractions.AbstractRule
import modelss.rules.abstractions.IRule

class ValidityRule(
        override val name: String,
        override val entities: List<IEntity>,
        override val rows: List<IRuleRow>
) : AbstractRule() {
    override val activeRow: IRuleRow?
        get() = rows.single { it.isActive }

    override fun execute() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override val type: IRule.RuleType = IRule.RuleType.Validity
}