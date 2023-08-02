package com.compose.materialdesign.features.material_design3.features.card

sealed class CardItems(var route: String) {
    object CardSample : CardItems("CardSample")
    object ClickableCardSample : CardItems("ClickableCardSample")
    object ElevatedCardSample : CardItems("ElevatedCardSample")
    object ClickableElevatedCardSample: CardItems("ClickableElevatedCardSample")
    object OutlinedCardSample: CardItems("OutlinedCardSample")
    object ClickableOutlinedCardSample: CardItems("ClickableOutlinedCardSample")


}




