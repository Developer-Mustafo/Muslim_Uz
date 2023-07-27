package uz.coder.muslimuz.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.databinding.FragmentNamoz2Binding;
import uz.coder.muslimuz.databinding.FragmentNamozBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Namoz2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Namoz2Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String nomi;
    private String ozi;
    private int img;

    public Namoz2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Namoz2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Namoz2Fragment newInstance(String param1, String param2) {
        Namoz2Fragment fragment = new Namoz2Fragment();
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
            nomi = getArguments().getString("nomi");
            ozi = getArguments().getString("Ozi");
            img = getArguments().getInt("img");
        }
    }
    FragmentNamoz2Binding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNamoz2Binding.inflate(inflater,container,false);
        binding.name2.setText(nomi);
        binding.ozi2.setText(ozi);
        binding.rasm.setImageResource(img);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}