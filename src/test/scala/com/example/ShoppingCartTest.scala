package com.example

import org.scalatest._
import com.example._

/**
  * Created by ender on 05/12/2016.
  */
class ShoppingCartTest extends FunSuite {


  test("An empty list should cost 0.0") {
    assert(ShoppingCart.calculateTotal() == 0.0)
  }

  test("An apple and an orange should cost 85p") {
    assert(ShoppingCart.calculateTotal("Apple", "Orange") == 0.85)
  }

  test("Three apples and five oranges should cost £2.2") {
    assert(ShoppingCart.calculateTotal("Apple", "Apple", "Apple", //
      "Orange", "Orange", "Orange", "Orange", "Orange") == 2.2)
  }

  test("Five apples and six oranges should cost £2.8") {
    assert(ShoppingCart.calculateTotal("Apple", "Apple", "Apple", "Apple", "Apple", //
      "Orange", "Orange", "Orange", "Orange", "Orange", "Orange") == 2.8)
  }

}
