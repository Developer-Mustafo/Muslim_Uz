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
import uz.coder.muslimuz.model.Duo_Model;

public class My_Duo_Adapter extends ArrayAdapter<Duo_Model> {
    private List<Duo_Model> tolovModelList;
    public My_Duo_Adapter(@NonNull Context context, @NonNull List<Duo_Model> tolovModelList) {
        super(context, R.layout.item_layout, tolovModelList);
        this.tolovModelList = tolovModelList;
    }

    @Override
    public int getCount() {
        return tolovModelList.size();//sonini belgiladik
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) { //view yassaladi
        ItemLayoutBinding binding;
        if (convertView == null){
            binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        }else{
            binding = ItemLayoutBinding.bind(convertView);

        }

        Duo_Model tolovModel = tolovModelList.get(position);//0
        binding.name.setText(tolovModel.getName().toString());
        binding.ozi.setText(tolovModel.getOzi().toString());
        return binding.getRoot();
    }
}
