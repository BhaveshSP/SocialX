package com.bhaveshsp.socialx.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bhaveshsp.socialx.signinsignup.SignInFragment
import com.bhaveshsp.socialx.signinsignup.SignUpFragment


class SignInSignUpTabLayoutAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            1 -> SignUpFragment()
            else -> SignInFragment()
        }
    }
    companion object{
        const val NUM_TABS = 2
    }

}