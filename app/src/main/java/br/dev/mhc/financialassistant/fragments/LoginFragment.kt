package br.dev.mhc.financialassistant.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import br.dev.mhc.financialassistant.R
import br.dev.mhc.financialassistant.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.loginFragment = this
        binding.lifecycleOwner = this
        navController = findNavController()
        // Inflate the layout for this fragment
        return binding.root
    }

    fun login() {
        Toast.makeText(requireContext(), "Usuário logado com sucesso!", Toast.LENGTH_LONG).show()
        return
    }
}