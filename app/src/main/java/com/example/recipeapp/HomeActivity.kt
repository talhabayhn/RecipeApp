package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeapp.adapter.MainCategoryAdapter
import com.example.recipeapp.adapter.SubCategoryAdapter
import com.example.recipeapp.entities.Recipes
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        arrMainCategory.add(Recipes(1,"Beef"))
        arrMainCategory.add(Recipes(2,"Chicken"))
        arrMainCategory.add(Recipes(3,"Fish"))
        arrMainCategory.add(Recipes(4,"Dessert"))
        arrMainCategory.add(Recipes(5,"Lamb"))

        arrSubCategory.add(Recipes(1,"Beef and mustard pie"))
        arrSubCategory.add(Recipes(2,"Chicken and salad"))
        arrSubCategory.add(Recipes(3,"Tuna fish with Chips"))
        arrSubCategory.add(Recipes(4,"Banana pancakes"))
        arrSubCategory.add(Recipes(5,"Kuzu İncik"))

        mainCategoryAdapter.setData(arrMainCategory)
        subCategoryAdapter.setData(arrSubCategory)

        rv_main_category.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_main_category.adapter= mainCategoryAdapter

        rv_sub_category.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_sub_category.adapter= subCategoryAdapter




    }
}