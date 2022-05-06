package com.example.noteapp.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType){
    class TitleAtoZ(orderType: OrderType): NoteOrder(orderType)
    class Date(orderType: OrderType): NoteOrder(orderType)
    class Color(orderType: OrderType): NoteOrder(orderType)

    fun copy(orderType: OrderType):NoteOrder{
        return when(this){
            is TitleAtoZ -> TitleAtoZ(orderType)
            is Date -> Date(orderType)
            is Color -> Color(orderType)
        }
    }
}
