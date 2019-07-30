/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb.settings.esp;

import org.json.JSONObject;

/**
 *
 * @author Jan
 */
class Setting {

    private static String[] mHexWaarde = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
    static int cMacLengte = 6;
    static int cIpLengte = 4;

    private String mLAN;
    private String mWachtwoord;
    private int[] mMacPos;
    private String mNaam;
    private String mOmschr;
    private int mLogNiveau;
    private boolean mDrukknop;
    private int mAutoOff;
    private int[] mServerIpPos;
    private int mServerPort;
    private boolean mReset;
    private boolean mGeldig;

    Setting() {
        int lTeller;

        mMacPos = new int[cMacLengte];
        mServerIpPos = new int[cIpLengte];
        mLAN = "";
        mWachtwoord = "";
        for (lTeller = 0; lTeller < mMacPos.length; lTeller++) {
            mMacPos[lTeller] = 0;
        }
        mNaam = "";
        mOmschr = "";
        mLogNiveau = 0;
        mDrukknop = false;
        mAutoOff = 0;
        for (lTeller = 0; lTeller < mServerIpPos.length; lTeller++) {
            mServerIpPos[lTeller] = 0;
        }
        mServerPort = 0;
        mReset = false;
        mGeldig = false;
    }

    boolean xGeldig() {
        return mGeldig;
    }

    String xLAN() {
        return mLAN;
    }

    void xLAN(String pLAN) {
        mLAN = pLAN;
    }

    String xWachtwoord() {
        return mWachtwoord;
    }

    void xWachtwoord(String pWachtwoord) {
        mWachtwoord = pWachtwoord;
    }

    int xMacPos(int pPos) {
        if (pPos >= 0 && pPos < cMacLengte) {
            return mMacPos[pPos];
        } else {
            return -1;
        }
    }

    void xMacPos(int pPos, int pValue) {
        if (pPos >= 0 && pPos < cMacLengte) {
            if (pValue >= 0 && pValue <= 255) {
                mMacPos[pPos] = pValue;
            }
        }
    }

    String xNaam() {
        return mNaam;
    }

    void xNaam(String pNaam) {
        mNaam = pNaam;
    }

    String xOmschr() {
        return mOmschr;
    }

    void xOmschr(String pOmschr) {
        mOmschr = pOmschr;
    }

    int xLogNiveau() {
        return mLogNiveau;
    }

    void xLogNiveau(int pLogNiveau) {
        mLogNiveau = pLogNiveau;
    }

    boolean xDrukknop() {
        return mDrukknop;
    }

    void xDrukknop(boolean pDrukknop) {
        mDrukknop = pDrukknop;
    }

    int xAutoOff(){
        return mAutoOff;
    }
    
    void xAutoOff(int pAutoOff){
        mAutoOff = pAutoOff;
    }
    
    int xServerIpPos(int pPos) {
        if (pPos >= 0 && pPos < cIpLengte) {
            return mServerIpPos[pPos];
        } else {
            return -1;
        }
    }

    void xServerIpPos(int pPos, int pValue) {
        if (pPos >= 0 && pPos < cIpLengte) {
            if (pValue >= 0 && pValue <= 255) {
                mServerIpPos[pPos] = pValue;
            }
        }
    }

    int xServerPort() {
        return mServerPort;
    }

    void xServerPort(int pPort) {
        if (pPort >= 0 && pPort <= 65535) {
            mServerPort = pPort;
        }
    }

