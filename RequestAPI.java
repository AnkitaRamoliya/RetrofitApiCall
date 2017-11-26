package com.oozeetech.bizdesk.retrofit;

import com.oozeetech.bizdesk.models.CommonResponse;
import com.oozeetech.bizdesk.models.LogoutRequest;
import com.oozeetech.bizdesk.models.changepassword.ChangePasswordRequest;
import com.oozeetech.bizdesk.models.chartdata.DashboardChartRequest;
import com.oozeetech.bizdesk.models.chartdata.DashboardChartResponse;
import com.oozeetech.bizdesk.models.login.LoginRegisterResponse;
import com.oozeetech.bizdesk.models.login.NormalLoginRequest;
import com.oozeetech.bizdesk.models.login.SocialLoginRequest;
import com.oozeetech.bizdesk.models.mybiz.AddNewBizRequest;
import com.oozeetech.bizdesk.models.mybiz.ConfirmMyBizRequest;
import com.oozeetech.bizdesk.models.mybiz.DeleteMyBizRequest;
import com.oozeetech.bizdesk.models.mybiz.GetBizDetailRequest;
import com.oozeetech.bizdesk.models.mybiz.GetBizDetailResponse;
import com.oozeetech.bizdesk.models.mybiz.GetMyBizRequest;
import com.oozeetech.bizdesk.models.mybiz.GetMyBizResponse;
import com.oozeetech.bizdesk.models.mystock.AddMyStockRequest;
import com.oozeetech.bizdesk.models.mystock.DeleteMyStockRequest;
import com.oozeetech.bizdesk.models.mystock.GetMyStockRequest;
import com.oozeetech.bizdesk.models.mystock.GetMyStockResponse;
import com.oozeetech.bizdesk.models.notification.GetNotificationRequest;
import com.oozeetech.bizdesk.models.notification.GetNotificationResponse;
import com.oozeetech.bizdesk.models.notification.SendNotificationRequest;
import com.oozeetech.bizdesk.models.notification.TestSendNotificationRequest;
import com.oozeetech.bizdesk.models.party.AddNewPartyRequest;
import com.oozeetech.bizdesk.models.party.GetPartyRequest;
import com.oozeetech.bizdesk.models.party.GetPartyResponse;
import com.oozeetech.bizdesk.models.payment.AddPaymentReceiptRequest;
import com.oozeetech.bizdesk.models.payment.DeletePaymentRequest;
import com.oozeetech.bizdesk.models.payment.GetPaymentOutstandingDetailRequest;
import com.oozeetech.bizdesk.models.payment.GetPaymentOutstandingDetailResponse;
import com.oozeetech.bizdesk.models.payment.GetPaymentOutstandingRequest;
import com.oozeetech.bizdesk.models.payment.GetPaymentOutstandingResponse;
import com.oozeetech.bizdesk.models.payment.GetTopOutStandingRequest;
import com.oozeetech.bizdesk.models.payment.GetTopOutStandingResponse;
import com.oozeetech.bizdesk.models.payment.PaymentDetailReportRequest;
import com.oozeetech.bizdesk.models.payment.PaymentReportRequest;
import com.oozeetech.bizdesk.models.payment.PaymentReportResponse;
import com.oozeetech.bizdesk.models.payment.SettlePaymentRequest;
import com.oozeetech.bizdesk.models.pricelist.GetPriceListRequest;
import com.oozeetech.bizdesk.models.pricelist.GetPriceListResponse;
import com.oozeetech.bizdesk.models.pricelist.GetPriceMasterDetailRequest;
import com.oozeetech.bizdesk.models.pricelist.GetPriceMasterDetailResponse;
import com.oozeetech.bizdesk.models.register.RegisterRequest;
import com.oozeetech.bizdesk.models.resetpassword.ResetPasswordRequest;
import com.oozeetech.bizdesk.models.setting.GetSettingRequest;
import com.oozeetech.bizdesk.models.setting.GetSettingResponse;
import com.oozeetech.bizdesk.models.setting.SetSettingRequest;
import com.oozeetech.bizdesk.models.setting.SetSettingResponse;
import com.oozeetech.bizdesk.models.updatemobile.CheckMobileNumberRequest;
import com.oozeetech.bizdesk.models.updatemobile.UpdateMobileRequest;
import com.oozeetech.bizdesk.models.updateprofile.UpdateProfileRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by PHP1 on 6/22/2017.
 */

public interface RequestAPI {

    @POST("/Register")
    Call<LoginRegisterResponse> postRegisterRequest(@Body RegisterRequest request);

    @POST("/SocialLogin")
    Call<LoginRegisterResponse> postSocialLoginRequest(@Body SocialLoginRequest request);

