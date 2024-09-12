package solid.dependecny_inversion.violation


class UserViewModel(
    private val database: Database
) {


    fun delete(id: String) = database.delete(id)
    fun create(data: String) = database.create(data)
    fun read(id: String): String? = database.read(id)

}