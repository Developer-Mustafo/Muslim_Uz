package uz.coder.muslimuz.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

import uz.coder.muslimuz.databinding.ItemMuslimBinding;
import uz.coder.muslimuz.model.MuslimModel;

public class MuslimAdapter extends PagerAdapter {
    List<MuslimModel> muslimModelList;

    public MuslimAdapter(List<MuslimModel> muslimModelList) {
        this.muslimModelList = muslimModelList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ItemMuslimBinding binding;
        binding = ItemMuslimBinding.inflate(LayoutInflater.from(container.getContext()),null,false);
        binding.name.setText(muslimModelList.get(position).getName());
        binding.time.setText(muslimModelList.get(position).getTime());
        container.addView(binding.getRoot());
        return binding.getRoot();
    }

    @Override
    public int getCount() {
        return muslimModelList.size();
    }



    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
