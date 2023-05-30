package objectRepository;

public class ObjectRepositary {
	public static String login_tb_client_id = "//*[@id='clientId']";
	public static String login_tb_username = "//*[@id=\"username\"]";
	public static String login_tb_password = "//*[@id=\"pwd\"]";
	public static String login_btn_submit = "//*[@id=\"btn\"]";
	public static String Search_box = "//*[@id='search-box']";
	public static String Search_box_val = "(//*[@id='name'])[1]";
	public static String Business_unit = "//*[@name='6008']";
	public static String Buissness_unit_168 = "//*[@id=\"link\"]/label";
	public static String Buissness_unit_val_168 = "//*[@id=\"f_6008\"]";
	public static String Buissness_unit_val_169= "//*[@id=\"f_6008\"]";
	public static String Business_unit1 = "/html/body/div[1]/app-root/app-home/div[2]/div/div/app-home-dashboard/app-page-container/div/div[2]/div/div/app-form-container/form/div[2]/app-generic-container[1]/app-number-control/div/div/input";
	public static String Product = "//*[@name=\"0898\"]";
	public static String Query = "//*[contains(text(),\"Query\")]";
	public static String maintain = "//*[contains(text(),'Maintain' )]";
	public static String submit = "//*[contains(text(),'Submit' )]";
	public static String productValue = "//*[@id=\"f_0898\"]";
	public static String Auth_Approved_MOTO_LTR = "//*[@id='f_7301']";
	public static String Auth_Approved_Overlimit_LTR = "//*[@id='f_7303']";
	public static String AUth_Approved_MOTO_OverLImit_LTR = "//*[@id='f_7305']";
	public static String Auth_Approved_LTR = "//*[@id='f_7307']";
	public static String Auth_DEclined_Invalid_PIN = "//*[@id='f_7309']";
	public static String Auth_Declined_Invalid_Try_Exceeded = "//*[@id='f_7311']";
	public static String Auth_Declined_Local_Only = "//*[@id='f_7313']";
	public static String Auth_Declined_Invalid_Exp_Date = "//*[@id='f_7315']";
	public static String Auth_Declined_Blocked_Card = "//*[@id='f_7317']";
	public static String Auth_Declined_Invalid_CVX = "//*[@id='f_7319']";
	
	public static String Auth_Reversal_Messages = "//*[@name=\"7321\"]";
	public static String Other_Non_Mon_Updates = "//*[@name=\"7323\"]";
	public static String Block_Code_Update = "//*[@name=\"7325\"]";
	public static String WSP_IDV_OTP = "//*[@name=\"7325\"]";
	public static String Apix_TXN_Ebanking = "//*[@name=\"7329\"]";
	public static String Real_Time_Payment_TXN = "//*[@name=\"7333\"]";
	public static String Quick_Redeem = "//*[@name=\"7331\"]";
	public static String Spend_Limit_Updated = "//*[@name=\"7353\"]";
	public static String Card_Ctls_upd = "//*[@name=\"7355\"]";
	public static String Spend_LIm_Decl = "//*[@name=\"7357\"]";
	public static String Card_ctls_decl = "//*[@name=\"7359\"]";
	public static String DGTL_PMT_OTP = "//*[@name=\"7338\"]";
	public static String Auth_DEcl_OTB = "//*[@name=\"7403\"]";
	public static String Auth_Decl_Generic = "//*[@name=\"7416\"]";
	public static String Prod_XFR_LTR_ID = "//*[@name=\"7418\"]";
	public static String Auth_Declined_SI_Hub = "//*[@name=\"8301\"]";
	public static String Falcon_Decline_LTR_ID = "//*[@name=\"8303\"]";
	public static String Inact_Card_LTR_ID = "//*[@name=\"8307\"]";
	public static String Advices_LTR_ID = "//*[@name=\"8311\"]";
	public static String SI_REG_LTR_ID = "//*[@name=\"8313\"]";
	public static String SI_EDIT_LTR_ID = "//*[@name=\"8315\"]";
	public static String SI_REG_REV_LTR_ID = "//*[@name=\"8317\"]";
	public static String SI_EDIT_REV_LTR_ID = "//*[@name=\"8319\"]";
	public static String SI_PRE_DEB_LTR_ID = "//*[@name=\"8321\"]";
	public static String CRD_ACTVTE_LTR_ID = "//*[@name=\"8323\"]";
	public static String CRD_EXP_DECLINE_LTR_ID = "//*[@name=\"8325\"]";
	public static String key_businessUnit = "(//*[@id='link']/label/text())[1]";
	public static String val_businessUnit = "//*[@id=\"f_6008\"]";
	public static String page1 = "//a[contains (text(), '01-Real Time SMS Alerts')]";
	//--keys
	public static String key_Auth_Approved_MOTO_LTR = "//*[contains(text(),\"Auth Approved LTR ID \")]";
	public static String key_Auth_Approved_Overlimit_LTR = "//*[contains(text(),'Auth Approved Over Limit LTR ID' )]";
	public static String key_AUth_Approved_MOTO_OverLImit_LTR = "//*[contains(text(),'Auth Approved Moto Over Limit LTR ID' )]";
	public static String key_Auth_Approved_LTR = "//*[contains(text(),'Auth Approved LTR ID' )]";
	public static String key_Auth_DEclined_Invalid_PIN = "//*[contains(text(),'Auth Declined Invalid PIN' )]";
	public static String key_Auth_Declined_Invalid_Try_Exceeded = "//*[contains(text(),'Auth Declined PIN Try Exceeded' )]";
	public static String key_Auth_Declined_Local_Only = "//*[contains(text(),'Auth Declined Local Only')]";
	public static String key_Auth_Declined_Invalid_Exp_Date = "//*[contains(text(),'Auth Declined Invalid Exp Date')]";
	public static String key_Auth_Declined_Blocked_Card = "//*[contains(text(),'Auth Declined Blocked Card')]";
	public static String key_Auth_Declined_Invalid_CVX = "//*[contains(text(),'Auth Declined Incorrect CVX')]";
//	
	public static String key_Auth_Reversal_Messages = "//*[contains(text(),'Auth Reversal Message')]";
	public static String key_Other_Non_Mon_Updates = "//*[contains(text(),'Other Non-Mon Updates')]";
	public static String key_Block_Code_Update = "//*[contains(text(),'Block Code Update')]";
	public static String key_WSP_IDV_OTP = "//*[contains(text(),'WSP IDV OTP')]";
	public static String key_Apix_TXN_Ebanking = "//*[contains(text(),'Apin Txn Ebanking')]";
	public static String key_Real_Time_Payment_TXN = "//*[contains(text(),'Real Time Payment Txn')]";
	public static String key_Quick_Redeem = "//*[contains(text(),'Quick Redeem')]";
	
