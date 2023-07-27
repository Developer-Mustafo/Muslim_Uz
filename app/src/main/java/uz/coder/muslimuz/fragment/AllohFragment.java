package uz.coder.muslimuz.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.databinding.FragmentAllohBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AllohFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AllohFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private int mParam3;

    public AllohFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AllohFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AllohFragment newInstance(String param1, String param2) {
        AllohFragment fragment = new AllohFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString("key");
            mParam2 = getArguments().getString("key1");
            mParam3 = getArguments().getInt("key2");
        }
    }
    FragmentAllohBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAllohBinding.inflate(inflater,container,false);
        binding.name2.setText(mParam1);
        binding.ozi2.setText(mParam2);
        binding.img1.setImageResource(mParam3);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}