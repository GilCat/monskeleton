package com.myoccnurse.app;

import android.os.Bundle;
import android.telecom.Connection;




public final class MonConnection extends Connection {

    private static final String TAG = "MonConnection";

    @Override
    public void onDisconnect() {
        super.onDisconnect();
    }

    @Override
    public void onSeparate() {
        super.onSeparate();
    }

    @Override
    public void onAbort() {
        super.onAbort();
    }

    @Override
    public void onHold() {
        super.onHold();
    }

    @Override
    public void onAnswer(int videoState) {
        super.onAnswer(videoState);
    }

    @Override
    public void onAnswer() {
        super.onAnswer();
    }

    @Override
    public void onReject() {
        super.onReject();
    }

    @Override
    public void onReject(String replyMessage) {
        super.onReject(replyMessage);
    }

    @Override
    public void onCallEvent(String event, Bundle extras) {
        super.onCallEvent(event, extras);
    }
}
