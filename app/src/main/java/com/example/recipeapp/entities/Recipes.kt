package com.example.recipeapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = "Recipes")
data class Recipes @JvmOverloads constructor(
        @PrimaryKey(autoGenerate = true)
        var number:Int,

        @ColumnInfo(name ="dishName")
        var dishName: String
): Serializable