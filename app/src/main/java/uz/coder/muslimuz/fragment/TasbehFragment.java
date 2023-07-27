package uz.coder.muslimuz.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uz.coder.muslimuz.databinding.FragmentTasbehBinding;
public class TasbehFragment extends Fragment {
    private SharedPreferences.Editor editor;

    private FragmentTasbehBinding binding;
    private String sanash;
    private String jami;
    private int sanash1 = 0;
    private int jami1 = 0;
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        SharedPreferences sharedPreferences = requireActivity().getSharedPreferences("Muslim Uz", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        // Inflate the layout for this fragment
        binding = FragmentTasbehBinding.inflate(inflater, container, false);
        String sanash2  = sharedPreferences.getString("key1","0");
        String jami2  = sharedPreferences.getString("key2","0");
        sanash = sanash2;
        jami = jami2;
        sanash1 = Integer.parseInt(sanash);
        jami1 = Integer.parseInt(jami);
        binding.sanash.setText(sanash2);
        binding.jami.setText("Jami: "+jami2);
        binding.sanash.setOnClickListener(v -> {
            sanash1++;
            jami1++;
            jami = String.valueOf(jami1);
            sanash = String.valueOf(sanash1);
            binding.jami.setText("Jami: "+ jami);
            binding.sanash.setText(sanash);

            if (sanash1 == 34) {
                binding.sanash.setText("0");
                sanash = "0";
                sanash1 = 0;
                sanash1++;
            }
        });
        binding.refresh.setOnClickListener(v -> {
            binding.sanash.setText("0");
            sanash = "0";
            jami1 = 0;
            jami = "0";
            sanash1 = 0;
            binding.jami.setText("Jami: 0");
        });
        return binding.getRoot();
    }

    @Override
    public void onPause() {
        editor.putString("key1", sanash);
        editor.putString("key2", jami);
        editor.commit();
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}