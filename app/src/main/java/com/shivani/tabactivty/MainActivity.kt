package com.shivani.tabactivty
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.shivani.tabactivty.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var fragment = arrayListOf<Fragment>(FirstFragment(), SecomdFragment())
    var title = listOf("Chats", "Status", "Calls")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fragment.add(FirstFragment())
        fragment.add(SecomdFragment())
        fragment.add(ThirdFragment())

    }

    class TabAdapter(fa: FragmentActivity, var list: List<Fragment>) : FragmentStateAdapter(fa) {
        override fun getItemCount() = list.size
        override fun createFragment(position: Int) = list[position]
    }
}