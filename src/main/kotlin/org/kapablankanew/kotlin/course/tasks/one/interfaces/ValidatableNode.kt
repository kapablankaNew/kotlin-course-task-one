package org.kapablankanew.kotlin.course.tasks.one.interfaces

interface ValidatableNode<T> : AbstractNode<T> {
    fun isValid(): Boolean
}