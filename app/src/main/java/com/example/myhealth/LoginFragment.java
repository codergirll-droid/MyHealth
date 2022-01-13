package com.example.myhealth;
//Uzay


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



public class LoginFragment extends Fragment {

Button login ;
EditText e_mail;
EditText passwd;




    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        e_mail = view.findViewById(R.id.eMail);
        passwd = view.findViewById(R.id.password);

        login = view.findViewById(R.id.btn_login);


        return view;
    }
}