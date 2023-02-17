package uz.toza.testapp.ui

import android.os.Bundle
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.toza.testapp.databinding.FragmentUsersBinding
import java.util.Base64.getEncoder


//https://api.github.com/repos/Nurmuhammad202/TozaUz

class UsersFragment : Fragment() {
    private var _binding: FragmentUsersBinding? = null
    private val binding get() = requireNotNull(_binding)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate  the layout for this fragment
        _binding = FragmentUsersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//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
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}