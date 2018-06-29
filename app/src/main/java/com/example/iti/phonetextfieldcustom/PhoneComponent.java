package com.example.iti.phonetextfieldcustom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.hbb20.CountryCodePicker;

public class PhoneComponent extends LinearLayout {
    CountryCodePicker countryCodePicker;
    PhoneText phoneText;


    public PhoneComponent(Context context) {
        super(context);
        inflate(context,R.layout.phone_component,this);
        bindViews();
    }

    public PhoneComponent(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflate(context,R.layout.phone_component,this);
        bindViews();
    }
    public void bindViews(){
        countryCodePicker = findViewById(R.id.countryCodePicker);
        phoneText = findViewById(R.id.phoneText);
        phoneText.setCountryCode("+"+countryCodePicker.getSelectedCountryCode());

        countryCodePicker.setOnCountryChangeListener(new CountryCodePicker.OnCountryChangeListener() {
            @Override
            public void onCountrySelected() {
                phoneText.setCountryCode(countryCodePicker.getSelectedCountryCode());
            }
        });
    }
}
