package solid.dependecny_inversion.violation


class Database {
    fun delete(id: String) {}
    fun create(data: String) {}
    fun read(id: String): String? = null
}