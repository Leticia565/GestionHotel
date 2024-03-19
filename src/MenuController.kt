class MenuController {

    private val printer = Printer()
    private val bookingsController = BookingController()
    private val customersController = ClientsController()
    private val roomsController = RoomsController(printer)

    fun showMenu() {
        printer.apply {
            printMsg("Ingrese una opción")
            printMsg("1 - Registrar habitación")
            printMsg("2 - Registrar Cliente")
            printMsg("3 - Crear reserva ")
            printMsg("4 - Mostrar habitaciones")
            printMsg("5 - Mostrar Clientes")
            printMsg("6 - Mostrar reservas")

            val selectedOption = readln().toInt()
            validateOptions(selectedOption)
        }
    }

    private fun validateOptions(selectedOption: Int) {
        when (selectedOption) {
            1 -> {
                roomsController.registerRoom()
                showMenu()
            }

            2 -> {
                customersController.registerCustomer()
                showMenu()
            }

            3 -> {
                roomsController.showRooms()
                showMenu()
            }

            4 -> {
                customersController.showCustomers()
                showMenu()
            }

            5 -> {
                bookingsController.showBookings()
                showMenu()
            }

        }
    }