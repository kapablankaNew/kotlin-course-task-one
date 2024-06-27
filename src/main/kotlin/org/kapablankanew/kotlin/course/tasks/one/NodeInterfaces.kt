package org.kapablankanew.kotlin.course.tasks.one

interface AbstractNode<T> {
    fun getPathsToLeafs(): Map<List<String>, T>
}

interface CalculableNode<T> : AbstractNode<T> {
    fun calculate(value: T): Number
}

interface ReadableNode<T> : AbstractNode<T> {
    fun getValues(): Map<String, AbstractNode<T>>
}

interface ValidatableNode<T> : AbstractNode<T> {
    fun isValid(): Boolean
}