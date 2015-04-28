package _15_Traits

trait MovementCapability {
    fun move()
}

class FlyingCapability(val x: Int) : MovementCapability {
    override fun move() {
        print("Flying $x")
    }
}

class Vehicle(movementCapability: MovementCapability) : MovementCapability by movementCapability

fun doStuff() {
    val capability = FlyingCapability(10)
    Vehicle(capability).move()
}

