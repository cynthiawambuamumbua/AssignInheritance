fun main(){
val Toyota=car("Toyota","subaru","white",6)
    Toyota.carry(8)
    Toyota.identity("white","Toyota", )
    println(Toyota.calculateParkingFees(6))

    var Kathi=Bus("Kathi","nissan","white",33)
    println(Kathi.maxTripFare(300.75))
    println(Kathi.parkingFees(12))

}

//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20 (1 point)

 open  class matatu(var make:String,var model:String,val color:String,var capacity:Int){
     fun carry(people: Int) {
         if (people <= capacity) {
             println("Carrying $people Passengers")
         } else {
             var x = people - capacity
             println("Over capacity by $x people")
         }
     }

     fun identity(color: String, make: String) {
         println("I am a $color $make $model")
     }


}

class car(make:String, model:String, color:String, capacity:Int):matatu(make,model, color, capacity) {

    fun calculateParkingFees(hours: Int): Int{
        var y = hours * 20
        return y


    }
}

// Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus

class Bus(var make:String,var model:String,val color:String,var capacity:Int){
    fun maxTripFare(fare:Double):Double{
        return fare

    }
    fun parkingFees(hours: Int): Int{
     var fees = capacity*hours
        return fees
    }
}

