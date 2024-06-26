package org.kapablankanew.kotlin.course.tasks.one.interfaces

interface ReadableNode<T> : AbstractNode<T> {
    fun getValues(): Map<String, AbstractNode<T>>
}