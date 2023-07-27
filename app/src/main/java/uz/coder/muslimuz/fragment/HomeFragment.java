package uz.coder.muslimuz.fragment;

import static android.content.ContentValues.TAG;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.adapter.MuslimAdapter;
import uz.coder.muslimuz.databinding.ActivityMainBinding;
import uz.coder.muslimuz.model.MuslimModel;
import uz.coder.muslimuz.databinding.FragmentHomeBinding;
import uz.coder.muslimuz.databinding.ItemTabBinding;

public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    List<MuslimModel> muslimModelList;
    MuslimAdapter muslimAdapter;
    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        // Inflate the layout for this fragment
       binding = FragmentHomeBinding.inflate(inflater,container,false);
        loadData();
        muslimAdapter = new MuslimAdapter(muslimModelList);
        binding.vp.setAdapter(muslimAdapter);
        binding.tab.setupWithViewPager(binding.vp);
        binding.tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                ItemTabBinding itemTabBinding  = ItemTabBinding.bind(Objects.requireNonNull(tab.getCustomView()));
                itemTabBinding.circle.setVisibility(View.VISIBLE);
                itemTabBinding.txtTab.setTextColor(Color.GREEN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                ItemTabBinding itemTabBinding  = ItemTabBinding.bind(Objects.requireNonNull(tab.getCustomView()));
                itemTabBinding.circle.setVisibility(View.INVISIBLE);
                itemTabBinding.txtTab.setTextColor(Color.parseColor("#817B7B"));
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        int tabCount = binding.tab.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tab = binding.tab.getTabAt(i);
            ItemTabBinding itemTabBinding = ItemTabBinding.inflate(LayoutInflater.from(getActivity()), null, false);
            itemTabBinding.txtTab.setText(muslimModelList.get(i).getMenu());
            itemTabBinding.txtTab.setTextColor(Color.BLACK);
            if (i == 0){
                itemTabBinding.circle.setVisibility(View.VISIBLE);
                itemTabBinding.txtTab.setTextColor(Color.GREEN);
            }else{
                itemTabBinding.circle.setVisibility(View.INVISIBLE);
                itemTabBinding.txtTab.setTextColor(Color.parseColor("#817B7B"));
            }
            assert tab != null;
            tab.setCustomView(itemTabBinding.getRoot());
        }
        binding.tasbeh.setOnClickListener(v -> Navigation.findNavController(binding.getRoot()).navigate(R.id.action_homeFragment_to_tasbehFragment2));
        binding.kitob.setOnClickListener(v -> Navigation.findNavController(binding.getRoot()).navigate(R.id.duoFragment));

        binding.olloh.setOnClickListener(v -> Navigation.findNavController(binding.getRoot()).navigate(R.id.alloh_ismlari_Fragment));
        binding.namoz.setOnClickListener(v -> Navigation.findNavController(binding.getRoot()).navigate(R.id.namozFragment));
        return binding.getRoot();
    }
    private void loadData() {
        muslimModelList=new ArrayList<>();
        muslimModelList.add(new MuslimModel("Bomdod","03:42","Bomdod"));
        muslimModelList.add(new MuslimModel("Peshin","13:02","Peshin"));
        muslimModelList.add(new MuslimModel("Asr","18:12","Asr"));
        muslimModelList.add(new MuslimModel("Shom","20:33","Shom"));
        muslimModelList.add(new MuslimModel("Xufton","22:14","Xufton"));
    }
}