package org.kapablankanew.kotlin.course.tasks.one.impl

import org.kapablankanew.kotlin.course.tasks.one.interfaces.AbstractNode

open class MutableNode<T> (
    children: MutableMap<String, AbstractNode<T>> = mutableMapOf()
) : ImmutableNode<T>(children) {

    override val children: MutableMap<String, AbstractNode<T>>
        get() {
            return (_children as MutableMap<String, AbstractNode<T>>)
        }

    fun addChild(key: String, child: AbstractNode<T>) {
        checkChild(child)
        children[key] = child
    }
}