// Polkovnikov Sergey
package task5

fun totalShipping(parcels: List<Parcel>): Double = parcels.sumOf { it.shippingCost() }
