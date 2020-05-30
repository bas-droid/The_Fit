package ng.edu.baze.thefit;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment4 extends Fragment {

    public BlankFragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_blank4, container, false);
        List<Integer> pic=new ArrayList<>();
        pic.add(R.drawable.bl1);
        pic.add(R.drawable.bl2);
        pic.add(R.drawable.bl3);
        pic.add(R.drawable.bl4);
        RecyclerView recyclerView=view.findViewById(R.id.recycler2);
        RecyclerAdapter recyclerAdapter=new RecyclerAdapter(pic, getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(recyclerAdapter);
      return view;
    }
}
