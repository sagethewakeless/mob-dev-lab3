// Polkovnikov Sergey
package task5

fun main() {
    val parcels: List<Parcel> = listOf(
        Parcel("P1", 2.0),
        ExpressParcel("P2", 3.0),
        EconomyParcel("P3", 10.0)
    )
    println("total=%.2f".format(totalShipping(parcels)))
}
