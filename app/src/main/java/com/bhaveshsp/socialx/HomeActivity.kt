package com.bhaveshsp.socialx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.bhaveshsp.socialx.adapters.*
import com.bhaveshsp.socialx.models.BestSeller
import com.bhaveshsp.socialx.models.Category
import com.bhaveshsp.socialx.models.Offer

class HomeActivity : AppCompatActivity() {

    private var categoriesList : ArrayList<Category> = arrayListOf()
    private var bestSellerList : ArrayList<BestSeller> = arrayListOf()
    private var offerList : ArrayList<Offer> = arrayListOf()
    private var backToCityList : ArrayList<Category> = arrayListOf()

    private var clothesList : ArrayList<Category> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val categoryRecyclerView : RecyclerView = findViewById(R.id.categoriesRecyclerView)
        createCategoriesList()
        val categoryAdapter = CategoriesAdapter(categoriesList)
        categoryRecyclerView.adapter = categoryAdapter

        createBestSellersList()
        val bestSellersRecyclerView : RecyclerView = findViewById(R.id.bestSellerRecyclerView)
        val bestSellerAdapter = BestSellerAdapter(bestSellerList)
        bestSellersRecyclerView.adapter = bestSellerAdapter


        createOfferList()
        val offersRecyclerView : RecyclerView = findViewById(R.id.offersRecyclerView)
        val offersAdapter = OffersAdapter(offerList)
        offersRecyclerView.adapter = offersAdapter

        createBackToCityList()
        val backToCityRecyclerView : RecyclerView = findViewById(R.id.backToCityRecyclerView)
        val backToCityAdapter = BackToCityAdapter(backToCityList)
        backToCityRecyclerView.adapter = backToCityAdapter

        createClothesList()
        val clothesRecyclerView : RecyclerView = findViewById(R.id.clothesRecyclerView)
        val clothesAdapter = ClothesAdapter(clothesList)
        clothesRecyclerView.adapter = clothesAdapter

        val flashDealRecyclerView : RecyclerView = findViewById(R.id.flashDealRecyclerView)
        val flashDealAdapter = FlashDealAdapter(arrayListOf("","",""))
        flashDealRecyclerView.adapter = flashDealAdapter

        val specialProductsRecyclerView : RecyclerView = findViewById(R.id.specialDealsRecyclerView)
        val specialProductsAdapter = SpecialProductsAdapter(arrayListOf("","",""))
        specialProductsRecyclerView.adapter = specialProductsAdapter

        val moreToLoveRecyclerView : RecyclerView = findViewById(R.id.moreToLoveRecyclerView)
        val moreToLoveAdapter = MoreToLoveAdapter(arrayListOf("","",""))
        moreToLoveRecyclerView.adapter = moreToLoveAdapter


    }


    private fun createBackToCityList(){
        backToCityList.add(Category("Up to 20% Off",R.drawable.wrist_watch))
        backToCityList.add(Category("Up to 20% Off",R.drawable.iphone))
        backToCityList.add(Category("Up to 20% Off",R.drawable.shoes))

    }


    private fun createClothesList(){
        clothesList.add(Category("Up to 20% Off",R.drawable.jeans))
        clothesList.add(Category("Up to 20% Off",R.drawable.frock))
        clothesList.add(Category("Up to 20% Off",R.drawable.shoes))

    }

    private fun createOfferList(){
        offerList.add(Offer("30% Off",R.drawable.women_shopping))
        offerList.add(Offer("50% Off",R.drawable.canon_camera))
        offerList.add(Offer("30% Off",R.drawable.women_shopping))

    }

    private fun createBestSellersList(){
        bestSellerList.add(BestSeller("Up to 20% Off ",R.drawable.phones_stacked))
        bestSellerList.add(BestSeller("Up to 30% Off ",R.drawable.phones_stacked))
        bestSellerList.add(BestSeller("Up to 50% Off ",R.drawable.phones_stacked))

    }

    private fun createCategoriesList(){
        categoriesList.add(Category("Arts & Crafts",R.drawable.art))
        categoriesList.add(Category("Automotive",R.drawable.automotive))
        categoriesList.add(Category("Baby",R.drawable.teddy_bear))
        categoriesList.add(Category("Computer",R.drawable.computer))
        categoriesList.add(Category("Digital Music",R.drawable.digital_music))
    }


}