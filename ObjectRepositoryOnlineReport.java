package objectRepository;

	public class ObjectRepositoryOnlineReport {

	    public String login_tb_username = "//*[@id=\"username\"]";
	    public String login_tb_password ="//*[@id=\"password\"]";
	    public String login_bt_login ="//*[@id=\"signOnButton\"]";
	    public String home_page_bt_tools="//*[@id=\"nav_tools\"]";
	       public String home_page_bt_online_report = "//a[contains(@href,'/OnlineReports/ReportList.asp') and @id='menu_link']";
	    public String report_date = "//*[@id=\"listDT\"]";
	    public String owner ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[1]/select";
	    public String viewer ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[3]/select";
	    public String bt_listbyowner ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[2]/input";
	    public String bt_listbyviewer="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[4]/input";
	    public String bt_refresh="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[5]/form/input[6]";
	    public String bt_all = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[1]";
	    public String no_data_found_in_all = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/h4";
	    public String bt_a ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[2]";
	    public String bt_b ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[3]";
	    public String bt_c ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[4]";
	    public String bt_d ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[5]";
	    public String bt_e ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[6]";
	    public String bt_f ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[7]";
	    public String bt_g ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[8]";
	    public String bt_h ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[9]";
	    public String bt_i ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[10]";
	    public String bt_j ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[11]";
	    public String bt_k ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[12]";
	    public String bt_l ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[13]";
	    public String bt_m ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[14]";
	    public String bt_n ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[15]";
	    public String bt_o ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[16]";
	    public String bt_p ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[17]";
	    public String bt_q ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[18]";
	    public String bt_r ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[19]";
	    public String bt_s ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[20]";
	    public String bt_t ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[21]";
	    public String bt_u ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[22]";
	    public String bt_v ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[23]";
	    public String bt_w ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[24]";
	    public String bt_x ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[25]";
	    public String bt_y ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[26]";
	    public String bt_z ="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]/tbody/tr/th[27]";
	    public String ch_show_file_names ="//*[@id=\"checkbox1\"]";
	    public String bt_alpha_fintech_download ="//*[@id=\"downloadOM003332.OMN\"]";
	    public String bt_alpha_fintech_download_ff ="//*[@id=\"downloadCTX_TERMSET_20191210.CSV\"]";
	    public String report_catagory = "//*[@id=\"DisplayTable\"]/tbody/tr[2]/td[2]/a";
	   public String owner_report_catagory = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[1]";
	    public String omni_report_catagory = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[1]";
	    public String description_report_catagory = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[3]/td[1]";
	    public String date_report_catagory = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[4]/td[1]";
	    public String file_size = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[6]/td[1]";
	    public String estimate_download_time = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[7]/td[1]";
	    public String file_name = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[8]/td[1]";
	    public String prefix_number = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr[5]/td[1]";
	    public String view = "//*[@id=\"view\"]";
	    public String download = "//*[@id=\"download\"]"; 
	    public String cancel = "//*[@id=\"cancel\"]";
	    public String institution_name = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[1]/tbody/tr[2]/td[2]/b";
	    public String report_owner = "//*[@id=\"DisplayTable\"]/tbody/tr[1]/td[1]/b";
	    public String report_owner_firefox = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[4]/tbody/tr[1]/td[1]/b";
	    public String report_catagory1 = "//tbody/tr[1]/td[2]/b[1]";
	    public String prefix = "//*[@id=\"DisplayTable\"]/tbody/tr[1]/td[3]/b";
	    public String title = "//*[@id=\"DisplayTable\"]/tbody/tr[1]/td[5]/b";
	    public String checkbox = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[1]/tbody/tr[3]/td[3]/input";
	    public String filename_column = "//*[@id=\"dvFileNameHeader\"]";  
	    public String filename_column_firefox = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[4]/tbody/tr[1]/td[4]/b";
	    public String downloadReport = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[4]/tbody/tr[2]/td[6]/input";
	    public String logout = "/html/body/table[1]/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr/td[6]/a/img";
	    public String connect = "/html/body/table[1]/tbody/tr[2]/td/table/tbody/tr/td[1]/a/img";
	    public String refresh = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[2]/tbody/tr[2]/td[5]/form/input[6]";
	    public String onlinereport = "/html/body/table[2]/tbody/tr/td/table/tbody/tr[1]/td[6]/table/tbody/tr[4]/td/a/h4";
	    public String scroll1 = "//*[@id=\"DisplayTable\"]/tbody/tr[13]/td[1]";
	    public String scroll2 =  "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[4]/tbody/tr[26]/td[1]";
	    public String scroll3 = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[4]/tbody/tr[76]/td[5]";
	    public String scrollFirefox = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[4]/tbody/tr[53]/td[5]";
	    public String checkboxFirefox = "//*[@id=\"checkbox1\"]";
	    public String scroll1Firefox = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/p";
	    public String scroll2Firefox = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[4]/tbody/tr[40]/td[1]";
	    public String moduleBox = "/html/body/table[2]/tbody/tr/td/table/tbody/tr[1]/td[6]/table/tbody/tr[4]/td/a/h4";
	    public String All_atoz_tble="/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[3]";
	    public String link = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/table[4]/tbody/tr[2]/td[2]/a";
	    public String bt_download1="//*[@id=\"downloadOM003332.OMN\"]"; 



	}

