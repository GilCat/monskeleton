package com.myoccnurse.app;

import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.PhoneAccountHandle;
import android.telecom.DisconnectCause;
import android.util.Log;
import android.widget.Toast;


public class MonService extends ConnectionService {

    private static final String TAG = "MyOccNurseConnectionService";

    @Override
    public void onCreateOutgoingConnectionFailed(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request) {
        super.onCreateOutgoingConnectionFailed(connectionManagerPhoneAccount, request);
    }

    @Override
    public Connection onCreateOutgoingConnection(PhoneAccountHandle connectionManagerPhoneAccount, ConnectionRequest request) {

        Log.d(TAG, "onCreateOutgoingConnection: calling");

        try {

            MonConnection connection = new MonConnection();
            Toast.makeText(this,"This will trigger phone Call",Toast.LENGTH_SHORT).show();

            return connection;
        }
        catch (Exception e) {

            e.printStackTrace();
            return Connection.createFailedConnection(new DisconnectCause(DisconnectCause.ERROR, "Execption", "Check the stack trace for more information.", e.getLocalizedMessage()));

        }

    }
}