    @POST("/NormalLogin")
    Call<LoginRegisterResponse> postNormalLoginRequest(@Body NormalLoginRequest request);

    @POST("/UpdateMobile")
    Call<CommonResponse> postUpdateMobileRequest(@Body UpdateMobileRequest request);

    @POST("/UpdateProfile")
    Call<CommonResponse> postUpdateProfileRequest(@Body UpdateProfileRequest request);

    @POST("/CheckMobileNumber")
    Call<CommonResponse> postCheckMobileNumberRequest(@Body CheckMobileNumberRequest request);

    @POST("/ResetPassword")
    Call<CommonResponse> postResetPasswordRequest(@Body ResetPasswordRequest request);

    @POST("/GetSetting")
    Call<GetSettingResponse> postGetSettingRequest(@Body GetSettingRequest request);

    @POST("/SetSetting")
    Call<SetSettingResponse> postSetSettingRequest(@Body SetSettingRequest request);

    @POST("/ChangePassword")
    Call<CommonResponse> postChangePasswordRequest(@Body ChangePasswordRequest request);

    @POST("/Logout")
    Call<CommonResponse> postLogoutRequest(@Body LogoutRequest request);

    @POST("/DashboardChartData")
    Call<DashboardChartResponse> postDashboardChartRequest(@Body DashboardChartRequest request);

    @POST("/GetParty")
    Call<GetPartyResponse> postGetPartyRequest(@Body GetPartyRequest request);

    @POST("/AddNewParty")
    Call<CommonResponse> postAddNewPartyRequest(@Body AddNewPartyRequest request);

    @POST("/AddNewBiz")
    Call<CommonResponse> postAddNewBizRequest(@Body AddNewBizRequest request);

    @POST("/GetBizDetail")
    Call<GetBizDetailResponse> postGetBizDetailRequest(@Body GetBizDetailRequest request);

    @POST("/GetMyBiz")
    Call<GetMyBizResponse> postGetMyBizRequest(@Body GetMyBizRequest request);

    @POST("/ConfirmMyBiz")
    Call<CommonResponse> postConfirmMyBizRequest(@Body ConfirmMyBizRequest request);

    @POST("/DeleteMyBiz")
    Call<CommonResponse> postDeleteMyBizRequest(@Body DeleteMyBizRequest request);

    @POST("/GetPaymentOutstanding")
    Call<GetPaymentOutstandingResponse> postGetPaymentOutstandingRequest(@Body GetPaymentOutstandingRequest request);

    @POST("/GetPaymentOutstandingDetail")
    Call<GetPaymentOutstandingDetailResponse> postGetPaymentOutstandingDetailRequest(@Body GetPaymentOutstandingDetailRequest request);

    @POST("/AddPaymentReceipt")
    Call<CommonResponse> postAddPaymentReceiptRequest(@Body AddPaymentReceiptRequest request);

    @POST("/DeletePayment")
    Call<CommonResponse> postDeletePaymentRequest(@Body DeletePaymentRequest request);

    @POST("/SettlePayment")
    Call<CommonResponse> postSettlePaymentRequest(@Body SettlePaymentRequest request);

    @POST("/GetTopOutStanding")
    Call<GetTopOutStandingResponse> postGetTopOutStandingRequest(@Body GetTopOutStandingRequest request);

    @POST("/PaymentReport")
    Call<PaymentReportResponse> postPaymentReportRequest(@Body PaymentReportRequest request);

    @POST("/PaymentDetailReport")
    Call<PaymentReportResponse> postPaymentDetailReportRequest(@Body PaymentDetailReportRequest request);

    @POST("/GetNotification")
    Call<GetNotificationResponse> postGetNotificationRequest(@Body GetNotificationRequest request);

    @POST("/TestSendNotification")
    Call<CommonResponse> postTestSendNotificationRequest(@Body TestSendNotificationRequest request);

    @POST("/SendNotification")
    Call<CommonResponse> postSendNotificationRequest(@Body SendNotificationRequest request);

    @POST("/AddMyStock")
    Call<CommonResponse> postAddMyStockRequest(@Body AddMyStockRequest request);

    @POST("/GetMyStock")
    Call<GetMyStockResponse> postGetMyStockRequest(@Body GetMyStockRequest request);

    @POST("/DeleteMyStock")
    Call<CommonResponse> postDeleteMyStockRequest(@Body DeleteMyStockRequest request);

    @POST("/GetPriceList")
    Call<GetPriceListResponse> postGetPriceListRequest(@Body GetPriceListRequest request);

    @POST("/GetPriceMasterDetail")
    Call<GetPriceMasterDetailResponse> postGetPriceMasterDetailRequest(@Body GetPriceMasterDetailRequest request);
}
