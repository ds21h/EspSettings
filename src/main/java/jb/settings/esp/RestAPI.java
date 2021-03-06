/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb.settings.esp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Jan
 */
class RestAPI {
    static final String cMethodGet = "GET";
    static final String cMethodPut = "PUT";

    static final String cMediaJSON = "application/json";
    static final String cMediaTekst = "text/plain";

    private String mMethod;
    private String mMediaVraag;
    private String mMediaAntwoord;
    private String mUrl;
    private String mAktie;

    RestAPI(){
        mMethod = cMethodGet;
        mMediaVraag = cMediaTekst;
        mMediaAntwoord = cMediaJSON;
        mUrl = "";
        mAktie = "";
    }

    void xMethod(String pMethod){
        mMethod = pMethod;
    }

    void xMediaVraag(String pMedia){
        mMediaVraag = pMedia;
    }

    void xMediaAntwoord(String pMedia){
        mMediaAntwoord = pMedia;
    }

    void xUrl(String pUrl){
        mUrl = pUrl;
    }

    void xAktie(String pAktie){
        mAktie = pAktie;
    }
    
    RestResult xRoepApi(){
        String lOutput;
        StringBuilder lStr;
        String lUrlS;
        String lAktie;
        URL lUrl;
        HttpURLConnection lConn = null;
        DataOutputStream lOutStream;
        BufferedReader lBufRead;
        String lRegel;
        int lRespCode;
        RestResult lRestResult;

        lStr = new StringBuilder();
        if (mMethod.equals(cMethodGet)){
            if (!mAktie.equals("")){
                lUrlS = mUrl + "?" + mAktie;
                lAktie = "";
            } else {
                lUrlS = mUrl;
                lAktie = "";
            }
        } else {
            lUrlS = mUrl;
            lAktie = mAktie;
        }
        try {
            lUrl = new URL(lUrlS);
            lConn = (HttpURLConnection) lUrl.openConnection();
            lConn.setRequestMethod(mMethod);
            lConn.setRequestProperty("Accept", mMediaAntwoord);
            lConn.setConnectTimeout(5000);
            lConn.setReadTimeout(5000);
            if (!lAktie.equals("")) {
                lConn.setRequestProperty("Content-Type", mMediaVraag);
                lConn.setDoOutput(true);
                lOutStream = new DataOutputStream(lConn.getOutputStream());
                lOutStream.writeBytes(lAktie);
                lOutStream.flush();
                lOutStream.close();
            }

            lRespCode = lConn.getResponseCode();
            if (lRespCode == 200) {
                lBufRead = new BufferedReader(new InputStreamReader(
                        (lConn.getInputStream())));
                while ((lRegel = lBufRead.readLine()) != null) {
                    lStr.append(lRegel);
                }
                lOutput = lStr.toString();
                lRestResult = new RestResult(Resultaat.cResultOK, lOutput);
            } else {
                lRestResult = new RestResult("Foutieve responsecode: " + lRespCode, Resultaat.cResultError);
            }
        } catch (MalformedURLException e) {
            lRestResult = new RestResult("URL niet goed: " + e.getLocalizedMessage(), Resultaat.cResultError);
        } catch (SocketTimeoutException pExc){
            if (pExc.getLocalizedMessage() == null){
                lRestResult = new RestResult("Read Time-Out", Resultaat.cResultReadTimeOut);
            } else {
                lRestResult = new RestResult("Connect Time-Out", Resultaat.cResultConnectTimeOut);
            }
        } catch (IOException e) {
            lRestResult = new RestResult("IO Exception:" + e.getLocalizedMessage(), Resultaat.cResultError);
        } finally {
            if (lConn != null){
                lConn.disconnect();
            }
        }
        return lRestResult;
    }

    class RestResult {
        private int mResult;
        private String mMelding;
        private JSONObject mAntwoordJ;
        private String mAntwoordS;
        private boolean mJson;

        int xResult(){
            return mResult;
        }

        String xMelding() {
            return mMelding;
        }

        JSONObject xAntwoordJ(){
            if (mJson){
                return mAntwoordJ;
            } else {
                return null;
            }
        }

        String xAntWoordS(){
            return mAntwoordS;
        }

        RestResult(int pResult, String pOutput){
            mAntwoordS = pOutput;
            if (mMediaAntwoord.equals(cMediaJSON)){
                try {
                    mAntwoordJ = new JSONObject(pOutput);
                    mResult = pResult;
                    mMelding = "OK";
                    mJson = true;
                }catch (JSONException pExc){
                    mResult = Resultaat.cResultOutputFout;
                    mMelding = "Geen geldig JSON Object ontvangen";
                    mAntwoordJ = null;
                    mJson = false;
                }
            } else {
                mAntwoordJ = null;
                mResult = Resultaat.cResultOK;
                mMelding = "OK";
                mJson = false;
            }
        }

        RestResult(String pMelding, int pResult){
            mAntwoordJ = null;
            mAntwoordS = null;
            mResult = pResult;
            mMelding = pMelding;
        }
    }
}
