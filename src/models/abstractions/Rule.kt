package models.abstractions

interface Rule {
    val name: String
    val type: RuleType
    val description: String
    val entities: List<Entity>
    val rows: List<RuleRow>

    fun execute()

    enum class RuleType {
        Decision,
        Validity
    }
}

abstract class AbstractRule : Rule {
    override fun toString(): String {
        return "DecisionRule(name='$name', type=$type, description='$description', entities=$entities, rows=$rows)"
    }
}