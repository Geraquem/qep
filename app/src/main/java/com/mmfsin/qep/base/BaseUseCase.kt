package com.mmfsin.qep.base

abstract class BaseUseCase<params, T> {
    abstract suspend fun execute(params: params): T
}