    void xSetting(JSONObject lSetting) {
        String lResultaat;
        int lTeller;
        int lStart;
        String lMacPos;
        String lMac;
        String lServerIp;
        int[] lIpPos;
        String[] lGroups;

        lResultaat = lSetting.optString("result", "Fout JSON antwoord");
        if (lResultaat.equals("OK")) {
            mGeldig = true;
            mLAN = lSetting.optString("ssid", "");
            mWachtwoord = lSetting.optString("password", "");
            lMac = lSetting.optString("mac", "");
            for (lTeller = 0; lTeller < mMacPos.length; lTeller++) {
                lStart = lTeller * 3;
                lMacPos = lMac.substring(lStart, lStart + 2);
                mMacPos[lTeller] = xHexToInt(lMacPos);
            }
            mNaam = lSetting.optString("name", "");
            mOmschr = lSetting.optString("descr", "");
            mLogNiveau = lSetting.optInt("loglevel", 0);
            mDrukknop = (lSetting.optString("button", "off").equals("on")) ? true : false;
            mAutoOff = lSetting.optInt("auto-off", 0);
            lServerIp = lSetting.optString("serverip", "");
            lGroups = lServerIp.split("\\.");
            if (lGroups.length == cIpLengte) {
                lIpPos = new int[cIpLengte];
                for (lTeller = 0; lTeller < lGroups.length; lTeller++) {
                    if (lGroups[lTeller].length() > 0) {
                        try {
                            lIpPos[lTeller] = Integer.parseInt(lGroups[lTeller]);
                        } catch (NumberFormatException pExc) {
                            break;
                        }
                        if (lIpPos[lTeller] < 0 || lIpPos[lTeller] > 255) {
                            break;
                        }
                    }
                }
                if (lTeller >= lGroups.length) {
                    mServerIpPos = lIpPos;
                }
                mServerPort = lSetting.optInt("serverport", 0);
            }
        } else {
            mGeldig = false;
        }
    }

    JSONObject xSetting() {
        JSONObject lSetting;
        String lMAC;

        lSetting = new JSONObject();
        lSetting.put("ssid", mLAN);
        lSetting.put("password", mWachtwoord);
        lMAC = xIntToHex(mMacPos[0]) + ":" + xIntToHex(mMacPos[1]) + ":" + xIntToHex(mMacPos[2]) + ":" + xIntToHex(mMacPos[3]) + ":" + xIntToHex(mMacPos[4]) + ":" + xIntToHex(mMacPos[5]);
        lSetting.put("mac", lMAC);
        lSetting.put("name", mNaam);
        lSetting.put("descr", mOmschr);
        lSetting.put("loglevel", mLogNiveau);
        lSetting.put("button", (mDrukknop) ? "on" : "off");
        lSetting.put("auto-off", mAutoOff);
        lSetting.put("serverip", String.valueOf(mServerIpPos[0]) + "." + String.valueOf(mServerIpPos[1]) + "." + String.valueOf(mServerIpPos[2]) + "." + String.valueOf(mServerIpPos[3]));
        lSetting.put("serverport", mServerPort);
        return lSetting;
    }

    JSONObject xSettingReset() {
        JSONObject lSetting;

        lSetting = new JSONObject();
        lSetting.put("reset", "true");
        return lSetting;
    }

    static int xHexToInt(String pHex) {
        int lResult;
        String lPos1;
        String lPos2;
        int lWaarde1;
        int lWaarde2;
        int lTeller;

        if (pHex.length() == 2) {
            lPos1 = pHex.substring(0, 1).toUpperCase();
            lPos2 = pHex.substring(1).toUpperCase();
            lWaarde1 = -1;
            for (lTeller = 0; lTeller < mHexWaarde.length; lTeller++) {
                if (lPos1.equals(mHexWaarde[lTeller])) {
                    lWaarde1 = lTeller;
                    break;
                }
            }
            if (lWaarde1 < 0) {
                lResult = -1;
            } else {
                lWaarde2 = -1;
                for (lTeller = 0; lTeller < mHexWaarde.length; lTeller++) {
                    if (lPos2.equals(mHexWaarde[lTeller])) {
                        lWaarde2 = lTeller;
                        break;
                    }
                }
                if (lWaarde2 < 0) {
                    lResult = -1;
                } else {
                    lResult = (lWaarde1 * 16) + lWaarde2;
                }
            }
        } else {
            lResult = -1;
        }
        return lResult;
    }

    static String xIntToHex(int pInt) {
        String lResult;
        int lPos1;
        int lPos2;

        if (pInt < 0 || pInt > 255) {
            lResult = "";
        } else {
            lPos1 = pInt / 16;
            lPos2 = pInt % 16;
            lResult = mHexWaarde[lPos1] + mHexWaarde[lPos2];
        }
        return lResult;
    }

    static int xStrToInt(String pStr) {
        int lResult;

        try {
            lResult = Integer.parseInt(pStr);
        } catch (NumberFormatException pExc) {
            lResult = -1;
        }
        return lResult;
    }
}
