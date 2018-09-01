package models

import models.abstractions.Cell
import models.abstractions.Entity
import models.abstractions.Rule

interface Engine {
    val entities: List<Entity>
    val rules: List<Rule>

    fun getEntity(name: String): Entity?
    fun getRule(name: String): Rule?
    fun executeRule(name: String)
}

class Kengine(
        override val entities: List<Entity>,
        override val rules: List<Rule>
) : Engine {
    override fun getEntity(name: String): Entity? {
        return entities.singleOrNull { it.name == name }
    }

    override fun getRule(name: String): Rule? {
        return rules.singleOrNull { it.name == name }
    }

    override fun executeRule(name: String) {
        getRule(name)?.run {



            /*val listsCells = rows.map { it.cells }

            listsCells.forEach { cells: List<Cell> ->
                cells.forEach { cell: Cell ->
                    apply {
                        entities.forEach {
                            if (it.containColumn(cell.columnName))

                        }
                    }
                }
            }*/
        } ?: throw IllegalStateException("The rule $name does not exist")
    }

    fun executeRule(rule: Rule) {
        val selectedRows = rule.entities.map { it.rowSelected }

        if (selectedRows.isEmpty())
            return
    }
}