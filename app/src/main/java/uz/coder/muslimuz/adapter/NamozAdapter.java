package uz.coder.muslimuz.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.coder.muslimuz.databinding.ItemNamozBinding;
import uz.coder.muslimuz.model.NamozModel;

public class NamozAdapter extends RecyclerView.Adapter<NamozAdapter.VH> {
    List<NamozModel> namozModelList;
    NamozAdapter.VH.OnClickListener onClickListener;

    public NamozAdapter(List<NamozModel> namozModelList, VH.OnClickListener onClickListener) {
        this.namozModelList = namozModelList;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(ItemNamozBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.binding.img.setImageResource(namozModelList.get(position).getImg());
        holder.binding.txt.setText(namozModelList.get(position).getName());
        holder.itemView.setOnClickListener(v -> {
            onClickListener.OnClick(namozModelList.get(position),position,holder.itemView);
        });
    }

    @Override
    public int getItemCount() {
        return namozModelList.size();
    }

    public static class VH extends RecyclerView.ViewHolder {
        ItemNamozBinding binding;
        public VH(@NonNull ItemNamozBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public interface OnClickListener{
            void OnClick(NamozModel namozModel,int position,View v);
        }
    }
}
