package com.example.kolip.timezup;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class missedcallfrag extends Fragment {
Button b1;
View view;
    public missedcallfrag() {

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_missedcallfrag, container, false);

        b1=(Button)view.findViewById(R.id.tick2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),missedcall.class);
                startActivity(intent);

            }
        });
return view;

    }


    public interface OnFragmentInteractionListener {

        void onFragmentInteraction(Uri uri);
    }
}
