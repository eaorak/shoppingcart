package com.example

/**
  * Created by ender on 05/12/2016.
  */
object ShoppingCart {

  val calculator: Map[String, (Integer) => Double] = Map(
    "Apple" -> { x: Integer => (x - (x / 2)) * 60 },
    "Orange" -> { x: Integer => (x - (x / 3)) * 25 }
  )

  def calculateTotal(items: String*): Double = {
    items.groupBy(i => i).mapValues(_.size).map(vals => calculator(vals._1)(vals._2)).sum / 100d
  }

}