	public static String key_Spend_Limit_Updated = "//*[contains(text(),'Spend lim upd')]";
	public static String key_Card_Ctls_upd = "//*[contains(text(),'Card Ctls upd')]";
	public static String key_Spend_LIm_Decl ="//*[contains(text(),'Spend lim Decl')]";
	public static String key_Card_ctls_decl = "//*[contains(text(),'Card Ctls Decl')]";
	public static String key_DGTL_PMT_OTP = "//*[contains(text(),'DGTL PMT OTP')]";
	public static String key_Auth_DEcl_OTB = "//*[contains(text(),'Auth Declined OTB')]";
	public static String key_Auth_Decl_Generic ="//*[contains(text(),'Auth Declined Generic')]";
	public static String key_Prod_XFR_LTR_ID = "//*[contains(text(),'Prod XFR LTR ID')]";
	public static String key_Auth_Declined_SI_Hub ="//*[contains(text(),'Auth Declined SI Hub')]";
	
	public static String key_Falcon_Decline_LTR_ID = "//*[contains(text(),'Falcon Decline LTR ID')]";
	public static String key_Inact_Card_LTR_ID = "//*[contains(text(),'Inact Card LTR ID')]";
	public static String key_Advices_LTR_ID ="//*[contains(text(),'Advices LTR ID')]";
	public static String key_SI_REG_LTR_ID ="//*[contains(text(),'SI REG LTR ID')]";
	public static String key_SI_EDIT_LTR_ID = "//*[contains(text(),'SI EDIT LTR ID')]";
	public static String key_SI_REG_REV_LTR_ID = "//*[contains(text(),'SI REG REV LTR ID')]";
	public static String key_SI_EDIT_REV_LTR_ID = "//*[contains(text(),'SI EDIT REV LTR ID')]";
	public static String key_SI_PRE_DEB_LTR_ID = "//*[contains(text(),'SI PRE DEB LTR ID')]";
	public static String key_CRD_ACTVTE_LTR_ID = "//*[contains(text(),'CRD ACTVTE LTR ID ')]";
	public static String key_CRD_EXP_DECLINE_LTR_ID ="//*[contains(text(),'CRD EXP DECLINE LTR ID')]";
	//---
	public static String Logout_down_click = "/html/body/div[1]/app-root/app-home/div[1]/div/nav/div[2]/ul/li[5]/app-right-sidebar/div/div[1]/div[3]/i";
	public static String Logout = "//*[@id=\"logOut\"]/div/div[1]";
	////*[@id="toggle"]/div[3]

}
