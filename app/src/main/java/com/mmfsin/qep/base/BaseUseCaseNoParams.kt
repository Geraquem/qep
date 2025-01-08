package com.mmfsin.qep.base

abstract class BaseUseCaseNoParams<T> {
    abstract suspend fun execute(): T
}