package ipt.dam.fragmentosversaob

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ipt.dam.fragmentosversaob.Fragmentos.*


class MyViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return Fragmento1()
            1 -> return Fragmento2()
            2 -> return Fragmento3()
            else -> return Fragmento1()
        }
    }

}

