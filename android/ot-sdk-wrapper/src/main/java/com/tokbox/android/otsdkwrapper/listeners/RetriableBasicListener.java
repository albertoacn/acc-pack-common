package com.tokbox.android.otsdkwrapper.listeners;

import android.view.View;

import com.opentok.android.OpentokError;

public interface RetriableBasicListener<Wrapper> extends BasicListener<Wrapper> {

    public BasicListener setInternalListener(BasicListener listener);
    public BasicListener getInternalListener();
    public void resume();

    @Override
    void onConnected(Wrapper wrapper, int participantsNumber, String connId, String data);

    @Override
    void onDisconnected(Wrapper wrapper, int participantsNumber, String connId, String data);

    @Override
    void onPreviewViewReady(Wrapper wrapper, View localView);

    @Override
    void onPreviewViewDestroyed(Wrapper wrapper, View localView);

    @Override
    void onStartedSharingMedia(Wrapper wrapper);

    @Override
    void onStoppedSharingMedia(Wrapper wrapper);

    @Override
    void onRemoteViewReady(Wrapper wrapper, View remoteView, String remoteId, String data);

    @Override
    void onRemoteViewDestroyed(Wrapper wrapper, View remoteView, String remoteId);

    @Override
    void onRemoteJoined(Wrapper wrapper, String remoteId);

    @Override
    void onRemoteLeft(Wrapper wrapper, String remoteId);

    @Override
    void onRemoteVideoChange(Wrapper wrapper, String remoteId, String reason, boolean videoActive,
                             boolean subscribed);

    @Override
    void onError(Wrapper wrapper, OpentokError error);
}