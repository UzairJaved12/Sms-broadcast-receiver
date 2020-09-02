package com.kwabenaberko.smsbroadcastreceiver;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsMessage;
import android.util.Log;

import com.kwabenaberko.smsbroadcastreceiverlib.SmsBroadcastReceiver;


/**
 * Created by Kwabena Berko on 8/2/2018.
 */

public class MySmsReceiver extends SmsBroadcastReceiver {
    private static final String TAG = "MySmsReceiver";



    @Override
    protected void onSmsReceived(SmsMessage smsMessage) {



            Log.d(TAG, "ONSMSRECEIVED");
            Log.d(TAG, smsMessage.getDisplayOriginatingAddress());
            Log.d(TAG, smsMessage.getDisplayMessageBody());

            String telemartOtpCord = smsMessage.getDisplayMessageBody();
            String name = "Uzair";
            String name2 = "Moeen";

            /*   String newotp = telemartOtpCord.replace("Your Telemart OTP is: : ", "");*/
            // Log.e(TAG,  newotp);

            String currentString = "Your Telemart OTP is: 524824";
            String[] separated = currentString.split(": ");
            String value1 = separated[0];
            String value2 = separated[1];
            Log.e(TAG, value1 + value2);


        }
    }

