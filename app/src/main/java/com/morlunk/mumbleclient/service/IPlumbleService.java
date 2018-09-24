package com.morlunk.mumbleclient.service;

import com.morlunk.jumble.IJumbleService;

import java.util.List;

/**
 * Created by andrew on 28/02/17.
 */
public interface IPlumbleService extends IJumbleService {
    boolean isOverlayShown();

    void setOverlayShown(boolean showOverlay);

    void clearChatNotifications();

    void markErrorShown();

    boolean isErrorShown();

    void onTalkKeyDown();

    void onTalkKeyUp();

    List<IChatMessage> getMessageLog();

    void clearMessageLog();

    void setSuppressNotifications(boolean suppressNotifications);
}
