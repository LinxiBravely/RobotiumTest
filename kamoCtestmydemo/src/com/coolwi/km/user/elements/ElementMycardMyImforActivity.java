package com.coolwi.km.user.elements;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class ElementMycardMyImforActivity {
	private Solo solo;
	private TextView information_name_name;
	private TextView information_mail_name;
	private TextView information_birthday_name;
	private TextView information_title_tv;
	private LinearLayout information_2_title_iv_r;
	
	//∏ˆ»À–≈œ¢
	private EditText  information_2_ed;
	private ImageView information_2_iv;
	private ImageView information_2_title_iv_f;
	//” œ‰
	private EditText information_4_ed;
	private ImageView information_4_iv;//«Â≥˝” œ‰ ‰»Î
	private TextView information_4_title_tv;
	private LinearLayout information_4_title_iv_r;
	private LinearLayout information_4_title_iv_f;
	
	//…˙»’
	private TextView information_5_title_tv;
	private LinearLayout information_5_title_iv_r;
	private LinearLayout information_5_title_iv_f;
	//private TextView information_2_iv_b;
	private View wheelView2;
	private View wheelView4;
	public ElementMycardMyImforActivity(Solo solo){
		this.solo=solo;
	}
	public View clickById(String id) throws Exception{  	    
	    Activity act=solo.getCurrentActivity();//ÔøΩÔøΩ»°ÔøΩÔøΩ«∞Activity  
	    int  id1=act.getResources().getIdentifier(id, "id", solo.getCurrentActivity().getPackageName());//ÔøΩÔøΩ»°id  
	    View view=solo.getView(id1);//ÔøΩ√µÔøΩView  
	    return view;
	} 
	public void initView(){
		try {
			information_name_name=(TextView)clickById("information_name_name");
			information_mail_name=(TextView)clickById("information_mail_name");
			information_birthday_name=(TextView)clickById("information_birthday_name");
			information_title_tv=(TextView)clickById("information_title_tv");
			information_2_title_iv_r=(LinearLayout)clickById("information_2_title_iv_r");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initViewMyName(){
		try {
			information_2_ed=(EditText)clickById("information_2_ed");
			information_2_iv=(ImageView)clickById("information_2_iv");
			information_2_title_iv_r=(LinearLayout)clickById("information_2_title_iv_r");
			information_2_title_iv_f=(ImageView)clickById("information_2_title_iv_f");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void initViewMyEmail() {
		// TODO Auto-generated method stub
		try {
			information_4_ed=(EditText)clickById("information_4_ed");
			information_4_iv=(ImageView)clickById("information_4_iv");
			information_4_title_tv=(TextView)clickById("information_4_title_tv");
			information_4_title_iv_r=(LinearLayout)clickById("information_4_title_iv_r");
			information_4_title_iv_f=(LinearLayout)clickById("information_4_title_iv_f");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private void initViewMyBirthday() {
		// TODO Auto-generated method stub
		try {
			information_5_title_tv=(TextView)clickById("information_5_title_tv");
			information_5_title_iv_r=(LinearLayout)clickById("information_5_title_iv_r");
			information_5_title_iv_f=(LinearLayout)clickById("information_5_title_iv_f");
			wheelView2=(View)clickById("wheelView2");
			wheelView4=(View)clickById("wheelView4");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public LinearLayout getinformation_5_title_iv_r(){
		return information_5_title_iv_r;
		
	}
	public LinearLayout getinformation_5_title_iv_f(){
		return information_5_title_iv_f;
		
	}
	public TextView getinformation_5_title_tv(){
		return information_5_title_tv;
		
	}
	public View getwheelView2() {
		return wheelView2;
		
	}
	public View getwheelView4() {
		return wheelView4;
		
	}
	public TextView getinformation_name_name(){
		
		return information_name_name;
		
	}
	public TextView getinformation_mail_name(){
		
		return information_mail_name;
	}
	public TextView getinformation_birthday_name(){
		return information_birthday_name;
		
	}
	public TextView getinformation_title_tv(){
		return information_title_tv;
		
	}
	public EditText getinformation_2_ed(){
		return information_2_ed;
		
	}

	public ImageView getinformation_2_iv(){
		return information_2_iv;
		
	}
	public LinearLayout getinformation_2_title_iv_r(){
		return information_2_title_iv_r;
		
	}
	public ImageView getinformation_2_title_iv_f(){
		return information_2_title_iv_f;
		
	}
	public EditText getinformation_4_ed(){
		return information_4_ed;
		
	}
	public LinearLayout getinformation_4_title_iv_r(){
		return information_4_title_iv_r;
		
	}
	public LinearLayout getinformation_4_title_iv_f(){
		return information_4_title_iv_f;
	}
	
}