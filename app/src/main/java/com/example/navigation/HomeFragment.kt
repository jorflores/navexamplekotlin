package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttonPantallaA.setOnClickListener {

            // Navegar con ids del nav graph
           // Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_pantallaAFragment2)

            // Navegacion con Bundle

          /*  val name = binding.editTextName.text.toString()
            val bundle = Bundle()
            bundle.putString("name",name)

            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_pantallaAFragment2,bundle)
*/

            // SAFE ARGS
            val name = binding.editTextName.text.toString()
            val action = HomeFragmentDirections.
            actionHomeFragmentToPantallaAFragment2(name,100)
            Navigation.findNavController(view).navigate(action)


        }


        binding.buttonPantallaB.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_pantallaBFragment2)

        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}