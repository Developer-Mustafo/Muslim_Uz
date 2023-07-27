package uz.coder.muslimuz.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.databinding.ItemAllohBinding;
import uz.coder.muslimuz.databinding.ItemLayoutBinding;
import uz.coder.muslimuz.model.AllohIsmlariModel;
import uz.coder.muslimuz.model.Duo_Model;

public class AllohAdapter extends ArrayAdapter<AllohIsmlariModel> {
    List<AllohIsmlariModel> allohIsmlariModels;
    public AllohAdapter(@NonNull Context context, List<AllohIsmlariModel> allohIsmlariModels) {
        super(context, R.layout.item_alloh, allohIsmlariModels);
        this.allohIsmlariModels = allohIsmlariModels;
    }

    @Override
    public int getCount() {
        return allohIsmlariModels.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ItemAllohBinding binding;
        if (convertView == null){
            binding = ItemAllohBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        }else{
            binding = ItemAllohBinding.bind(convertView);

        }

        AllohIsmlariModel tolovModel = allohIsmlariModels.get(position);//0
        binding.name.setText(tolovModel.getName().toString());
        binding.query.setText(tolovModel.getQuality().toString());
        binding.rasm.setImageResource(allohIsmlariModels.get(position).getImg());
        return binding.getRoot();
    }
}
