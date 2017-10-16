package com.example.student.aes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.scottyab.aescrypt.AESCrypt;

import java.security.GeneralSecurityException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        String password = "password";
        String message = "hello world";
        try {
            String encryptedMsg = AESCrypt.encrypt(password, message);
            Log.d("ENC", encryptedMsg);
        }catch (GeneralSecurityException e){
            //handle error
        }


        String encryptedMsg = "2B22cS3UC5s35WBihLBo8w==";
        try {
            String messageAfterDecrypt = AESCrypt.decrypt(password, encryptedMsg);
            Log.d("ENC", messageAfterDecrypt);
        }catch (GeneralSecurityException e){
            //handle error - could be due to incorrect password or tampered encryptedMsg
        }

    }
}
