package com.example.iti.phonetextfieldcustom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hbb20.CountryCodePicker;

public class PhoneText extends LinearLayout {
    EditText phoneNumber;
    TextView countryCode;

    public PhoneText(Context context) {
        super(context);
        inflate(context,R.layout.phone_text,this);
        countryCode = findViewById(R.id.countryCode);
        phoneNumber = findViewById(R.id.phoneNumber);
    }

    public PhoneText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflate(context,R.layout.phone_text,this);
        countryCode = findViewById(R.id.countryCode);
        phoneNumber = findViewById(R.id.phoneNumber);
    }
    public void setCountryCode(String code){
        countryCode.setText(code);
    }
    public String getPhone(){
        if (phoneNumber.getText().toString().isEmpty())
            return "Please Enter a number";
        else if(phoneNumber.getText().toString().length() < 11)
            return "Mobile Number mustn't be less than 11 digits";
        else
            return "Your Number is "+countryCode.getText().toString()+ "-" + phoneNumber.getText().toString();
    }


}
