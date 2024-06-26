package org.kapablankanew.kotlin.course.tasks.one.impl

import org.kapablankanew.kotlin.course.tasks.one.interfaces.AbstractNode
import org.kapablankanew.kotlin.course.tasks.one.interfaces.ValidatableNode
import java.lang.IllegalArgumentException

open class ImmutableNode<T> (
    children: Map<String, AbstractNode<T>> = mapOf()
) : AbstractNode<T> {

    protected val _children: Map<String, AbstractNode<T>>

    open val children: Map<String, AbstractNode<T>>
        get() {
            return _children
        }

    init {
        checkChildren(children)
        _children = children
    }

    override fun convertSubTreeToMap(): Map<MutableList<String>, T> {
        val result = mutableMapOf<MutableList<String>, T>()
        children.forEach { (key, value) ->
            value.convertSubTreeToMap().entries
                .onEach { it.key.add(key) }
                .forEach { result[it.key] = it.value }

        }
        return result
    }

    private fun checkChildren(children: Map<String, AbstractNode<T>>) {
        children.values.onEach {
            checkChild(it)
        }
    }

    protected fun checkChild(child: AbstractNode<T>) {
        if (child is Leaf) return
        val childrenClass = child.javaClass
        val currentClass = this.javaClass
        if (!currentClass.isAssignableFrom(childrenClass))
            throw IllegalArgumentException("Child is not subclass of parent!")
        if (child is ValidatableNode && !child.isValid())
            throw IllegalArgumentException("Child is not valid!")
    }
}