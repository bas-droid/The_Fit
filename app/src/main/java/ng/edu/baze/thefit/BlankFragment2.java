package ng.edu.baze.thefit;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank2, container, false);
        RecyclerView recyclerView=view.findViewById(R.id.recyclerProfile);
        ArrayList<String> name=new ArrayList<>();
        name.add("Idris Alba");
        name.add("Sara Elizabth");
        name.add("Martin Joe");
        name.add("Tiger Woods");
        RecyclerAdapterProfile recyclerAdapterProfile=new RecyclerAdapterProfile(name,getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(recyclerAdapterProfile);
        return view;
    }
}
