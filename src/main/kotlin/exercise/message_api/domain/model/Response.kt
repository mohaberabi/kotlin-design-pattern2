package exercise.message_api.domain.model


data class Response(
    val data: String,
    val status: Int,
    val error: String,
    val headers: Map<String, String>,
) {
    class Builder {
        private var data = ""
        private var status = 400
        private var error = ""
        private var headers = mapOf<String, String>()
        fun data(data: String) = apply { this.data = data }
        fun status(status: Int) = apply { this.status = status }
        fun error(error: String) = apply { this.error = error }
        fun headers(headers: Map<String, String>) = apply { this.headers = headers }
        fun build() = Response(
            data,
            status,
            error,
            headers,
        )
    }
}




