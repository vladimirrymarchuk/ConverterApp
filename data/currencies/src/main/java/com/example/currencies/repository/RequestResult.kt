package com.example.currencies.repository

sealed class RequestResult<E>(open val data: E? = null) {

//    class InProgress<E : Any>(
//        data: E? = null,
//    ) : RequestResult<E>(data)

    class Success<E : Any>(
        override val data: E,
    ) : RequestResult<E>(data)

    class Error<E : Any>(
        data: E? = null,
    ) : RequestResult<E>(data)
}

fun <T : Any> Result<T>.toRequestResult(): RequestResult<T> = when {
    isSuccess -> RequestResult.Success(data = getOrThrow())
    else -> RequestResult.Error()
}
