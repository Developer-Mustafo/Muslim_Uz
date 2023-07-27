package uz.coder.muslimuz.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.databinding.FragmentMenuBinding;

public class MenuFragment extends Fragment {
FragmentMenuBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMenuBinding.inflate(inflater,container,false);
        binding.xaqida.setOnClickListener(v ->
                        Navigation.findNavController(binding.getRoot()).navigate(R.id.xaqidaFragment)
        );
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}