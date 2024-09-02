package com.littlelemon.menu

class SortHelper {
    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortedBy { it.title }
            SortType.PriceAsc -> productsList.sortByPriceAsc()
            SortType.PriceDesc -> productsList.sortByPriceDesc()
        }
    }
}

fun List<ProductItem>.sortByPriceAsc(): List<ProductItem> {
    return this.sortedBy { it.price }
}

fun List<ProductItem>.sortByPriceDesc(): List<ProductItem> {
    return this.sortedByDescending { it.price }
}