class ClientsController {
    private val printer = Printer()
    private val clientList = mutableListOf<Customer>()

    fun registerCustomer() {
        printer.printMsg("Ingrese los nombres")
        val names = readln()
        printer.printMsg("Ingrese el primer apellido")
        val firstLastName = readln()
        printer.printMsg("Ingrese el segundo apellido")
        val secondLastName = readln()
        printer.printMsg("Ingrese el RFC")
        val rfc = readln()
        printer.printMsg("Ingrese la dirección")
        val address = readln()

        val addedCustomer = Customer(names, firstLastName, secondLastName, rfc, address)

        clientList.add(addedCustomer)
    }

    fun showCustomers() {
        if (clientList.isEmpty()) {
            printer.printMsg("No se encuentran clientes registrados")
        } else {
            var counter = 1
            for (customer in clientList) {
                printer.printMsg("$counter-" + customer.getCustomerData())
                counter++
            }
        }
    }

    fun getCustomerByIndex(index: Int): Customer = clientList[index]

    fun areNotClientsRegistered(): Boolean = clientList.isEmpty()
}