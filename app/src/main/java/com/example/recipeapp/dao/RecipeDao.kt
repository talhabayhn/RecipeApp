package com.example.recipeapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.recipeapp.entities.Category
import com.example.recipeapp.entities.CategoryItems
import com.example.recipeapp.entities.MealsItems
import com.example.recipeapp.entities.Recipes

@Dao
interface RecipeDao {

 @Query("SELECT * FROM categoryitems ORDER BY a DESC")
 suspend fun getAllCategory() : List<CategoryItems>

 @Insert(onConflict = OnConflictStrategy.REPLACE)
 suspend fun insertCategory(categoryItems: CategoryItems?)

 @Query("DELETE FROM categoryitems")
 suspend fun clearDb()

 @Insert(onConflict = OnConflictStrategy.REPLACE)
 suspend fun insertMeal(mealsItems: MealsItems?)



 @Query("SELECT * FROM MealItems WHERE categoryName = :categoryName ORDER BY a DESC")
 suspend fun getSpecificMealList(categoryName:String) : List<MealsItems>
}