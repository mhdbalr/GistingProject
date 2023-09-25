package com.example.gistingproject.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.gistingproject.R
import com.example.gistingproject.databinding.FragmentBerandaBinding
import java.net.URL


@Suppress("UNREACHABLE_CODE")
class BerandaFragment : Fragment() {

    lateinit var binding: FragmentBerandaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBerandaBinding.inflate(layoutInflater, container, false)
    return binding.root
    }
      override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            binding.btntoGreenHouse.setOnClickListener{
                findNavController().navigate(R.id.action_berandaFragment_to_greenHouseFragment)
            }
          // Mendapatkan referensi ke tombol
          val buttonTableGH = view.findViewById<Button>(R.id.buttonTableGH)

          // Menambahkan event click listener ke tombol
          buttonTableGH.setOnClickListener {

              val pindahwebb = Intent(Intent.ACTION_VIEW)
              pindahwebb.data = Uri.parse("https://www.google.com/search?q=$buttonTableGH")
              startActivity(pindahwebb)
          }

          // Mendapatkan referensi ke tombol
          val buttonGraphGH = view.findViewById<Button>(R.id.buttonGraphGH)

          // Menambahkan event click listener ke tombol
          buttonGraphGH.setOnClickListener {

              val pindahwebb = Intent(Intent.ACTION_VIEW)
              pindahwebb.data = Uri.parse("https://www.google.com/search?q=$buttonGraphGH")
              startActivity(pindahwebb)
          }
        }
}




