/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19t1v.api;

public class CThostFtdcMdApi {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMdApi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMdApi obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public static CThostFtdcMdApi CreateFtdcMdApi(String pszFlowPath, boolean bIsUsingUdp, boolean bIsMulticast) {
    long cPtr = jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_0(pszFlowPath, bIsUsingUdp, bIsMulticast);
    return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
  }

  public static CThostFtdcMdApi CreateFtdcMdApi(String pszFlowPath, boolean bIsUsingUdp) {
    long cPtr = jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_1(pszFlowPath, bIsUsingUdp);
    return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
  }

  public static CThostFtdcMdApi CreateFtdcMdApi(String pszFlowPath) {
    long cPtr = jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_2(pszFlowPath);
    return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
  }

  public static CThostFtdcMdApi CreateFtdcMdApi() {
    long cPtr = jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_CreateFtdcMdApi__SWIG_3();
    return (cPtr == 0) ? null : new CThostFtdcMdApi(cPtr, false);
  }

  public static String GetApiVersion() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_GetApiVersion();
  }

  public void Release() {
    jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_Release(swigCPtr, this);
  }

  public void Init() {
    jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_Init(swigCPtr, this);
  }

  public int Join() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_Join(swigCPtr, this);
  }

  public String GetTradingDay() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_GetTradingDay(swigCPtr, this);
  }

  public void RegisterFront(String pszFrontAddress) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_RegisterFront(swigCPtr, this, pszFrontAddress);
  }

  public void RegisterNameServer(String pszNsAddress) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_RegisterNameServer(swigCPtr, this, pszNsAddress);
  }

  public void RegisterFensUserInfo(CThostFtdcFensUserInfoField pFensUserInfo) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_RegisterFensUserInfo(swigCPtr, this, CThostFtdcFensUserInfoField.getCPtr(pFensUserInfo), pFensUserInfo);
  }

  public void RegisterSpi(CThostFtdcMdSpi pSpi) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_RegisterSpi(swigCPtr, this, CThostFtdcMdSpi.getCPtr(pSpi), pSpi);
  }

  public int SubscribeMarketData(String[] ppInstrumentID, int nCount) {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_SubscribeMarketData(swigCPtr, this, ppInstrumentID, nCount);
  }

  public int UnSubscribeMarketData(String[] ppInstrumentID, int nCount) {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_UnSubscribeMarketData(swigCPtr, this, ppInstrumentID, nCount);
  }

  public int SubscribeForQuoteRsp(String[] ppInstrumentID, int nCount) {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_SubscribeForQuoteRsp(swigCPtr, this, ppInstrumentID, nCount);
  }

  public int UnSubscribeForQuoteRsp(String[] ppInstrumentID, int nCount) {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_UnSubscribeForQuoteRsp(swigCPtr, this, ppInstrumentID, nCount);
  }

  public int ReqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID) {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_ReqUserLogin(swigCPtr, this, CThostFtdcReqUserLoginField.getCPtr(pReqUserLoginField), pReqUserLoginField, nRequestID);
  }

  public int ReqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID) {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_ReqUserLogout(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, nRequestID);
  }

  public int ReqQryMulticastInstrument(CThostFtdcQryMulticastInstrumentField pQryMulticastInstrument, int nRequestID) {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcMdApi_ReqQryMulticastInstrument(swigCPtr, this, CThostFtdcQryMulticastInstrumentField.getCPtr(pQryMulticastInstrument), pQryMulticastInstrument, nRequestID);
  }

}